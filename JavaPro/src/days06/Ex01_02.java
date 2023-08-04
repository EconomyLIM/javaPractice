package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {
	public static void main(String[] args) {
		int [] m = new int [10];

		Random rnd = new Random();
		
		
		for(int i =0 ; i < m.length ; i++) {
			//m[i] = (int)(Math.random()*11 + 5);
			m[i] = rnd.nextInt(11)+5;
		}//for
		
		System.out.println(Arrays.toString(m));//Arrays ->배열을 사용하기 쉽도록 구현
//		Arrays.sort(m);
		int max = m[0];
		int min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			if(max< m[i]) {
				max = m[i];
			}
		} //for
		
		for (int i = 1; i < m.length; i++) {
			if(min> m[i]) {
				min = m[i];
			}
		} //for
		
		System.out.println(max);
		System.out.println(min);
		//배열의 각 요소를 출력


//		for(int i =m.length ; i <= 0; i--) {
//			System.out.printf("%d, ",m[i]);
//		}//for
		
		
	} //main
	
}
