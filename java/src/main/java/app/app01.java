package app;

//javatest 패키지 -> java16.java 파일과 연계

/*
외부 패키지에서 외부 클래스까지 적용 하려면 public class에서 상속 받은 후 
해당 public class를 호출하면 외무 class까지 로드 하여 실행 시킬 수 있음
*/
public class app01 extends app1_box {	
	@Override
	public void abc() {
		super.abc();
	}
	public static void main(String[] args) {
		new app1_box().abc();
		System.out.println("외부 패키지 class 입니다.");
	}
}
class app1_box{		//패키지가 다른 외부 class는 직접적으로 호출하여 사용하지 못함
	public void abc() {
		System.out.println("외부 class 중 abc 메소드");
	}
}