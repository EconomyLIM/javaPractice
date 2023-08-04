package days16;

public class Ex11 {
	public static void main(String[] args) {
		// [ interface의 default 메서드]
		// 5년후 IA조상 인터페이스에 
		// testXX() 추상 메서드가 있었으면
		
		// 1) 여러 인터페이스를 구현하면 디폴트 메서드.. 
		//   -> 충돌나는 디폴트 메서드를 오버라이딩 하면 해결 
		// 2) 조상 클래스의 메서드와 디폴트 메서드 충돌
		//		-> 충돌나는 디폴트 메서드는 무시가 된다.
	} //main
}


interface A{
	 //3개의 추상메소드
	default void testXX() {
		
	}
}

interface B extends A{
	//3개의 추상메소드
	// 2개 ..
}

interface C extends B{
	//3개의 추상메소드
	// 2개 ..
}