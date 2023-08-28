package javatest;

import java.util.Scanner;

public class java11 {

	public static void main(String[] args) {
		box1 b = new box1();
		//box1 b2 = new box1("홍박사");
		//box1 b3 = new box1(30);
		//box1 b4 = new box1("홍박사",26);
		
		b.box1();
		//b.box1("김유신");
	}

}
class box1{
	Scanner sc = null;
	public box1() {	//즉시실행 메소드 (construct)
		this.sc = new Scanner(System.in);
		System.out.println("즉시 실행 메소드1");
	}
	public box1(String a) {	//일반 메소드 구조가 다름
		System.out.println("즉시 실행 메소드2");
	}
	public box1(int a) {	//일반 메소드 구조가 다름
		System.out.println("즉시 실행 메소드3");
	}
	public box1(String a, int b) {	//일반 메소드 구조가 다름
		System.out.println("즉시 실행 메소드4");
	}
	
	
	String box2() {
		return null;
	}
	String box2(String a) {
		return null;
	}
	
	
	public void box1() {	//일반 메소드
		System.out.println("일반 메소드1");
		String result = this.sc.nextLine();
	}
	public void box1(String a) {	//일반 메소드
		System.out.println("일반 메소드2");
	}
}