package example;

import java.util.Arrays;
// 글자 잘라주기
public class split01 {

	public static void main(String[] args) {
		String test = "어벤져스-홈커밍|1위|2500";
		String data[] = test.split("[|]"); // "|"이건 파이프 기호 []괄호안에 넣어야 문자열로 인식함
		System.out.println(data[1]);
		System.out.println(Arrays.toString(data));
	}

}
