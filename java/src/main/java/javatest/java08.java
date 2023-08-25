package javatest;

import java.util.Scanner;

/*
 double loop 응용편 (do while + for)
 다음 결과값 처럼 출력되도록 하시오.
 9*1 = 9
 9*2 = 18
 9*3 = 27
 8*1 = 8
 8*2 = 16
 8*3 = 24
 7*1 = 7
 7*2 = 14
 7*3 = 21
 */
public class java08 {
	public static void main(String[] args) {
		/*
		 응용문제5
		 Scanner를 이용하여 다음과 같이 결과값이 나오도록 합니다.
		 "구구단 2단~9단까지 숫자를 하나 입력하세요 : "
		 사용자가 5를 입력시 
		 5*1 ~ 5*9=45 까지 출력
		 단, 메인메소드에서 입력을 받은 후 외부 클래스 메소드로 전송하여 출력합니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int gugu = sc.nextInt();
		new data5().abc(gugu);
	}

}
class data5{
	public void abc(int a){
		/*
		int w = 9;
		int i;
		do {
			for(i=1;i<=3;i++) {
				System.out.println(w*i);		
			}
			w--;
		}while(w>6);
		*/
		for(int i = 1 ; i<=9 ; i++) {
			a = 2;
			System.out.println(a+"x"+i+"="+(a*i));
		}
	}
}
