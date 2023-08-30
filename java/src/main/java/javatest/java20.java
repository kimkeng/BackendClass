package javatest;
//Thread 란? CPU가 일할 수 있는 공간 (메인 class는 사용 안함)
/*
 extends => 상속 (Thread)
 interface => Runnable 
 */
//Thread 란 1개의 cpu 공간
//MultiThread : 개발자가 1개 이상의 cpu 공간을 활용하는 사항
public class java20 {

	public static void main(String[] args) {
		int a = 10;
		int w = 0;
		//th1 t = new th1();
		th2 t2 = null;
		
		while(w<=a) {
			//System.out.println(w);
			/*
			int aa = t.start(w);
			System.out.println(aa);
			*/
			t2 = new th2(w);	//새로운 10개의 작업을 실행
			//t2.start();	//start는 Thread중에서 run 메소드를 실행시킴
			w++;
		}
		
		th3 t3 = null;
		Thread th = null;
		
		for(int aa = 0; aa<11;aa++) {
			t3 = new th3(aa);
			th = new Thread(t3);
			th.start();
		}
	}
}
/*
class  th1{	//일반 class
	int start(int a) {	//return 메소드
		return a;
	}
}
*/

class th2 extends Thread{	//Thread class 상속
	int b = 0;
	public th2(int a) {	//class 호출시 작동하는 메소드
		this.b = a;
	}
	/*
	@Override
	public void run() {	//Thread에서 제공되는 메소드(실행 메소드)
		System.out.println(this.b);
	}
	*/
}
class th3 implements Runnable{
	public int c = 0;
	public th3(int z) {
		this.c = z;
	}
	@Override
	public void run() {
		System.out.println(this.c);
	}
}

