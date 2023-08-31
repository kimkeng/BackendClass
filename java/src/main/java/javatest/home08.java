package javatest;

public class home08 {

	public static void main(String[] args) {
		int good[] = {2000,3000,1500,2300,3200,1100,3300,4200,6100,4300};		
		int coun[] = {2,1,1,2,3,2,1,1,2,3};
		home8 hm = null;
		for(int i =0; i<good.length;i++) {
			hm = new home8(coun[i],good[i],i);
			hm.start();
		};
	}
}
class home8 extends Thread{	//class
	private int s = 0;
	int pu = 0;
	public home8(int count, int goods, int aa){	//생성자 메서드
		this.s = count * goods;
		this.pu = aa;
	}
	@Override
	public void run() {	//실행 메서드
		System.out.println(this.pu+1+"번 상품 가격 : "+this.s);
	}
}