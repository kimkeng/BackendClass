package javatest;

public class home07 {

	public static void main(String[] args) {
		int multi = 7;
		int gu = 10;
		int result = 0;
		gugudan gd = null;
		for(int i = 1; i<gu;i++) {
			result = multi*i;
			gd = new gugudan(result,i,multi);
			gd.start();
		}
	}

}
class gugudan extends Thread{
	private int a = 0;
	private int b = 0;
	private int c = 0;
	public gugudan(int math, int i ,int mulit) {
		this.a = math;
		this.b = i;
		this.c = mulit;
	}
	
	@Override
	public void run() {
		System.out.println(c + " X " + b + " = " + this.a);
	}
}
