package javatest;
import org.apache.catalina.tribes.util.Arrays;

import app.app01;	//패키지명.public class명
//improt : 가져오는 기능, export : 내보내는 기능
/*
 1. 패키지가 다를 경우 public class 핸들링
 */
public class java16 {
	//app패키지 -> app01.java 파일과 연계 프로세서
	public static void main(String[] args) {
		//다른 패키지에 있는 public class 만 호출하여 가져올 수 있음
		app01 ap = new app01();
		ap.main(args);
		/*
		new abox().dataload();
		new bbox().dataload();
		new cbox().dataload();
		*/
		
		//배열로 클래스 로드
		ddd[] d = {new abox(), new bbox(), new cbox()};	//추상 클래스를 상속 받아서 처리하는 class를 배열화 하여 순차적으로 작동시키는 형태	
		
		/*
		for(ddd z : d) {
			System.out.println(z);
			z.dataload();
		}
		*/
		
		//d[0].dataload();
		
		/*
		 반복문으로 배열에 있는 class를 순차적으로 실행 시키는 상황
		 */
		int w = 0;
		while(w<d.length) {
			if(w != 1) {	//해당 클래스 외에 다른 class만 실행
				d[w].dataload();
			}
			w++;
		}
		
	}

}
//abstract : 추상 클래스 + 추상 메소드 (프레임워크에 활용)
/*
 public class가 없을 경우 abstract에서도 public으로 행들링 할 수 있으며,
 단. public class가 있응 경우 default로 abstract를 사용합니다.
 
 default(해당 파일에서 활용하는 변수선언), public(다른패키지, 다른클래스에서 사용가능), private(같은 클래스에서만 사용가능), protected(패키지가 같을 경우) : 접근에 해당됨
 */
abstract class ddd{
	public String userid = "guest";	//공용으로 사용하는 변수 (this를 모두 활용 가능)
	public String useremail = null;
	public int userpoint = 10;
	public abstract void dataload();
}
class abox extends ddd{

	@Override
	public void dataload() {
		this.userpoint = 2500;
		System.out.println(this.userpoint);
		System.out.println("abox 클래스");
	}
	
}
class bbox extends ddd{
	@Override
	public void dataload() {
		System.out.println("bbox 클래스");
	}
}
class cbox extends ddd{
	@Override
	public void dataload() {
		System.out.println("cbox 클래스");
	}
}