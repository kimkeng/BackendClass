package web;

import java.io.*;
import java.util.*;

/*
 숙제
 user_tel.txt 파일을 로드 후 해당 사용자에 맞게 전화번호가 등록 되도록
 배열화 하여 콘솔로 출력 되도록 합니다.
 단, cms_db.txt로 해당 내용이 저장 되어야 합니다.
 결과 : 
 홍길동(01011245564)
 김유신(01020041004)
 */

public class file03 {

	public static void main(String[] args) {
		try {
			new homework().abc();
		}catch(Exception e) {
			
		}
	}

}
class homework {
	FileReader fr = null;
	BufferedReader br = null;
	ArrayList<String> al = null;
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.fr = new FileReader(url);
		//System.out.println(url);
		this.br = new BufferedReader(this.fr);
		//System.out.println(br);
		this.al = new ArrayList<String>();
		String data = null;
		int count = 1;
		while() {
			
		
			this.al.add(data);
		}
	}
}