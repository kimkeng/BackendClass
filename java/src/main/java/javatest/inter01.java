package javatest;

import java.util.Scanner;

public interface inter01 {
	String name = "홍박사";	//필드에 적용된 전역 변수
	String userid = "hong";
	Scanner sc = new Scanner(System.in);	//처음부터 객체와 인스턴스를 활용하여 api class를 생성시킴

	public void a1();	//일반 메소드
	default void aa1() {	//override 필수로 하지 않고 필요할 때만 로드하여 사용할 떄 default를 이용함 
		System.out.println(this.userid);
	}
	class zzz{	//interface안에 자식 클래스를 사용
		public void aajj() {	//자식 클래스 메소드
			System.out.println("외부 클래스 in interface");
		}
	}
}
