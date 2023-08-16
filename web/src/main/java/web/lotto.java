package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto")
public class lotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public lotto() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("no1");
		System.out.println(a);
		String b = request.getParameter("no2");
		System.out.println(b);
		String c = request.getParameter("no3");
		System.out.println(c);
		String d = request.getParameter("no4");
		System.out.println(d);
		String e = request.getParameter("no5");
		System.out.println(e);
		String f = request.getParameter("no6");
		System.out.println(f);
	}
}
