package days18;

import java.util.Arrays;

public class Ex08_06 {

	public static void main(String[] args) {
		String s = " TODO Auto-generated method stub";
		
		// String -> char [] 변환
		char [] sArr = s.toCharArray();
		/*
		for (char c : sArr) {
			System.out.println(c);
		}
		*/
		
		// char[] -> String 변환
		/*
		 * s = String.valueOf(sArr);
		 */
		s = new String(sArr);
		
		// 3) String -> byte[]
		// -128~127 정수
		byte[] bArr = s.getBytes();

		// 4) byte배열 -> String 배열
		s = new String(bArr);
		
		System.out.println("-".repeat(40));
		
		/*
		 * "		홍길동		".trim()
		 * --> "홍길동"
		 */
	}

}
