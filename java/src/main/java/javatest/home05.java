package javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 [숙제] 상속형태의 클래스를 이용하여 다음 문제에 맞는 결과값을 돌출하는 코드를
 작성하시오.
 [DB] = {55,1,6,8,10,22,96,33,31,45,48,60}
 
 "해당 데이터를 1.짝수, 2.홀수 를 선택하세요?"
 
 [결과]
 짝수값 : 6,8,10,22,96,48,60
 홀수값 : 55,1,33,31,45
 
 최종값에 대한 오름차순으로 정렬하여 최종출력 합니다. (sort)
 */
public class home05 {

	public static void main(String[] args) {
			b b = new b();
			b.game_list();
			b.bb();

	}

}
class gambling{
	int[] sum = null;
	public void game_list() {
		this.sum = new int[] {55,1,6,8,10,22,96,33,31,45,48,60};
	}
}
class b extends gambling{
	Scanner sc = null;
	ArrayList<Integer> list = null;
	
	@Override
	public void game_list() {
		super.game_list();
		this.sc = new Scanner(System.in);
		this.list = new ArrayList<Integer>();
	}
	
	public void bb(){
		this.game_list();
		Arrays.sort(this.sum);
		//System.out.println(Arrays.toString(this.sum));
		
		int w = 0;
		while(w < this.sum.length) {
			list.add(this.sum[w]);
			w++;
			
		}
		//System.out.println(list);
		ArrayList<Integer> hol = new ArrayList<Integer>();
		ArrayList<Integer> zzac = new ArrayList<Integer>();
		for(int i = 0; i < this.sum.length; i++) {
			//int scan = sc.nextInt();
			if(list.get(i)%2==0) {
				int holi = list.get(i);
				hol.add(holi);
			}else if(list.get(i)%2!=0){
				int zzaczzac = list.get(i);
				zzac.add(zzaczzac);
			}
		}
		//System.out.println(hol);
		//System.out.println(zzac);
		System.out.println("1:짝수 | 2:홀수");
		int scan = this.sc.nextInt();

		if(scan==1) {
			System.out.println("짝수값 : "+hol);
		}else if(scan == 2) {
			System.out.println("홀수값 : "+zzac);
		}else {
			System.out.println("1번이랑 2번만 해");
			new b().bb();
		}
	}
}