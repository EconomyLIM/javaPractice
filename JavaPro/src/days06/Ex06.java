package days06;

import java.util.Iterator;

public class Ex06 {

	public static void main(String[] args) {
		// 구구단
		// 중첩for문

		/*
		for (int i = 2; i <= 9; i++) {

			System.out.println("*************	"+ i +"단	**************");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dX%d=%d	",i ,j, i *j);
				if (j %3 == 0 ) {
					System.out.println();
				}//if
			}//for
		}//for*/
		
		two();
	}//main
	
	private static void two() {
		int dan = 2;
		int i = 1;
		
		while (dan <= 9) {
			System.out.printf("%d단\n", dan);
			
			while (i<=9) {
				System.out.printf("%dX%d=%d\n", dan, i, dan*i);
				i++;
			}// while
			dan++;
			 i = 1;
		} // while
	} //two

}
