package javatest;

import java.util.*;
/*
 db에 배열로 넣는 방법
 */
public class java10 {
	public static void main(String[] args) {
		String q[] = {"고객명을 입력하세요?","아이디를 입력하세요?","패스워드를 입력하세요?"};
		
		Scanner sc = new Scanner(System.in);
		String a[] = new String[q.length];
		int w = 0;
		while(w<q.length) {
			System.out.println(q[w]);
			a[w] = sc.nextLine();
			w++;
		}
		System.out.println(Arrays.toString(a));
	}

}
