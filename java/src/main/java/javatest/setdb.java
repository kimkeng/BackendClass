package javatest;

import java.sql.Connection;
import java.sql.DriverManager;

//java19번에 활용

//DB활용 인터페이스 및 각종 문법
public interface setdb {
	//해당 필드에 사용되는 변수는 final형태로 상수화 되어버리는 상황입니다.
	
	public void dbconnect(String user, String passwd,String db) throws Exception;
	public void select(String table ,String dataid);
	
	/*
	public void delect(int idx);
	public void update(String dataid,int idx);
	public void insert(String[]  a);
	*/
	
	public static Connection info(String user,String passwd,String db) throws Exception{
		String db_driver = "com.mysql.jdbc.Driver";	//거꾸로 읽어 Driver.jdbc.mysql.com
		String db_url = "jdbc:mysql://localhost:3306/"+db;
		String db_user = user;
		String db_pass = passwd;
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
}
