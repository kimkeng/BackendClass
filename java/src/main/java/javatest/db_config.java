package javatest;

import java.sql.*;
//database 기본정보 클래스
//db_test05.java에서 실행
public class db_config {
	public static Connection info() throws Exception{
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "a123456";
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		
		return con;
	}
}
