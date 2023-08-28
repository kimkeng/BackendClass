package javatest;
//random (난수) 함수 사용법
public class java15 {

	public static void main(String[] args) {
	//Math.random() : 랜덤함수 (기본 자료형 double)
		double no = Math.random() * 10;
		int no1 = (int)Math.ceil(Math.random() * 10);
		System.out.println(no1);
		int no2 = (int)Math.floor(Math.random() * 10);
		System.out.println(no2);
		int no3 = (int)Math.round(Math.random() * 10);
		System.out.println(no3);
		
	/*
	 응용문제 : 사용자가 보안코드 5자리를 입력해야 합니다.
	 보안코드 5자리가 출력 되도록 코드를 작성하시오.
	 */
		String security = "";
		for(int i = 0; i<=4;i++) {
			int n = (int)Math.floor(Math.random() * 10);
			security += n;
		}
		System.out.println(security);
	}

}
