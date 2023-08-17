package io;

import java.io.FileWriter;
import java.util.Arrays;

//I/O 응용문제
/*
 	응용문제1
 해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오.
 "hong","kim","park","lee"
 "25","30","44","26"
 "홍길동","김유신","박찬호","이순신"
 
 파일에 저장 형태는 다음과 같습니다.
 홍길동:hong(25)
 김유신:kim(30)
 박찬호:park(44)
 이순신:lee(26)
 단, 파일명은 member_list.txt로 저장 되어 있어야 합니다.
 */
public class file14 {
	
	public static void main(String[] args) {
		try {
			new mem().abc();
		}catch(Exception e) {
			System.out.println("파일오류야");
		}
		

	
		
	}

}
class mem{
	FileWriter fr = null;
	public void abc() throws Exception {
		/*
		Files.createDirectories(Paths.get("E:\\project\\web\\src\\main\\webapp\\member"));
		*/
		/*
		Path data = Paths.get("E:\\project\\web\\src\\main\\webapp\\member\\member_list.txt");
		Files.createFile(data);
		*/
		
		fr = new FileWriter("E:\\project\\web\\src\\main\\webapp\\member\\member_list.txt",true);
		
		String mem[][] = {
				{"hong","kim","park","lee"},
				{"25","30","44","26"},
				{"홍길동","김유신","박찬호","이순신"}
		};
		String newmem[] = new String[mem[0].length];	//newmem에게 mem 0번째 방만큼 파준다
		
		int z = 0;
		do {
			newmem[z] = mem[2][z]+ " : " + mem[0][z] + " (" +mem[1][z] + ")";	//mem2번째,0번째,1번째 방을[z]만큼 넣어준걸 newmem에게 넣어준다.
			z++;
		}while(z<mem[0].length);	//z가 mem 0번째의 방보다 적을때
		System.out.println(Arrays.toString(newmem));	
		
		for(String w : newmem) {	//newmem을 w에 넣어준다.
			this.fr.write(w+"\n");	//w에다가 결과값 쓰기
		}
		
		this.fr.close();
	}
	
}