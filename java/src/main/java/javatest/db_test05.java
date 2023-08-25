package javatest;

import java.sql.Connection;

//외부 db정보 클래스를 로드하여 연결하기 (db_config.java)
public class db_test05 {

	public static void main(String[] args) {
		try {
			db_config db = new db_config();
			Connection con = db.info();
			System.out.println(con.toString());	//com.mysql.jdbc.JDBC4Connection@77a567e1 (접속완료됐다는 뜻)
		}catch(Exception e) {
			System.out.println("DB 접속오류");
		}
		
	}

}
