package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//flush와 close의 차이
public class file17 {

	public static void main(String[] args) {
		try {
			new data15().abc();
		}catch(Exception e) {
			
		}
	}

}
class data15{
	public void abc() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = null;
		int n = Integer.parseInt(bf.readLine());
		int w = 0;
		while(w < n) {
			st = new String(bf.readLine());
			int a = Integer.parseInt(st);
			int b = Integer.parseInt(st);
			int sum = a+b;
			
			bw.write(sum + "\n");
			bw.flush();	//BufferedWriter 를 사용할 때만 flush를 이용합니다.
			w++;
		}
		bw.close();
	}
}