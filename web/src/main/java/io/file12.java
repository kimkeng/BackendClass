package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//파일 복사 및 이동
public class file12 {

	public static void main(String[] args) {
		try {
			data10 d = new data10();
			d.abc();
		}catch(Exception e) {
			System.out.println("파일 복사 및 이동 코드 오류발생!!!!!");
		}
	}

}
class data10 {
	public void abc() throws Exception {
		/* 디렉토리 생성 */
		
		// createDirectories : 해당 디렉토리를 생성하는 메소드 입니다.
		// Paths : 디렉토리 만들곳(경로)
		/*
		Files.createDirectories(Paths.get("E:\\project\\web\\src\\main\\webapp\\test2"));
		*/
		
		/* 파일 복사 */
		/*
		//Files.copy(원본파일, 사본파일)
		//Path : interface를 이용하여 경로를 확인 후 객에체 저장을 시킴.
		 	
		Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\datalist.txt"); //얘가 원본
		Path data2 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.txt"); //얘가 사본
		Files.copy(data1,data2);
		*/
		
		/* 파일 삭제 */
		/*
		Path data3 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.txt");
		Files.delete(data3);
		*/
		
		/* 빈 파일 생성 */
		/*
		Path data4 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.json");
		Files.createFile(data4);
		*/
		
		/* 파일 이동 */
		/*
		//Files.move(원본위치, 이동할 위치);
		
		Path data5 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.json");	//현재 파일위치
		Path distory = Paths.get("E:\\project\\web\\src\\main\\webapp\\test2\\datalist.json");	//이동할 파일 위치
		Files.move(data5, distory);
		*/
	}
}