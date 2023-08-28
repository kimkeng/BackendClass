/*
package javatest;

import java.sql.*;
import java.util.*;

public class home04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection connec = null;
		try {
			home4 h4 = new home4();
			connec = h4.con();
			
			int pick=0;
			String user = null;
			String id = null;
			String pass = null;
			String name = null;
			String tel = null;
			String mail = null;
			String num = null;
			for(;;) {
				System.out.println("회원가입 형태");
				System.out.println("1.일반 고객 | 2.사업자 고객");
				user = sc.nextLine().intern();
				if(user=="1") {
					user = "일반 고객";
					System.out.println("일반 고객님 환영합니다.");
					System.out.println("회원 아이디");
					id = sc.nextLine();
					System.out.println("화원 패스워드");
					pass = sc.nextLine();
					System.out.println("회원 이름 및 회사명");
					name = sc.nextLine();
					while(true) {
						System.out.println("전화번호 또는 휴대전화번호(숫자만 입력)");
						try {
							tel = sc.nextLine();
							if(tel.length()>=11) {
								break;
							}else {
								System.out.println("제대로 좀 써");
							}							
						}catch(NumberFormatException ne) {
							System.out.println("숫자만");
						}
					}
					System.out.println("이메일 주소");
					mail = sc.nextLine();
					System.out.println("저장이 완료되었습니다.");
					break;
				}else if (user=="2") {
					user = "사업자 고객님";
					System.out.println("사업자 고객님 환영합니다.");
					System.out.println("회원 아이디");
					id = sc.nextLine();
					System.out.println("화원 패스워드");
					pass = sc.nextLine();
					System.out.println("회원 이름 및 회사명");
					name = sc.nextLine();
					while(true) {
						System.out.println("전화번호 또는 휴대전화번호(숫자만 입력)");
						try {
							tel = sc.nextLine();
							if(tel.length()>=11) {
								break;
							}else {
								System.out.println("제대로 좀 써");
							}							
						}catch(NumberFormatException ne) {
							System.out.println("숫자만");
						}
					}
					System.out.println("이메일 주소");
					mail = sc.nextLine();
					while(true){
						System.out.println("사업자 번호");
						num = sc.nextLine();
						if(num.length()==10) {
							break;
						}else {
							System.out.println("제대로 좀 써");
						}
					}
					System.out.println("저장이 완료되었습니다.");
					break;
				}
			}

			String insert = "insert into member_ship values ('0','"+user+"','"+id+"',password('"+pass+"'),'"+name+"','"+tel+"','"+mail+"','"+num+"',now())";
			PreparedStatement ps = connec.prepareStatement(insert);
			ps.executeUpdate();
			
			ps.close();
			connec.close();
			sc.close();
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
}
class home4{
	public Connection con()throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/web";
		String user = "hong";
		String pass = "a123456";
		
		Class.forName(driver);
		Connection co = DriverManager.getConnection(url,user,pass);
		return co;
	}
}
*/
