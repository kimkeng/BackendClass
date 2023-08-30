package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// interface활용
public class java19 {

	public static void main(String[] args) {

			try {
			//각각의 별도로 적응되는 인스턴스
			/*
			new box7().dbconnect("hong", "a123456", "web");
			new box7().select("shop", "tiggersant");				  
			 */
				
			//하나의 객체를 이용하여 new 인스턴스 활용이 필요함
			box7 bx = new box7();
			bx.dbconnect("hong", "a123456", "web");
			bx.select("shop", "tiggersant");
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
}
//class 일때 new 인스턴스 활용, 단. interface일 때는 interface명으로  활용
class box7 implements setdb {
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public void select(String table, String dataid) {
		try {
			System.out.println(this.con);
			String sql = "select * from "+table+" where sid=?";
			this.ps = this.con.prepareStatement(sql);
			//this.ps.setString(1, table);	// 람다식 ?(물음표)를 쓰면 ''(따옴표)가 생겨서 오류걸림
			this.ps.setString(1, dataid);
			
			ResultSet rs = this.ps.executeQuery();//select는 ResultSet
		
			while(rs.next()) {
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("smobile"));
				System.out.println(rs.getString("stel"));
				System.out.println(rs.getString("semail"));
			}
			this.ps.close();
			this.con.close();
			
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
	@Override
	public void dbconnect(String user, String passwd, String db) throws Exception {
		this.con = setdb.info(user,passwd,db);	
	}
}
