package array_test;
//foreach문 : 무조건 배열에만 사용하는 반복문 (JAVA8번대에 나옴)

public class array3 {

	public static void main(String[] args) {
		new array3().test();
	}
	public void test() { //foreach는 배열과 자료형이 같아야 한다.
		/*
		 foreach는 배열값을 이용하여 범위할당 한 만큼만 반복적으로 사용하는 문법이다.
		 주의사항 : 배열 자료형과 foreach에 사용하는 자료형을 동일하게 설정해야 한다.
		 */
		String user[] = {"홍길동","김유신","장보고","유관순"};
		
		for(String f : user){
			//System.out.println(f);
		}
		
		
		
		/*
		 응용문제4
		 foreach를 이용하여 다음 배열 데이터의 값을 모두 곱한 결과값을 출력하시오.
		 5 10 15 20 25 30 35
		 */
		/* (O)
		int a[] = {5,10,15,20,25,30,35};
		int c = 1;
		for(int b : a) {
			//System.out.println(b);
			c *= b;
		}
		System.out.println(c);
		*/
		int no[] = {5,10,15,20,25,30,35};
		int sum = 1;
		for(int n : no) {
			//sum = sum*n;
			sum *= n;
			//System.out.println(n);
		}
		//System.out.println(sum);
		
		
		
		/*
		 	응용문제5
		 다음 리스트 숫자 중 짝수, 홀수 각각의 갯수를 출력하시오.
		 3 6 9 12 15 18 21 24 27 
		 */
		/* (X)
		int geng[] = {3,6,7,12,15,18,21,24,27};
		int b = 0;
		for(int a : geng) {
			if(a % 2 == 0) {
				System.out.println(a);
				//짝수
			}
			else {
				b = a;
				System.out.println(b);
				//홀수
			}
			//System.out.println();
		}
		*/
		int num[] = {3,6,9,12,15,18,21,24,27};
		int count1 = 0;
		int count2 = 0;
		for(int z : num) {
			if(z % 2 == 0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("짝수 :" + count1 + "홀수 :" + count2);
	}
}
