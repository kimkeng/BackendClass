package javatest;
/* 초급 class + method 활용 (java02) */
public class java01 {

	public static void main(String[] args) {
		//java02 j2 = new java02();
		//j2.main(args); 	//이렇게 사용하나 main클래스 두개를 같이쓰지 않음
		abc a = new abc();	//즉시 실행 메소드도 작동을 하며, 객체 + 인스턴스
		//new abc();	//20
		a.aa = 10;	//해당 클래스에서 필드에 있는 변수의 값을 이관함
		a.bb = 20;
		a.cc = 30;
		a.data();	//일반 메소드 작동
		abc.data2();	//메모리 메소드를 로드
		
		System.out.println(a.number);	//외부 클래스에 있는 필드 변수값을 가져
		String result = a.data3(100,200);
		System.out.println(result);
		
		int call = a.data4("500", "500");	//return 숫자형
		System.out.println(call);
	}

}

