package javatest;
//if,ㅎ Scanner
public class java03 {	//메인클래스

	public static void main(String[] args) {	//실행메소드
		java3_data jd = new java3_data();	//인스턴스 생성
		jd.abc();
		new java3_data().abc();		//인스턴스 생성
		//java3_data jd2 = new java3_data();	//인스턴스 생성
		//jd2.abc();
		
		data1 d = new data1();	//java4에 있는 외부클래스
		d.abc("홍박사", 25, "a12345");	//해당 메소드를 로드 및 인자값
	}
}
//static과 일반 변수 선언에 따른 결과 차이
class java3_data{
	int a = 10;
	static int b = 10;
	
	public void abc() {
		/*
		System.out.println("a 값 : " + this.a);
		System.out.println("b 값 : " + this.b);
		this.a = this.a + this.a;
		this.b = this.b + this.b;
		System.out.println("a 값 : " + this.a);
		System.out.println("b 값 : " + this.b);
		*/
	}
}
