package io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//FileReader(원시), FileWriter(원시), CharArrayReader : 파일 읽기, 쓰기 (문서용) - 아스키
//Buffered, LineNumberReader : 메모리 영역

//Stream 이란 : 문서용, 이미지, 동영상, 오디오 (바이너리) -> 숫자
//FileinputStream, AudioinputStream, ObjectinputStream
//BufferedStream

//InputStream, OutputStream : 대분류
//FileinputStream, AudioinputStream, ObjectinputStream : 소분류

public class file9 {

	public static void main(String[] args) {
		try {
			//InputStream is = System.in;	//키보드에 대한 정보 받음
			//int code = is.read();	//해당 키를 입력시 ASCII코드로 인식하여 int로 변환
			//System.out.println(code);
			
			String a = "123456789";
			//String a = "ABCDE";
			//String a = "홍길동";
			byte[] b = a.getBytes();	//getBytes("언어패킷") - 문자를 byte단위로 변환
			System.out.println(Arrays.toString(b));
			OutputStream os = System.out;
			os.write(b,0,b.length); // os.write(객체, 배열시작번호 0, 배열 종료번호);
			//os.write(b);
			os.flush(); //사용하고 추가로 데이터를 넣기 위해 기존 데이터를 버려주는 역활
			os.close();
			
		}catch(Exception e) {
			System.out.println("코드 오류발생!!!!!!!!!!!!!!!!!!!");
		}
	}

}
