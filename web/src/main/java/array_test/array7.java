package array_test;
import java.util.*;
// 2차 배열을 1차 배열로 합산

public class array7 {

	public static void main(String[] args) {
		new array7().test();
	}
	public void test() {
		int a[][] = {
				{1,3,5,7},
				{2,4,6,8}
		};
		int ea1 = a.length;	//2
		int ea2 = a[0].length;	//4
		int make = ea1 * ea2;	//해당 배열의 전체 갯수를 파악하기 위한 공식
		int b[] = new int[make];	//2차배열을 1차배열로 병합하기 위한 빈 배열값
		int count = 0;	//배열 배정번호
		
		for(int i = 0; i<ea1; i++) {	//배열 그룹 (2바퀴)
			for(int j=0; j<ea2; j++) {	//배열 데이터 (4바퀴)
				b[count] = a[i][j];	//해당 데이터를 빈 배열에 삽입
				count++;	//배열번호 +1씩 증가
				//System.out.print(a[i][j]);
			}
		}
		Arrays.sort(b); //배열 오름차순으로 정렬 (int여서 내림차순으로 못바꿈)
		//System.out.println(Arrays.toString(b));
		
		/*
		 	응용문제9
		 각 나라별 행복수치 관련 데이터 입니다. 해당 데이터를 1차배열로
		 가공하여 출력 되도록 합니다.
		 1번 Data : 대한민국, 일본, 중국, 베트남, 태국
		 2번 Data :  40, 35, 70, 55, 57
		 
		 병합된 결과값은
		 ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(57)"]
		 */
		/*	(X)
		Object ga[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{40,35,70,55,57}
		};
		Object na = ga.length;	//2
		Object da = ga[0].length;	//5
		for(int i = 0; i<ga[0].length; i++) { //5
			//System.out.println(Arrays.toString(ga[i]));
			for(int j = 0; j<ga.length;j++) { //2
				System.out.println(Arrays.toString(ga[j]));
				
			}
		}
		*/
		Object data[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{40,35,70,55,57}
		};
		Object newdata[] = new Object[data[0].length];
		
		int ww = 0;
		do {
			newdata[ww] = data[0][ww] + "(" + data[1][ww] + ")";
			ww++;
		}while(ww<data[0].length);
		
		System.out.println(Arrays.toString(newdata));
	}
}
