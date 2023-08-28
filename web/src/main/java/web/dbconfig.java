package web;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconfig {
	
	public static Connection dbinfo() throws Exception {
		String db_driver = "com.mysql.jdbc.Driver";	//5.1이하는 jdbc이고 높은버전은 cj써야함
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "a123456";
		
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
		return con;
	}
	
}
