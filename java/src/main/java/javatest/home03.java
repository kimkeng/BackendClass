package javatest;

import java.sql.*;
import java.util.*;

public class home03 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			home33 h33 = new home33();
			con = home33.surr();	
			Scanner sc = new Scanner(System.in);
			
			int ni;
			String sex = null;
			do {
				System.out.println("당신의 성별은?");
				System.out.println("1.남자 | 2.여자");
				ni=sc.nextInt();
				if(ni==1) {
					sex = "남자";
					System.out.println("1.남자");
					break;
				}else if (ni==2) {
					sex = "여자";
					System.out.println("2.여자");
					break;
				}
			}while(true);
			
			int na;
			String age = null;
			while(true) {
				System.out.println("\n"+"당신의 연령층은?");
				System.out.println("1.10대 | 2.20대 | 3.30대 | 4.40대 | 5.50대 이상");
				na = sc.nextInt();
				if(na==1) {
					age = "10대";
					System.out.println("10대");
					break;
				}else if(na==2) {
					age = "20대";
					System.out.println("20대");
					break;
				}else if(na==3) {
					age = "30대";
					System.out.println("30대");
					break;
				}else if(na==4) {
					age = "40대";
					System.out.println("40대");
					break;
				}else if(na==5) {
					age = "50대";
					System.out.println("50대 이상");
					break;
				}
			}
			
			int no;
			String level;
			for(;;) {
				System.out.println("\n"+"현재 기후 위기 단계 수준은?");
				System.out.println("1.매우 심각하다 | 2.심각하다 | 3.보통이다 | 4.심각하지 않은 편이다");
				no= sc.nextInt();
				if(no==1) {
					level = "매우 심각하다.";
					System.out.println("매우 심각하다.");
					break;
				}else if(no==2){
					level = "심각하다.";
					System.out.println("심각하다.");
					break;
				}else if(no==3){
					level = "보통이다.";
					System.out.println("보통이다.");
					break;
				}else if(no==4){
					level = "심각하지 않은 편이다.";
					System.out.println("심각하지 않은 편이다.");
					break;
				}
			}
			System.out.println("작성을 모두 완료했습니다.");
			
			String insert = "insert into sur values ('0','"+sex+"','"+age+"','"+level+"',now())";
			PreparedStatement ps = con.prepareStatement(insert);
			ps.executeUpdate();
			
			ps.close();
			con.close();
			sc.close();			
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
}
class home33{
	public static Connection surr() throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/web";
		String user = "hong";
		String pass = "a123456";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		
		return con;
	}
}
