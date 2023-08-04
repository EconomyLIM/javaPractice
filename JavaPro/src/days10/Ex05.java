package days10;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
			
		}//for
		System.out.println(Arrays.toString(m));
		
		suffle(m);
		System.out.println(Arrays.toString(m));
	}//main
/* 문
	private static void suffle(int[] m) {
		
		for (int j = 0; j < 10; j++) {
			int tmp;
			int i = (int)(Math.random()*10);
			int z = (int)(Math.random()*10);
			if(i == z) {
				i --;
				continue;
			}
			tmp = m[i];
			m[i] = m[z];
			m[z] = tmp;
		} // for
		
	} // suffle*/
	
	private static void suffle(int[] m) {
		int ridx1, tmp;
		for (int j = 0; j < 10; j++) {
			ridx1 = (int)(Math.random()*9)+1;
			tmp = m[0];
			m[0] = m[ridx1];
			m[ridx1] = tmp;
		} //for
	} //suffle
}
