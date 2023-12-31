package io;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 	숙제
 Scanner를 이용하여 총 10개의 숫자를 입력합니다.
 단, 1~100까지의 숫자만 입력이 가능하며, 100이상 숫자를 입력할 경우
 해당 콘솔로 "100까지의 숫자만 입력 가능합니다." 라고 메세지가 출력 되어야 합니다.
 무조건 10개의 숫자를 받아야 하며, 해당 숫자는 모두 data_num.txt 파일로 저장되어야 합니다.
 힌트) 무한반복 사용 및 counting 을 이용해야 함
 */
public class file18 {

	public static void main(String[] args) {
		try {
			new data().abc();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
class data {
	Scanner sc = null;
	FileWriter fw = null;
	
	public void abc() throws Exception {
		/*
		Path data4 = Paths.get("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		Files.createFile(data4);
		*/
		this.sc = new Scanner(System.in);
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data_num.txt",true);
		int w = 0;
		int num = 0;
		while(w<10) {
			if(num < 100) {
				break;				
			}else {
				this.fw.write(num + "\n");
			}
			w++;
		}
		this.fw.close();
		this.sc.close();
	}
}
