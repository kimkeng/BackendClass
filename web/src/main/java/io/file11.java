package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.tools.FileObject;

//Stream으로 파일로드 하는 방식 + 쓰기
public class file11 {

	public static void main(String[] args) {
		try {
			new data8().abc();
		}catch(Exception e) {
			System.out.println("소스 코드 및 경로 시실패!!");
		}
	}

}

class data8{
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		//System.out.println(is.available());	//available() : 파일의 용량 체크
		byte temp[] = new byte[is.available()]; // 용량상관없이 모두 temp에 파일을 쏟아부어라
		//byte temp[] = new byte[1024*10]; // 1024byte == 1kilobate, [1024*10] = 10kilobyte, [1024*1024*1] = 1MegaByte
		//int ea = is.read(temp);	//파일 용량 체크
		//System.out.println(ea);
		is.read(temp); //read()는 파일을 바이너리형대로 읽기 위해 사용하는 메소드
		String data = new String(temp,"UTF-8");
		System.out.println(data);
		is.close();
		try {
			data9 z = new data9();
			z.zzz();
		}catch(Exception e) {
			System.out.println("데이터 쓰기 오류 발생");
		}
	}
}
class data9{
	public void zzz() throws Exception {
		String test = "\n연습입니다.";
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt",true);
		byte[] data = test.getBytes();	//문자열을 byte 단위로 변환(바이너리)
		os.write(data);
		os.flush();
		os.close();
	}
}