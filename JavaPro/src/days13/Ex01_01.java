package days13;

import java.util.Random;

public class Ex01_01 {
	public static void main(String[] args) {
		int [][] m = new int [5][5];
		
		fillM(m);
		dispM(m);
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			} //for
			System.out.println();
		} //for
	} // dispM

	private static void fillM(int[][] m) {
		int number = 0;
		int sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			if (i !=4) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = ++number;
					sum +=m[i][j];
					if(j/4==1) {m[i][j] = sum -number;sum = 0; --number;}
					
				} //for J
			}else {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = i*7+j*4;
					
					if(j/4==1) {m[i][j] = sum;sum = 0; --number;}
					sum +=m[i][j];
					}//for
				
			} //else
		} //for
	} // fillM
} 



