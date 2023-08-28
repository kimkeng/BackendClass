package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
    dbconfig db = null;
    PreparedStatement ps = null;
    public join() {
    	
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id").intern();
		String name = request.getParameter("name").intern();
		String pw = request.getParameter("pw").intern();
		String mobile = request.getParameter("mobile").intern();
		String tel = request.getParameter("tel").intern();
		String email = request.getParameter("email").intern();
		
		PrintWriter pwr = response.getWriter();	//스크립트 출력을 위해
		if(id=="" || name=="" || pw=="" || tel=="" || email=="") {
			pwr.write("<script>"
					+"alert('정보가 전달되지 않았습니다.');"
					+"history.go(-1);"
					+"</script>");
		}else {
			try {
				this.db = new dbconfig();
				Connection con = this.db.dbinfo();
				//람다식 형태의 코드로 작성 -> ?(물음표) 사용
				String sql = "insert into shop values ("
						+ "'0',?,?,password(?),?,?,?,now(),'Y')";	//람다식 방식	
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, id);
				this.ps.setString(2, name);
				this.ps.setString(3, pw);
				this.ps.setString(4, mobile);
				this.ps.setString(5, tel);
				this.ps.setString(6, email);
				int call = this.ps.executeUpdate();
				String msg ="";
				if(call > 0) {
					msg = "정상적으로 가입이 완료 되었습니다.";					
				}else {
					msg = "가입이 원활하게 진행 되지 않았습니다.";
				}
				this.ps.close();
				con.close();
				
				pwr.write("<script>"
						+"alert('"+msg+"');"
						+"location.href='./login.html';"
						+"</script>");
			}catch(Exception e) {
				System.out.println("Database 정보 오류!!");
			}
		}
	}
}
