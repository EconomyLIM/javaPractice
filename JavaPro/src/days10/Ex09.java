package days10;

import java.util.Arrays;
import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		/*
		 * 내일 수업할 것 
		 * 1. 1,2,3,다차원배열
		 * 2. 정렬 sort
		 * 3. 검색
		 * 4. 활용 예제
		 * 
		 */
		// 문제)
		int [] n = new Random()
				.ints(30,0,10)
				.toArray();
		System.out.println(Arrays.toString(n));
		int cnt =0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < n.length; j++) {
				if(n[j] == i) cnt++;
			}//if
			System.out.printf("%d : %d개\n",i, cnt);
			cnt = 0;
		} //for
	} // main
}
