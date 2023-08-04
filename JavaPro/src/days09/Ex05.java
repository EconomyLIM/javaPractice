package days09;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * [배열] + 제어문
		 * 1. 자바의 자료형
		 * 		기본형(8가지)
		 * 		ㄴ숫자형
		 * 			ㄴ정수형
		 * 				ㄴ 문자
		 * 			ㄴ실수형
		 * 		ㄴ논리형
		 * 		참조형 - [배열], 클래스, 인터페이스
		 * 2. (array) 정의 - 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.
		 * 	3. 배열 선언: 자료형 [] 변수명(참조변수명, 배열명);
		 * 		Ex) int [] m;
		 * 		동적영역(heap)					스택(stack)영역
		 * 											[ m]
		 * 		배열 생성						0요소		1요소		2요소
		 * 		new int[3] ->동적영역-> [4byte][4byte][4byte] < 첨자값(index)lowerBound, upperBound
		 * 4. 배열 크기 = 배열명.length
		 * 
		 */
		int [] kors = new int [3];
		
//		Arrays 클래스 = 배열을 사용하기 쉽도록 기능(함수)이 구현된 클래스
//		Arrays.fill(kors, 100);
		
//		for (int i = 0; i < kors.length; i++) {
//			kors[i] = 100;
//		}
		// java.lang.NullPointerException
		kors = null;
		dispKors(kors);
		
	} //main

	private static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d] = %d\n",i, kors[i]);
		}
	}
}
