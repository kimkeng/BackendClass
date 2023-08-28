
package javatest;

import java.util.*;

public class home01 {
	public static void main(String[] args) {
		try {
			new home1().ru();
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
}
class home1{
	public static void ru()throws Exception{
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("개인정보 수집 및 이용동의 (1:Yes | 2:No)");
			int info = 0;
			info = sc.nextInt();
			if(info == 1) {
				System.out.println("동의 하셨습니다.");
			}else if (info == 2) {
				System.out.println("비동의");
				new home1().ru();
			}else {
				System.out.println("1번(Yes) 2번(No)");
				new home1().ru();
			}
			
			System.out.println("이메일 수집 및 이용동의 (1:Yes | 2:No)");
			int email = 0;
			info = sc.nextInt();
			if(info == 1) {
				System.out.println("동의 하셨습니다.");
			}else if (info == 2) {
				System.out.println("비동의");
				new home1().ru();
			}else {
				System.out.println("1번(Yes) 2번(No)");
				new home1().ru();
			}
			
			System.out.println("통합서비스 약관 이용동의 (1:Yes | 2:No)");
			info = sc.nextInt();
			if(info == 1) {
				System.out.println("동의 하셨습니다."+"\n");
			}else if (info == 2) {
				System.out.println("비동의");
				new home1().ru();
			}else {
				System.out.println("1번(Yes) 2번(No)");
				new home1().ru();
			}
			
			System.out.println("전체 동의 완료");
			break;
		}
		sc.close();
	}
}



