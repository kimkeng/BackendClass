package web;

import java.io.IOException;

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
		Part file = request.getPart("bf");
		System.out.println(file.getName());	//db 컬럼명
		System.out.println(file.getSize());	//파일 사이즈	파일이 없을때는 0
		System.out.println(file.getContentType());	//파일타입 확인
		System.out.println(file.getSubmittedFileName());	//파일명
		//System.out.println(file.getHeaderNames());	//
		String filenm = file.getSubmittedFileName().intern();
		if(filenm == "") {
			System.out.println("첨부파일 없음");
		}else {
			System.out.println("첨부파일이 있음");
		}
	}

}
