package io;

import java.io.FileWriter;
import java.util.Scanner;

/*
 	응용문제 1
 Scanner를 이용하여 사용자가 입력한 숫자를 모두 저장 되도록 합니다.
 "1~100까지의 숫자 중 한가지를 입력하세요?"
 단, 한 줄당 하나의 숫자만 입력되도록 하며, quit라는 명령어를 입력시
 더 이상 프로세서는 작동 되지 않도록 합니다.
 저장 파일명은 number.txt 로 저장 되고록 하시오. 
 */
public class file6 {

	public static void main(String[] args) {
		try {
			data4 da = new data4();
			da.abc();
		}catch(Exception e) {
			System.out.println("해당 메소드 오류!!");
		}
	}
}

class data4 {
	Scanner sc = null;
	FileWriter fw = null;
	
	public void abc() throws Exception{
		this.sc = new Scanner(System.in);
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt",true);
		while(true) {
			System.out.println("1~100까지의 숫자를 하나 입력하세요?");
			String num = this.sc.next().intern();	//quit를 사용하기 위해 String으로 처리
			if(num == "quit") {
				break;
			}
			else {
				if(Integer.parseInt(num) > 100) {	//100이상 입력시
					System.out.println("숫자는 제발 100이하로 입력해라");
				}else {	//100이하로 입력시 해당 파일로 값을 저장
					this.fw.write(num + "\n");	//저장
				}
			}
		}
		this.fw.close();	//파일 저장 클로즈 (close를 안할 경우 해당 파일 오픈 되어 있으므로 저장되지 않는 상황이 발생)
		this.sc.close();	//스케너 저장 클로즈
		System.out.println("모든내용 저장완료");
	}
}