package web;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class file01 {

	public static void main(String[] args) {
		try {
			new box_office().abc();
		}catch(Exception e) {
			System.out.println("파일 로드 오류!");
		}
	}

}
/* 
 Scanner를 이용하여 다음과 같이 실행 되도록 합니다.
 1. 개봉작 리스트 출력, 2.프로그램 종료
 
 1번 입력 후 엔터 실행시 영화 리스트가 출력 되어야 하며,
 2번 입력시 프로그램을 강제 종료 합니다.(System.exit)
 */
class box_office{
	Scanner sc = null;
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\movie_db.txt";
		InputStream is = new FileInputStream(url);
		this.sc = new Scanner(System.in);
		System.out.println("1. 개봉영화 리스트 || 2. 종료 ?");
		int no = sc.nextInt();	//int는 intern을 쓰지 않아도 됨
		
		if(no == 1) {
			//System.out.println(is.available());
			//해당 모든 파일의 용량을 byte 배열로 변환
			byte temp[] = new byte[is.available()];
			is.read(temp);	//변환된 배열값을 모두 읽어들임
			String data = new String(temp);	//해당 배열을 문자화 하여 적용
			System.out.println(data);
		}else if(no == 2){
			System.out.println("프로그램 종료");
			System.exit(0);
		}else {
			System.out.println("다시 입력해");
			return;
		}
		is.close();
		this.sc.close();
	}
}