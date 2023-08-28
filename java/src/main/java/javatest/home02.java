package javatest;

public class home02 {

	public static void main(String[] args) {
		try {
			new home2().math();
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
}
class home2{
	public void math()throws Exception {
		int a = 7;
		do {
			int b = 1;
			while(b<=5) {
				System.out.println(a+" x "+b+" = "+(a*b));
				b++;
			}
			a++;
		}while(a<=9);
	}
}
