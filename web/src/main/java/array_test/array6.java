package array_test;
import java.util.*;
//2차 배열
public class array6 {

	public static void main(String[] args) {
		new array6().test();

	}
	public void test() {
		/*
		1. 동적배열
		int a[] = new int[2];
		a[0] = 1;
		2. 정적배열
		int b[] = {1,2,3,4,5};
		*/
		
		String member[][] = {
				{"박초롬", "윤보미", "정은지", "김남주", "오하영"},
				{"31","29","33","31","32"}
		};
		int ea = member.length;
		//System.out.println(ea);
		int data_ea = member[0].length;
		//System.out.println(data_ea);
		
		/*
		 	응용문제7
		 다음 코드를 활용하여 결과값을 예시처럼 출력되도록 하시오.
		 박초롬
		 31
		 윤보미
		 29
		 정은지
		 33
		 */
		
		int f,ff;
		for(f=0;f<data_ea;f++) { //5
			for(ff=0;ff<ea;ff++) { //2
				//System.out.println(member[ff][f]);			
			}
		}
		
		/*
		 	응용문제8
		 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하여 결과값을
		 출력하는 코드를 작성하시오.
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 결과값은 90
		 */
		/* (X)
		int number[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int b1=0;
		for(int b=0; b<number.length;b++) {
			for() {
				
			}
		}
		*/
		int number[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int total = 0;	//합산 결과 변수값
		for(int a[] : number) {	//2차배열을 1차배열로 따로따로 구성
			for(int b : a) {	//위에서 구성된 1차배열에 있는 데이터를 분리
				if(b % 2 == 0) {//짝수 조건일 경우
					total += b;
				}
			}
		}
		//System.out.println(total);
		
		
		/* ---------------------------------------------------
		 	숙제
		 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를
		 더하여 짝수, 홀수 인지를 배열 결과 데이터로 재설정하여 출력하시오.
		 
		 Adata = 5 17 19 22 23
		 Bdata = 1 2  3  4  5
		 
		 결과출력예시)
		 ["짝수","홀수","짝수","짝수","짝수"]
		 ---------------------------------------------------- */
		/* (배열로 출력을 해야함 X)
		int adata[] = {5,17,19,22,23};
		int bdata[] = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i<adata.length;i++) {
			sum = adata[i]+bdata[i];
			if(sum % 2 == 0 ) {
				System.out.print("짝수 ");
			}
			else {
				System.out.print("홀수 ");
			}
		}
		*/
		int n[][] = {
				{5,17,19,22,23},
				{1,2,3,4,5}
		};
		int ea1 = n[0].length;
		int w = 0;
		int sum;	//int sum = 0;일때는  sum += 변수,  sum = sum + 변수
		String newdata[] = new String[ea1];
		String msg;
		
		while(w<ea1) {
			sum = n[0][w] + n [1][w];
			if(sum % 2 == 0) {	//짝수
				msg = "짝수";
			}
			else {	//홀수
				msg = "홀수";
			}
			newdata[w] = msg;	//빈 배열에 짝수, 홀수에 대한 결과 데이터를 삽입
			w++;
		}
		System.out.println(Arrays.toString(newdata));
	}
}
