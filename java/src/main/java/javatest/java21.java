package javatest;

//thread를 이용하여 결과값을 돌출하는 프로세서를 작성하시오
/*
 응용문제 1
 데이터가 다음과 같이 있습니다.
 10 5 19 22 13 6 4
 해당 Thread에 데이터를 하나씩 대입합니다.
 단, 결과값 형태는 다음과 같습니다.
 10 데이터 입력되면 1 ~ 10 모두 더한 결과값 출력
 5데이터 입력하면 1~5 모두 더한 결과값 출력
 19 데이터 입력되면 1~19 모두 더한 결과값 출력 형태로
 각각의 배열 데이터값 범위만큼 더하여 결과값을 출력 합니다.
 */
public class java21 {

	public static void main(String[] args) {
		int a[] = {10,5,19,22,13,6,4};
		int ea = a.length;	//배열갯수
		int ww = 0;
		plus ps = null;
		while(ww<ea) {
			ps = new plus(a[ww]);	//각각의 배열값을 순서대로 메소드에 전달
			ps.start();	//Thread run 메소드를 실행
			ww++;
		}
	}
}
class plus extends Thread{
	private int w = 1;	//해당 class를 호술 시 새롭게 인스턴스가 만들어 지므로 초기값이 같은 상황임
	private int total = 0;	//모두 합한값
	public int num = 0;
	
	//배열에 각각의 값을 해당 메소드가 전달 받음
	public plus(int num) {	//해당 값에 맞춰서 모두 더하는 값
		this.num = num;	//인자값을 다른 메소드에서 사용하기 위함 (setter)
		while(this.w <= num) {
			this.total += this.w;
			this.w++;
		}
	}
	@Override
	public void run() {	//결과만 출력
		System.out.println("1 ~ "+this.num+" 결과값 : " + this.total);
	}
}