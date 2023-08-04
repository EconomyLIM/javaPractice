package days07;

import util.Draw2D;

public class Ex08_02 {
	int a = 1;

	public static void main(String[] args) {
		//중복함수 -> 오버로딩 over loading
		// 구분선 (100줄이라 가정)
		Draw2D.drawLine();
		System.out.println("부서명: 사원명");
		Draw2D.drawLine(30);
		// 구분선 (100줄이라 가정)
		System.out.println("영업부: 고경림");
		System.out.println("생산부: 김성준");
		System.out.println("개발부: 김정주");
		System.out.println("기확부: 김호영");
		Draw2D.drawLine(25,'A');
		
	} //main

	// 함수 선언 3가지 
	// 1) 기능: 선 긋기 drawLine
	// 2) 매개변수: X
	// 3) 리턴값(리턴자료형) : X -->void

	
} // class
