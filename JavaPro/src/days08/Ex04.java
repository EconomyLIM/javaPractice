package days08;


public class Ex04 {
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
		int x = 10, y = 20;
		System.out.printf(">x : %d, y = %d\n", x, y);
		
		/*
		int temp = x;
		x= y;
		y = temp;
		*/
		swap(x,y); // 함수를 호출하는 부분
		
		System.out.printf(">x : %d, y = %d\n", x, y);
		
	} // main

	//함수 선언 부분
	private static void swap(int x, int y) {
		// swap 지역변수 x, y > 기억공간이 다르다. 
		
		System.out.printf(">before x : %d, y = %d\n", x, y);
		int temp = x;
		x= y;
		y = temp;
		System.out.printf(">after x : %d, y = %d\n", x, y);
		
	} //swap
}
