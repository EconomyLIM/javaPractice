package days07;

public class Ex10 {
	//days07
	public static void main(String[] args) {
		int a  = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int result = sum(a, b, c, d);
		
		// 두 정수의 합을 구해서 반환하는
		// sum()함수 선언
		// sum()함수 호출
		// int c = a+ b;
		
		System.out.printf("%d+%d=%d\n",a, b, sum(a, b));
	} //main
	
	public static  int sum(int a, int b) {
//		int c= a+b;
		return a+b; //return문에 수식이 올 수 있다.
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
} // class
