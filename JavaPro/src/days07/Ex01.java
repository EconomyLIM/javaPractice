package days07;

import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class Ex01 {
	int a = 1;
	public static void main(String[] args) {
		
		one();
		two();
		three();
		four();
	} // main
	
	private static void one() {
		// 1. 구구단 가로 출력
		for (int i = 2; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.printf("%dX%d = %d\n", i, j, i*j);
				
			} // for J
		} // for I
	} // one
	
	private static void two() {
		// 2. 구구단 세로 출력
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%dX%d = %02d  ", j, i, i*j);
				
			} // for J
			System.out.println();
		} // for I
		
	} // two
	
	private static void three() {
		// 3. 별찍기
		/* --*			i=1, j=2
		 * -***		i=2, j=1 -->i+j = 3 -->j = 3-i (공백갯수)
		 * *****	i=3, j=0 
		 */
		
		for (int i = 1; i <= 3; i++) { // 행 갯수
			
			for (int j = 1; j <= 3-i; j++) { // 공백 갯수
				System.out.print("_");
			}
			
			for (int j = 1 ; j <= 2*i-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		} // for I
		
	} // three
	
	private static void four() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ( (i+j >=4) && (j-i <=2) && (i-j <=2 ) && (i+j <=8)) {
					System.out.print("*");
				} else {
					System.out.print("_");
				} //else
				
			
			}
			System.out.println();
		}
	}
}
