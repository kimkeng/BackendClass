package javatest;

import java.util.ArrayList;

//오버로딩, 오버라이드 (추상클래스, thread, interface, Network, I/O)
/*
 overloading : 자식 메소드에서 새로운 메소드를 정의하여 코드를 작성하는 형태 
 override : 부모 클래스에 있는 메소드를 상속 받아서 동일한 형태의 메소드 구조를 사용하여 코드를 작성하는 형태
 */

public class java12 {

	public static void main(String[] args) {
		box3 b = new box3();
		b.abc();
		b.abc("홍길동");
		b.abc("아이디","패스워드");
	}
}

class box2{
	public void abc() {
		System.out.println("부모 외부 내용 값");
	}
	public void abc(String a , String b) {
		System.out.println("추가 오버라이드 메소드 값");
	}
	public void abc(String a, int idx) {
		System.out.println("");
	}
	public void abc(String a, int tel, int number) {
		System.out.println("");
	}
}

class box3 extends box2{
	@Override	//부모 상속 받은 메소드를 조금이라도 인자값 변화 사용시 오버라이드는 사용하지 못함
	public void abc(String a, String b) {
		super.abc(a, b);
	}
	
	@Override
	public void abc() {
		super.abc();
		System.out.println("자식 내용 값");
	}
	
	/* 단독 메소드 부분 */
	public void abc(ArrayList<String> a) {
		
	}
	
	public void abc(String name) {	//오버로딩
		System.out.println("오버로딩에 사용되는 값");
	}
}






