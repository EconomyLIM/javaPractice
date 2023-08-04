package days05;

import java.util.Iterator;

public class Ex02_2 {
	public static void main(String[] args) {
		
		//char -> String 변환
		// 1) 'a'+
		//2) String.valueof('a');
		// 3) Charater.toString('a');
		
		// String -> char 변환x
		String name = "keni";
		//원하는 위치의 한 문자를 얻어보고시 ㅍ다.
		//문자열.charAt(index) index 위치가 몇번지인지 정하는 매개변수-> return값은 character
		/*
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1))
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		*/
		System.out.println(name.length());
		int len = name.length();
		for(int i = 0 ; i < len  ; i++) {
			System.out.println(name.charAt(i));
		}
		// 문자열을 다루는 메서드(함수)
		// 1. split
		// 2. length
		// 3. charAt()
		// 4. valueOf()
		// 5. toString
		// 6. toCharArray() : String을 char[]로 반환하는 메소드
	}

}
