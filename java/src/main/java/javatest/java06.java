package javatest;
/*
 반복문 for, while, do ~ while
 */
public class java06 {
	
	public static void main(String[] args) {
		new data3().abc();
	}

}
/*
 1~5까지 출력
 */
class data3{
	public void abc() {
		/*
		int f;
		for(f = 1; f <= 5; f++) {			
			System.out.println(f);
		}
		*/
		/*
		int w= 1;
		while(w<=5){
			System.out.println(w);
			w++;
		}
		*/
		/*
		int w = 1;
		do {
			System.out.println(w);
			w++;
		}while(w <= 5);
		 */
		
		/*
		 응용문제2.
		 해당 숫자를 역순으로 출력합니다.
		 10 ~ 1까지(while)
		 */
		/*
		int a = 10;
		while (a>0) {
			System.out.print(a+" ");
			a--;
		}
		*/
		
		/*
		 응용문제3.
		 구구단 9단 9*1 부터 9*9까지 결과값 출력
		 (do~while)
		 */
		/*
		int b = 1;
		int a = 9;
		do {
			int sum =  a * b;
			System.out.println(sum);
			b++;
		}while(b<=9);
		*/
		
		/*
		 응용문제4.
		 100 ~ 150까지 모든 수를 합한 결과값 출력
		 while문으로 제작
		 */
		/*
		int a = 100;
		int sum = 0;
		while(a<=150) {
			sum +=a;
			a++;
		}
		System.out.println(sum);
		*/
		
		/*
		 응용문제5.
		 100 ~ 150 까지 모든 수를 곱한 결과값 출력
		 for문으로 제작
		 */
		/*
		int z = 100;
		double sum = 1;
		for (z=100; z<=150; z++) {
			sum *=z;
		}
		System.out.println(sum);
		*/
		
		/*
		byte b = -128;	//byte : -128 ~ 127
		System.out.println(b);
		*/
	}
}