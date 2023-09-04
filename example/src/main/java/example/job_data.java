package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/job_data.do")
public class job_data extends HttpServlet {
	PrintWriter pw = null;
	
	private static final long serialVersionUID = 1L;

    public job_data() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		this.pw = response.getWriter();
		
		try {
			String key = request.getParameter("key").intern();
			if(key == null || key.equals("")) {
				this.pw.write("key_error");
			}
			else if(key.equals("a1234")) {
				String user[][] = {
						{"서울","경기도","인천","세종","그 외 기타"},
						{"386","426","98","42","378"},
						{"295","344","75","29","311"},
						{"91","82","23","13","67"}
				};
				JSONObject jo = new JSONObject();
				JSONArray ja = new JSONArray();
				
				int w = 0;
				do {
				    JSONObject jo2 = new JSONObject();
				    int ww = 0;
				    while(ww < user.length) {	//4바퀴
				        if(ww == 0) {
				            jo2.put("user_name", user[ww][w]);
				        }
				        else if(ww == 1) {
				        	jo2.put("user_person", user[ww][w]);
				            
				        }else if(ww == 2) {
				        	jo2.put("nojob", user[ww][w]);
				        }else if(ww == 3) {
				        	jo2.put("yesjob", user[ww][w]);
				        }
				        ww++;
				    }
				    ja.add(jo2);
				    w++;
				}while(w < user[0].length);		//5바퀴
				jo.put("user_list", ja);
				this.pw.write(jo.toString());	
				this.pw.close();
			}
		}
		catch(NullPointerException n){
			this.pw.write("error");
		}
		catch(Exception e) {
			
		}
	}
}