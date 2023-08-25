package javatest;

import java.util.Scanner;

public class db_test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문의 제목을 입력하세요");
		String subject = sc.nextLine();
		System.out.println("고객명을 입력하세요");
		String person = sc.nextLine();
		
		//password 무한loop로 사용법
		for(;;) {
			System.out.println("패스워드를 입력하세요");
			String pw = sc.nextLine();
			if(pw.length() < 6) {
				System.out.println("제발 6자리 입력");
			}else {
				break;
			}				
		}
		
		System.out.println("문의 내용을 입력하세요");
		String tests = sc.nextLine();
		System.out.println("작성이 완료 되었습니다.");
		sc.close();
	}
}
