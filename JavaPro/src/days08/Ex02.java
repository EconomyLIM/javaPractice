package days08;

import java.util.Scanner;

public class Ex02 {
	int a = 1;
	public static void main(String[] args) {
		
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(new int [] {1,2}));
		
		char one = 'x';
		char upperOne = myUpperCase(one);
		System.out.println(upperOne);

	}
	
	private static char myUpperCase(char one) {
		
		if ('a'<=one && one<='z') {
			one = (char) (one - 32);
		}
		
		/*
//		char upperCaseOne = one;
		if (Character.isLowerCase(one)) {
			one = Character.toUpperCase(one);
		}
		*/
		return one;
//		return Character.toUpperCase(one);
	}

	public static int sum(int ...args) { // 가변인자는 하나만 선언가능, 제일 마지막에 선언해야함
		int result = 0;
//		for (int i = 0; i < args.length; i++) {
//			result +=args[i];
//		}//for
		
		for (int i : args) {
			result += i;
		}
		return result;
	}
}
