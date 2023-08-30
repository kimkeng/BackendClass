package javatest;

//Interface 활용
//Interface 일반 메소드를 활용할 수 있음
public class java18 {

	public static void main(String[] args) {
		new box6().a1();
		new box6().b1();
		new box6().aa1();
	}

}
//extends => abstract , 외부 클래스를 로드할 때
//interface => implements 무조건 override를 활용해야 한다
class box6 implements inter01,inter02{
	
	@Override
	public void aa1() {
		
		inter01.super.aa1();
		//외부 클래스를 객체 및 인스턴스 생성 후 해당 메소드 호출 in interface
		inter01.zzz h = new inter01.zzz();
		h.aajj();
	}
	@Override
	public void a1() {
		System.out.println("문자열을 입력하세요");
		String text = this.sc.nextLine();
		System.out.println(text);
		System.out.println(this.level);
		System.out.println(this.name);	//inter01.java에 있는 전역변수 값을 호출
	}
	@Override
	public void b1() {
		System.out.println(this.name);	//inter01.java에 있는 전영변수 값을 호출
	}
	@Override
	public String b2() {
		
		return null;
	}
}