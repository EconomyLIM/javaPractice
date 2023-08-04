package days02;

public class Ex16 {
	public static void main(String[] args) {
		// 1.자동형 변환 (2가지)
		int i = 10;
		long l = i;
		System.out.println(l);
		//실수형이 정수형보다 더 큰걸로 인식
		
		long L = l + i ; // long + int ->큰자료형인 long으로 변환
		
		// 2.강제형 변환
		// () -> cast 연산자 = 강제 형 변환
		int a = 20;
		int b = 3;
		System.out.println((double)a/b);
	
	}

}
