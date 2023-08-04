package util;

public class Draw2D {
	// 2D그리기 작업할 수 있는 모든 기능들을 구현한 클래스
	public static void drawLine(){
		System.out.println("--------------------");
	}//drawline

	//Duplicate method drawLine() in type Ex08_02
	//함수명이 다르더라도 매개변수의 자료형이나 갯수가 다르면 다른 함수로 인식한다.

	public static void drawLine(int n){
		for (int i = 1; i < n; i++) {
			System.out.println("-");
		}
		System.out.println();
	} //drawline

	public static void drawLine(int n, char style){
		for (int i = 1; i < n; i++) {
			System.out.println("-");
		}
		System.out.println();
	}//drawline
}
