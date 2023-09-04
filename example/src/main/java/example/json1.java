package example;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//js14.html에서 사용한 data.json을 제작하여 활용하는 형태
/*
 json1.java에서 원시 배열값을 json으로 변환 후 Front가 해당 데이터를
 ajax로 로드하여 웹 페이지에 출력하는 형태
 */

public class json1 {

	public static void main(String[] args) throws Exception {
		JSONObject jo = new JSONObject();	//put만 사용이 가능하며 key만 생성한다,
		JSONArray ja = new JSONArray();		//add만 사용이 가능하며 data를 생성
		int user[] = {2600,3200,9900};	//json데이터에 숫자형태의 배열로 전달
		int w = 0;
		while(w < user.length) {
			//ja.add(user[w]);	//키가 없는 형태의 배열
			JSONObject jo2 = new JSONObject();	//키 생성시 반복문으로 작동하면 객체 및 인스턴스를 새롭게 생성하면서 적용해야 합니다.
			jo2.put("product"+w,user[w]);	//("키 이름",데이터값);
			ja.add(jo2);	//[] 배열화 시키는 작업
			w++;
		}
		jo.put("adata", ja);	//대표키를 생성하는 형태
		FileWriter fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\data.json",false);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(jo.toString());	//toJSONString()얘 써도 맞음(라이브러리함수) 배열을 문자열로 변환 후 저장
		
		//bw.write("ajax_data("+jo.toString()+")"); //CORS를 해결하기 위한 함수 호출로 적용
		
		bw.flush();
		bw.close();
		//fw.write(jo.toString());
		fw.close();
	}

}
