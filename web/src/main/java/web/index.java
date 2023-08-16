package web;
//Module 파트
public class index {
	//필드의 좋은점은 this 사용가능
	int sum = 0;
	
	public String test(String a, String b) {
		//Integer.valueOf는 true,false로 검토를 하고 정수로 변환함
		/*
		 Integer.valueOf (검토용이라 속도가 느림) : 문자를 숫자로 변환시 해당 값이 숫자인지 문자인지 검토 후 int로 변환을 설정
		 Integer.parseInt (속도가 월등히 빠름) : 문자를 숫자(int 형으로 변환)
		 */
		this.sum = Integer.valueOf(a) + Integer.parseInt(b);
		
		/*
			return매소드 자료형이 문자 이므로 결과값을 리턴시킬 경우
			숫자를 문자화 하여 반환함
		*/
		//return Integer.toString(this.sum); //toString 자주쓰는문법
		return String.valueOf(this.sum);
	}
	
	public String test2(int a, int b) {
		this.sum = a + b;
		double d = 21.5;
		int dd = (int)d; //casting 변환(형변환)
		
		return String.valueOf(this.sum);
	}
	
}
