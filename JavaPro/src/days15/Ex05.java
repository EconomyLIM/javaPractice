package days15;

import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 다중 상속 :X
		// 단일 상속
		/*
		 * class Tv{}
		 * class VCR{}				
		 * 
		 * 								다중상속 -> [인터페이스 구현]
		 * class TVCR extends Tv, VCR{ // Tv+VCR  다중상속 할수 없음
		 * 
		 * } 
		 */
		// [오버라이딩 주의 사항]
		/* 시험
		 * 1.정의 : 부모클래스로부터 상속받은 메서드를 정의하는 것
		 * 2. override 사전적의미 == overwirte == 위에 덮어쓰다.
		 * 3. 오버라이딩의 조건
		 * 1) 메서드명 수정x
		 * 2) 매개뱐수 동일
		 * 3) 리턴타입 동일
		 * 4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 된다.
		 * 5) 부모의 메서드보다 맣은수의 예외를 선언할 수업다.
		 * 6) 인스턴스 메서드<->static메소드 변경x
		 */
	}
}


class Parent{
	int print(String n, int a) throws IOException,NullPointerException{
		return 100;
	}
}
class Child extends Parent{
	
	//Cannot reduce the visibility of the inherited method from Parent -->접근 지정자를줄일수 없다.
	
	//The method print(String) of type Child must override or implement a supertype method ->[2]매개변수 동일해야한다.
	@Override
	protected int print(String n, int a) throws IOException,NullPointerException{
		return 200;
	}
}
