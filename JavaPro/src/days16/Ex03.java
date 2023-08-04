package days16;

//final 예제
public class Ex03 {
	public static void main(String[] args) {
		//1. 지역변수 -> 상수 final 사용


		final double PI = 3.141592;

		FinalTest obj  = new FinalTest();
		System.out.println(obj.PI);
		// The final field FinalTest.PI cannot be assigned
		//		obj.PI=3.41;
		
		
	} //main
}

class FinalTest{
	// 필드에도 사용가능
//	public static final double PI = 3.141592; -> 명시적 초기화
	
	// The blank final field PI may not have been initialized
	 final double PI;
	
	 //인스턴스 초기화 블록
	{ 
//		PI=3.14;
	}
	
	public FinalTest() {
		PI=3.14;
	} 
	
	public void finalTest(final int value) {
		// 매개변수(지역변수)를 상수로 쓰겠다.
		//
	}
	
}

class Parent1{
	// final을 붙이면 재정의할 수 없는 최종 메소드가 된다
	final void dispA() {
		
	}
}

class Child1 extends Parent1{
//	void dispA() {
		
//	}
}
