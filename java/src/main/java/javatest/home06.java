package javatest;

import java.util.Scanner;

/*
 숙제.
 추상클래스 +중첩클래스를 이용하여 프로세서를 제작합니다.
 추상클래스에서는  father 라는 이름을 가지고 있으며,
 메소드는 f_method라는 이름을 가집니다.
 또한 변수도 u_name이라는 문자형 변수를 생성합니다.
 f_method에 문자형으로 인자값을 하나 받는 형태로 제작합니다.
 
 메인에서 Scanner를 이용하여 사용자 이름을 입력하는 프로세서를 구성합니다.
 구성 후 외부 클래스로 f_method로 값을 전달함.
 
 전달된 값을 자식 클래스에 전달하며, 해당 메소드에 다음과 같이 처리합니다.
 홍길동,이순신,유관순은 일반회원 입니다. 라고 출력을 하며,
 강감찬,장보고 는 실버회원 입니다. 라고 출력합니다.
 그 외에 사용자 이름을 입력시 "해당 사용자는 비회원 입니다." 라고 출력 되도록
 하시오.
 
 */
public class home06 {

	public static void main(String[] args) {
		 new child().f_method();
	}

}
abstract class father{
	public String member1[] = {"홍길동","이순신","유관순","강감찬","장보고","세균맨"};
	public String lv1[] = {"실버","일반","비"};
	public abstract void f_method();
}

class child extends father{
	Scanner sc = null;
	@Override
	public void f_method() {
		this.sc = new Scanner(System.in);				
		System.out.println("이름을 검색하여 주세요.");
		String value = this.sc.nextLine().intern();	
		if(value==member1[0] || value==member1[1] || value==member1[2] ) {
			System.out.println(value + "님은 " + lv1[1] + "회원 입니다.");
		}else if(value==member1[3] || value==member1[4] || value==member1[5]) {
			System.out.println(value + "님은 " + lv1[0] + "회원 입니다.");
		}else {
			System.out.println(value+"님은 "+lv1[2]+"회원 입니다.");
		}
	}
}