package days05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02_03 {
	public static void main(String[] args) {
		//[2]
		//		String name = "kenik";
		//		char [] nameArr = name.toCharArray();
		//		System.out.println(nameArr[1]);
		//		
		name();

		/*
		 * [1]직접 배열 선언후 for문사용해서 처리
		 * 
		String name = "kenik";
		//String -> char[] 변환 ->char[0];

		char [] nameArr = new char[name.length()];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = name.charAt(i);
		} //for
		 */


	}

	public static void name() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = a.length();
		char [] c = a.toCharArray();
		char [] d = a.toCharArray();
		char A;

		if(1<=b && b<=20){
			for (int i = 0; i < c.length; i++) {
				if ('a'<c[i]&& c[i] <'z') {
					c[i] = (char) (c[i] - 32);
				}else {
					c[i] = (char) (c[i] +32);
				}//else
				System.out.printf("%c",c[i]);
			}
		}//if
	}

	public static void prac2() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = a.length();
		char [] c = a.toCharArray();
		char A;

		if(1<=b && b<=20){
			for (int i = 0; i < c.length; i++) {
				if ('a'<=c[i]&& c[i] <='z') {
					c[i] = Character.toUpperCase(c[i]);
				}else {
					c[i] = Character.toLowerCase(c[i]);
				}//else
				System.out.printf("%c",c[i]);
			}
		}//if
	}// prac2

}
