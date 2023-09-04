package example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class file02 {
/*
 응용문제 2.
 해당 buffer.txt의 파일을 읽어 들인 후 배열로 내용을 저장 후
 짝수 배열값만 출력 시키는 프로세서를 제작하시오.
 
 결과)
 출력확인 하는 중입니다...
 JAVA BufferReader 힘듦..
 */
	public static void main(String[] args) {
		try{
			new notice().abc();
		}catch(Exception e) {
			System.out.println("파일오류");
		}
	}

}
class notice{
	//Reader -> BufferedReader -> ArrayList		//byte(X)아스키여서
	//Stream -> BufferedStream -> ArrayList		//byte(O)바이너리여서
	//Stream -> BufferedStreamReader -> Reader -> ArrayList		//byte(O)바이너리여서
	
	//InputStream is = null; (X)
	FileReader fr = null;
	BufferedReader br = null;
	ArrayList<String> ar = null;
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.fr = new FileReader(url);
		//System.out.println(this.fr.read());
		this.br = new BufferedReader(this.fr);
		//System.out.println(this.br.readLine());
		this.ar = new ArrayList<String>();
		String data = null;
		int count = 1;
		while((data = this.br.readLine()) != null) {
			if(count%2 == 0) {
				this.ar.add(data);				
			}
			count++;
		}
		System.out.println(this.ar);
		this.br.close();
		this.fr.close();
		
		
		/* (X)
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.is = new FileInputStream(url);
		byte temp[] = new byte[this.is.available()];
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
	
		//ar2.add(temp);
		//System.out.println(url);
		this.is.read(temp);
		String data = new String();
		//String data = new String(temp).intern();
		
		//System.out.println(data);
		
		if(ar2.size()%2 == 0) {
			System.out.println(ar2);
		}else {
			System.out.println("오류");
		}
		*/
	}
}
