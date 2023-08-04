package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01_03 {
	public static void main(String[] args) throws IOException {

		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
//		int max=m[0] , maxCount = 1;
		/*
		for (int i = 1; i < m.length; i++) {
			if(max ==m[i]) maxCount++;
			if (max < m[i]) {
				max = m[i];
				maxCount =1 ;
			}
		}
		*/
		int [] mc= getArrayMaxCount(m);
		System.out.printf("%d, maxCount : %d", mc[0], mc[1]);
	} // main

	private static int[] getArrayMaxCount(int[] m) {
		int max=m[0] , maxCount = 1;
		for (int i = 1; i < m.length; i++) {
			if(max ==m[i]) maxCount++;
			if (max < m[i]) {
				max = m[i];
				maxCount =1 ;
		}
		}
			int mc[] = new int [2];
			mc[0] = max;
			mc[1] = maxCount;
			return mc;
	
	}
}
