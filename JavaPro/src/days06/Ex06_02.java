package days06;

import java.util.Iterator;

public class Ex06_02 {

	public static void main(String[] args) {
		// 구구단
		// 2단

		for (int i = 2; i <= 9; i++) {

			System.out.println(i +"단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dX%d=%d	",i ,j, i *j);
				if (j %3 == 0 ) {
					System.out.println();
				}//if
			}//for
		}//for
	}//main

}
