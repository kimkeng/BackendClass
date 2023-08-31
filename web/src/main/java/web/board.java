package web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 1,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 100
)
//첨부파일을 받기위한 필수 조건


public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public board() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		dbconfig db = null;
		
		String title = request.getParameter("bt").intern();
		String id = request.getParameter("bi").intern();
		String pass = request.getParameter("bp").intern();
		Part file = request.getPart("bf");	//파일은 꼭 Part => getPart로 받는다
		String content = request.getParameter("texts").intern();
		
		///String filenm = file.getSubmittedFileName().intern();
		
		
		//날짜 => 파일업로드 같은 이름일 경우 덮어쓰는 현상을 막기 위해서 사용함
		Date time = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timetext = sf.format(time);
		
		//첨부파일 용량
		int filesize = (int)file.getSize();
		//첨부파일 저장경로
		String savepath = request.getServletContext().getRealPath("/board/upload/");
		System.out.println(savepath);
		
		//업로드시 바뀌는 파일명
		String filename = timetext+"_"+file.getSubmittedFileName();
		//실제 저장되는 형태
		String uploadfile = savepath + filename;
		//[Stream으로 첨부파일 처리]
		InputStream is = file.getInputStream();	//스트림으로 변환
		FileOutputStream fs = new FileOutputStream(uploadfile);
		
		
		if(filesize == 0) {
			//첨부파일이 없을 때의 SQL
			
		}else {
			//첨부파일이 있을 때의 SQL
			byte[] buf = new byte[is.available()];
			int size = 0;
			while((size = is.read(buf)) != -1) {
				fs.write(buf,0,size);
				fs.flush();
			}
			fs.close();
			is.close();
		}
		//경로지정 (DB에 저장되는 경로와 같음)
		String dbfile = "./upload/"+filename;
		
		//View로 출력 (view.jsp 전달)
		request.setAttribute("dbfile", dbfile);
		RequestDispatcher ds = request.getRequestDispatcher("./view.jsp");
		ds.forward(request, response);
		try {
			db = new dbconfig();
			Connection con = db.dbinfo();
			String insert = "insert into board values('0','"+title+"','"+id+"',password('"+pass+"'),'"+fs+"','"+content+"','0',now())";
			
			PreparedStatement ps = con.prepareStatement(insert);
			ps.executeUpdate();
			
			ps.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//System.out.println(file.getName());	//db 컬럼명
		//System.out.println(file.getSize());	//파일 사이즈	파일이 없을때는 0
		//System.out.println(file.getContentType());	//파일타입 확인
		//System.out.println(file.getSubmittedFileName());	//파일명
		//System.out.println(file.getHeaderNames());	//
		
	}

}
