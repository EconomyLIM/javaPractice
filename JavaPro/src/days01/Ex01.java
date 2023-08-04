package days01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	System.out.println("main() 시작");
	otherMethod();
	System.out.println("main() 종료");
	}
	
	private static void otherMethod() {
		System.out.println("ohterMethod () 시작");
		for(int i = 1; i <= 10 ; i++) {
			if (i == 5) {
				return;
			}
		}
		System.out.println("otherMethod() 종료");
	}
	
	}

