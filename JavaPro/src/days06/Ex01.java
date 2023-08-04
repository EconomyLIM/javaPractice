package days06;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		
		

//		name();
		questionOne();
	}//main
	
	private static void name() {
		for (int i = 65; i <= 90; i++) {
			System.out.printf("%c(%d)", i,i);
			if (i% 10 == 4) {
				System.out.println();
			}
		}
		for (int i = 97; i <= 122; i++) {
			System.out.printf("%c(%d)", i,i);
			if (i% 10 == 0) {
				System.out.println();
			}
		}
	}
	
	private static void questionOne() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max ,min, middle, middleTwo;
		
//		middle = Math.max(a, b);
//		max = Math.max(middle, c);
		max = Math.max(Math.max(a, b), c);
		
		middleTwo = Math.min(a, b);
		min = Math.min(middleTwo, c);
		System.out.printf(max + ", " +min);
	}// questionOne
	
	private static void quertionTwo() {
		
	}
}
