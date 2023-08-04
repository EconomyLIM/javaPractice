package days06;

import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
		// i = 1 j = 1,2,3,4 +개행
		// i = 2 j = 1,2,3,4 +개행
		// i = 3 j = 1,2,3,4 +개행
		// i = 4 j = 1,2,3,4 +개행

		//		for (int i = 1; i <= 4; i++) { //행갯수
		//			for (int j = 1; j <= 4; j++) { // 별갯수
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		System.out.println("1");
		one();
		System.out.println("2");
		two();
		System.out.println("3");
		three();
		System.out.println("4");
		four();
		System.out.println("5");
		five();
		System.out.println("6");
		six();
		System.out.println("7");
		seven();
		System.out.println("8");
		eight();
		System.out.println("9");
		nine();
		System.out.println("10");
		ten();

	}//main

	private static void one() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} //one

	private static void two() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4-i; j > 0; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}

	} //two

	private static void three() {

		int i,j;

		for (i = 0; i < 5; i++) {
			for (j = 0;  j< 4-i; j++) { //공백
				System.out.print("_");
			}
			for (j = 0; j <i; j++) { //별
				System.out.print("*");			
			}
			System.out.println();
		}
	} //three

	private static void four() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				if(i==4) continue;
				System.out.print("_");
			}
			for (int j = 4-i; j > 0; j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}//four

	private static void five() {

		for(int i = 0 ; i <3 ; i++) {
			for (int j = 0; j < 2-i; j++) {
				System.out.printf("_");
			}
			for (int j = 0; j < i*2 +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}//five

	private static void  six() {

		for(int i = 0 ; i <3 ; i++) {
			for (int j = 0; j < 2-i; j++) {
				System.out.printf("_");
			}
			for (int j = 0; j < i*2 +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.printf("_");
			}// for
			for (int j = 3; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}//six

	private static void  seven() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("_");
			} //for J
			System.out.print("*");
			System.out.println();
		}
	} // seven
	private static void eight() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
			} //for J
			System.out.print("*");
			System.out.println();
		}
	}// eight

	private static void nine() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j || i+j == 4) {
					System.out.print("*");
				}
				else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}//nine

	private static void ten() {
		for (int i = 0, j=0; i < 5; i++) {
			for (int k = 0; k < (5 - j); k++) {
				System.out.print((k < j) ? "_" : "*");
			}
			if(i < 2){
				j++;
			}else{
				j--;
			}
			System.out.println();
		}
	}// ten

}//class
