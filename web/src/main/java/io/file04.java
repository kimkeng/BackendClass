package io;

import java.io.FileWriter;

//파일쓰기 (write)

public class file04 {

	public static void main(String[] args) {
		try {
			new data3().abc();
		}catch(Exception e) {
			System.out.println("파$일 오%류 발@생!!");
		}
	}

}
class data3{
	FileWriter fw = null;
	//FileWriter : 문자 데이터를 파일에 쓰는 class
	public void abc() throws Exception{
		String user[] = {"홍길동3","유관순3","이순재3","강감찬3","안중근4"};
		//this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data.txt");
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data.txt",true);
		//FileWriter true는 : 기존 데이터를 삭제 하지 않고 지속적으로 데이터를 추가하는 형태
		//FileWriter flase(기본값)는 : 기존 데이터를 삭제 후 추가하는 형태
		for(String name : user) {
			this.fw.write(name);	//write 메소는 해당 파일에 데이터를 쓰기용도
		}
		this.fw.close();	//파일 오픈종료
	}
}
