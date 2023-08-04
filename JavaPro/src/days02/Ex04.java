package days02;

public class Ex04 {
	public static void main(String[] args) {
		int x,y;
		x= 10;
		y = 20;
		System.out.println("출력형식("+ x + "," + y+")" );
		
		int tmp;
		tmp = x;
		x=y;
		y=tmp;
		
		System.out.println("출력형식("+ x + "," + y+")" );
	}
}
//지역변수란 무엇인가
// 두 기억공간 바꾸는 법 