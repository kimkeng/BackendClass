package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
//BufferedInputStream, BufferedOutputStream
public class file15 {
	
	public static void main(String[] args) {
		try {
			new data13().abc();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class data13{

	public void abc() throws Exception {
		
		String file = "E:\\project\\web\\src\\main\\webapp\\dog.jpg";
		//InputStream is = new FileInputStream(file);	//InputStram은 한번만 사용가능
		//FileInputStream fs = new FileInputStream(file);
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte filesize[] = new byte[bi.available()];
		int total = bi.read(filesize);
		
		if(total>50000) {
			System.out.println("이미지 제한 용량을 초과합니다.");
		}else {
			System.out.println("이미지 제한 용량 확인");
			OutputStream os = new FileOutputStream("dog1.jpg");
			os.write(filesize);
			os.flush();
			os.close();
			bi.close();
		}
		
		//System.out.println(Arrays.toString(filesize));
	}
}