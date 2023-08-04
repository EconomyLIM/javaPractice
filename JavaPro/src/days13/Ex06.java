package days13;

public class Ex06 {
	public static void main(String[] args) {
		
		// 좌표점 20개쓰기 + 읽기
		// main x,y 지역변수
		int x = 10, y = 20;
		int x1 = 11, y2 = 21;
		int x2 = 12, y3 = 22;
		int x3 = 13, y4 = 23;
		int x4 = 14, y5 = 24;
		
		dispXY(x,y); //call by value;
		
		
	} //main
	//									dispXY 의 x, y 지역변수
	private static void dispXY(int x, int y) {
		System.out.printf("x = %d, y = %d\n",x,y);
	} // dispXY
	
//	private static void dispXY(int ...x, int ,,,y) { // 가변인자는 여러개 사용X
		
//	}
	private static void dispXY(int []x, int []y) {
		
	}
	
}
