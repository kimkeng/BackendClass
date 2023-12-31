package io;

import java.io.FileWriter;
import java.util.Scanner;
// Scanner을 이용한 파일쓰기 기능 활성화
public class file05 {
	
	//static main에는 this를 사용하지 못함
	/*
	 static 사용시 new 인스턴스를 호출시 새롭게 읽어 들이므로 기존에 있는 코드를 
	 인식 하지 못하는 상황이 발생함
	 */
	public static void main(String[] args) { //static은 this를 사용 못함 고로 외부클래스를 이용하는것
		try {
			//객체 생성
			FileWriter fw = null;
			Scanner sc = null;
			//인스턴스 생성
			fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\user.txt",true);
			sc = new Scanner(System.in);
			int f;
			for(f=0;f<3;f++) { // for(;;) 이건 for문의 무한 루프
				
				System.out.println("사용자 이름을 입력해 주세요?");
				String name = sc.nextLine().intern(); // "\n"은 br태그와 같음
				if(name == "exit") {
					break;
				}else {
					fw.write(name + "\n");					
				}
				
			}
			System.out.println("모든 데이터 내용이 저장 되었습니다.");
			sc.close();	//스케너를 닫고
			fw.close(); //파일을 닫는다
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("파일 오류발생!!!");
		}
	}
}
