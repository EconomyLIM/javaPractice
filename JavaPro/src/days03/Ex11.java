package days03;

public class Ex11 {
	public static void main(String[] args) {
		//인덱스 연산자[ ] 설명
		/*
		 * 참조형: 배열, 클래스, 인터페이스 > new라는 연산자로 인해 힙이라는 동적영역에 잡힘
		 * 
		 * 1. 배열 정의: 동일한 자료형을 메모리 상에 연속적으로 놓이게 된 것 
		 * 2. 배열 선언 형식 : 자료형 [] 배열명 = new 자료형 [];
		 * ex) int [] kor = new int [5];
		 * ex) int kor[] = new int [5];
		 * 첨자값, 가장큰 첨자값: upperband, 가장 작은 첨자값 lowerband
		 */
		//1. 국어점수를 저장할 변수 선언 -> 인덱스 연산자를 사용
		int kor []= {90, 100, 80};
		
		for(int i = 0 ; i< kor.length ; i++) {
			System.out.println(kor[i]);
		}
		
		
		
		
	}

}
