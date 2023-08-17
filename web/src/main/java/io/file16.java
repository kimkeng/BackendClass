package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 InputStream > InputStreamReader > BufferedReader (O)
 InputStream > BufferedInputStream (O)
 FileinputStream > BufferedReader (X)
 FileWriter > FileOutputStream (X)
 */

//InputStreamReader, OutputStreamWriter(바이너리를 아스키로), BufferedReader, BufferedWriter
public class file16 {

	public static void main(String[] args) {
		try {
			new data14().abc();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class data14{
	//InputStreamReader : Stream => Reader 변환
	public void abc()throws Exception{
		String file = "E:\\project\\web\\src\\main\\webapp\\number.txt";	//이미지는 바이너리
		InputStream is = new FileInputStream(file);	//파일이여서 바이너리
		InputStreamReader ir = new InputStreamReader(is);	//Reader(아스키) 로 바꿔주는 과정
		BufferedReader br =new BufferedReader(ir);
		
		//System.out.println(br.readLine());
		String data;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();	
		ir.close();	
		is.close();
	}
}
