package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


/*
 응용편 Java + Database
 라이브러리 필수추가 : MysqlConnectJ (http://m) mysql검색
 */
public class db_test01 {
	//이거 다시 만들기
	public static void main(String[] args) {
		/*
		String times = new timezone().now_time(3);
		System.out.println(times);
		*/
		
		/*
		//0001-01-01 00:00:00;
		Date today = new Date();
		//System.out.println(today);
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat datetime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(datetime.format(today));
		*/
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			dbconfig db = new dbconfig();
			ct = db.info();
			//System.out.println(ct.toString());	//DB접속 확인
			System.out.println("제목을 입력하세요");
			String subject = sc.nextLine();	//Scanner에 입력된 내용값
			
			//DB문법 
			String insert = "insert into email values ('0','홍길동','hong@nate.com','"+subject+"','자바개어렵네','대구빡깨짐','사람잡겠네',now())";
			
			PreparedStatement ps = ct.prepareStatement(insert);	//SQL문법을 작업 준비과정
			/*
			ps.execute();	//select문법에만 사용
			ps.executeUpdate();	//insert, update, delete, alter, create
			*/
			
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
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
	}

}

class dbconfig{ //Database  접속 환경 설정 class
	//Connection : Interface 사용
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


