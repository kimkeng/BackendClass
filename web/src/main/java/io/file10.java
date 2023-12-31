package io;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//InputStream + OutputStream + flush 사용법 (메모리)
/*
 InputStream 2개를 활성화 시 메모리 구조상 신규 인스턴스를 생성하지 않을 경우
 연속으로 Stream을 사용하지 못합니다.
 */
public class file10 {

	public static void main(String[] args) throws Exception {
				
		data7 aa = new data7();
		aa.abc();
		/*
		InputStream in = System.in;	//값을 적용
		OutputStream os = System.out;	//출력
		int a = in.read();	//입력된 사항을 읽어들임
		os.write(a);	//쓰기
		os.flush();
		os.close();	//OutputStream닫기
		in.close();	//InmputStream닫기
		*/
		
		/* Stream 은 2개이상 사용 불가능
		InputStream in2 = System.in;
		OutputStream os2 = System.out;
		int a2 = in2.read();
		os2.write(a2);
		os2.flush();
		os2.close();
		in2.close();
		*/
	}

}
class data7{
	public void abc() {
		String data = "abcd";
		byte[] b = data.getBytes();
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;
		
		try {
			os.write(b,0,b.length);
			os.flush();	//다음 텍스트나 영상 이미지같은데이터를 출력하기 위해 데이터를 비워주는 역활
			os.close();
		}catch(Exception e) {
			
		}
	}
}