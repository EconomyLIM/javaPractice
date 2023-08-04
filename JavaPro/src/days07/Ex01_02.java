package days07;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class Ex01_02 {	
	int a = 1;
	public static void main(String[] args) {
		
		//행 갯수 받아 이등변 삼각형을 그리기
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		//행->열
		int col = 2*row-1;
		

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if( (i+j >= row + 1) && (j-i <=row-1) ) {
					System.out.print("*");
				} // if
				else System.out.print("_"); // else
			}
			System.out.println();
		}
		
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("*".repeat(i));			
//		}

	} //main
}
