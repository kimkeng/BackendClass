package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

//Buffered 사용하기
public class file07 {

	public static void main(String[] args) {
		try {
			data5 d = new data5();
			d.abc();
		}catch(Exception e){
			System.out.println("파일 오류 발생!!");
		}
	}
}

class data5{
	FileReader fr = null;
	/* 
	 Buffered, LineNumberReader : Temp(임시저장소) - 효율적으로 파일을 메모리에 등록 시킨 후 
	 해당 메모리에 등록된 값을 출력하는 형태
	 필수)해당 임시 저장된 내용을 사용시 휘발성으로 데이터는 자동 삭제처리 됩니다.
	 */
	
	public void abc() throws Exception{
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\number.txt");
		//LineNumberReader li = new LineNumberReader(this.fr);
		/*
		 Buffered : 속도가 빠른대신 사용부분에 있어 변수로 받아서 처리 또는 배열로
		 만든 후 처리 하는 것을 권장
		 */
		BufferedReader bf = new BufferedReader(this.fr);
		/*
		if(bf.readLine()!="") { //조건문에 사용시 해당 데이터 한개가 삭제됨	
			System.out.println(bf.readLine());
		}
		*/
		
		ArrayList<String> al = new ArrayList<String>();
		String line = "";
		while((line = bf.readLine()) != null) {	//line이 null이 아닐때
			//System.out.println(line);
			al.add(line);
		}
		System.out.println(al);
		bf.close();
		this.fr.close();
	}
}
