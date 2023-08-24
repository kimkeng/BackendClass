package web;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
		}catch(Exception error) {
			System.out.println(error);
		}
	}
}
class homework {
	FileReader fr = null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	ArrayList<String> al = null;
	public void abc() throws Exception { //Exception(에러코드)
		/*
		Path create_url = Paths.get("C:\\\\Users\\\\Charlie Brown\\\\Desktop\\\\eclipse_project\\\\example\\\\src\\\\main\\\\webapp\\\\cms_db.txt");
		Files.createFile(create_url);
		*/
		String newUrl = "C:\\Users\\Charlie Brown\\Desktop\\eclipse_project\\example\\src\\main\\webapp\\cms_db.txt";
		String url = "C:\\Users\\Charlie Brown\\Desktop\\eclipse_project\\example\\src\\main\\webapp\\user_tel.txt";
		this.fr = new FileReader(url);
		//System.out.println(url);
		this.fw = new FileWriter(newUrl);
		this.br = new BufferedReader(this.fr);
		//System.out.println(this.br);
		this.bw = new BufferedWriter(this.fw);
		this.al = new ArrayList<String>();
		String data = null;
		int sum = 0;
		while((data = this.br.readLine()) != null) {
			String newData[] = data.split("[|]");
			String realData = newData[0]; // + " (" + newData[1] + ")";
			realData += " (" + newData[1] + ")";
			System.out.println(realData);
			this.bw.write(realData + "\n");
			if(sum==1) {
				break;
			}
			sum++;
		}
		this.bw.close();
		this.br.close();
		this.fw.close();
		this.fr.close();
	}
};
