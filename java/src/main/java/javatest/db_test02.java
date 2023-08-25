package javatest;

import java.sql.*;
import java.util.*;

/*
 Java + Database 응용편1
 게시판을 작성하는 프로세서를 제작합니다.
 문의제목, 고객명, 패스워드는 6자리 이상, 문의 내용
 단, 패스워드는 암호화 하지 않고 제작합니다. 패스워드 6자리 이하 입력시 DB에 저장 안됩니다.
 */

public class db_test02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			dbclass db1 = new dbclass();
			ct = dbclass.aa();			
			System.out.println("입력");
			//System.out.println(ct.toString());
			System.out.println("제목");
			String subject1 = sc.nextLine();
			System.out.println("고객명");
			String subject2 = sc.nextLine();
			String subject3;
			do {
				System.out.println("패스워드 6자리 이상");
				subject3 = sc.nextLine();
				if(subject3.length()<6) {
					System.out.println("다시");
				}
			}while(subject3.length()<6);
			System.out.println("문의 내용");
			String subject4 = sc.nextLine();
			
			String insert = "insert into moon values ('0','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"',now())";
			
			PreparedStatement ps = ct.prepareStatement(insert);
			int oksign = ps.executeUpdate();	//SQL에 Query에 대한 값은 숫자로 처리
			if(oksign == 1) {	// 1 정상저장
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
				sc.close();
			}else{	// 0 비정상, 저장오류, sql문법오류, DB접속오류, 컬럼에 대한 범위오류
				System.out.println("SQL 문법오류로 인하여 저장 되지 않았습니다.");
			}
		}catch(Exception e) {
			System.out.println("에러");
		}
		
	}

}



class dbclass{
	public static Connection aa() throws Exception{
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "a123456";	
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url,db_user,db_pass);
				
		return con; 
	}
}