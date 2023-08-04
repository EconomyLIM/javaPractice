package days08;


public class Ex06 {
	public static void main(String[] args) {
		int a = 1;
		//재귀 함수(recursive call)
		//함수 안에서 자기 자신을 다시 호출하는 함수를 재귀[호출]함수라고 한다.
		
		disp();
	}
	//재귀함수
	private static void disp() {
		System.out.println("disp함수 호출");
		
		disp();
	}
}
