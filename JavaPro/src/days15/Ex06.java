package days15;

import java.io.*;
public class Ex06 {
	public static void main(String[] args) {
		
		
		/*
		 * 1. 패키지
		 * 		1)서로 관련된 클래스,인터페이스의 묶음
		 * 		2) 클래스를 효율적으로 관리
		 * 		예) java.io패키지 - 서로 관련된 클래스
		 * 					input/ output 클래스
		 * 		3) 클래스의 이름이 충돌하는 것을 막아준다.
		 * 			다른 개발자가 구현한 클래스 라이브러리의 클래스와 이름이 충돌되는것을 피할 수 있다.
		 * 		4) 자신만이 사용할 패키지 체계 있어야한다.
		 *		5) 클래스 -> 물리적으로 ->???.class
		 *			패키지 -> 물리적으로 -> 디렉토리생성
		 *			
		 *		6) 선언 형식 -> 소스파일의 첫번째 라인(문장) 단 한번 선언
		 *			package 패키지명.패키지명;
		 *		7) 패키지명은 전부다 소문자로 작명 
		 * 2. import 문
		 * 		1)소스파일에서\
		 *			다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
		 *		2) 패키지 이름 + 클래스 이름 = 클래스의 풀네임
		 *		3) 풀네임 -> 
		 *			java.lang.System.out.println();
		 *		4) import문 사용해서 미리 풀네임을 명시
		 *		import java.lang.System
		 * 
		 * 		System.out.println
		 * 
		 * 		5) import 문 x
		 * 			Ctrl  + shift + o;
		 * 		6)*을 쓰면 모든 패키지를 다쓴다.
		 * 		7) static import문  
		 * 			Math 클래스 처럼
		 */
		 Math.random();
		 System.out.println(Math.PI);
		
		BufferedReader br;
		
	} // main
}
