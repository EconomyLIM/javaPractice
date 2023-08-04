package days08;

public class Ex04_02 {
	int a = 1;
public static void main(String[] args) {
		
		// 지역변수 개념 
		// main 지역변수 x, y 
		//함수 호출 + 매개변수 가지고 
		/*
		 * Call my Name 		ex)drawLine()
		 * Call by Value		ex) swap(10,20)
		 * Call by Reference
		 * Call by Point <c언어
		 */
	
		int [] m = {10,20}; // xy[0] = 1. xy[1]=20;
		int x = 10, y = 20;
		System.out.printf(">x : %d, y = %d\n", m[0], m[1]);
		
		/*
		int temp = x;
		x= y;
		y = temp;
		*/
		// Call by Value X
		// Call by Reference, name 함수의 x,y 참조
		// 매개변수의 참조타입을 사용하겠다.- 배열, 클래스, 인터페이스
		swap(m); // 0x100배열이 시작하는 부분을 넘김 
		
		System.out.printf(">x : %d, y = %d\n", m[0], m[1]);
		
	} // main

	//함수 선언 부분
	private static void swap(int [] y) {
		// swap 지역변수 x, y > 기억공간이 다르다. 
		
		int temp = y[0];
		y[0]= y[1];
		y[1] = temp;
		
	} //swap}
}
