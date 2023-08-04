package days16;


public class Ex01 {
	public static void main(String[] args) {
		/* 프로그램 시작 method 영역
		 * 정적 -> 
		 * 정적 필드 - 공유변수 클래스당 하나만 (클래스 변수, 클래스명.필드명)
		 * 
		 * OOP의 특징
		 * 1. 캡슐화 -> 속성 + 기능 묶어서 ->하나의 클래스
		 * 2. 은닉화 -> 접근지정자 패키지 내,외, 같은 클래스 -> 데이터 보호, 유효한 데이타 사용 처리
		 * 3. 상속성 -> 기존의 클래스를 새로은 클래스로 재사용
		 * 4. 다형성 -> 다양한 형태를 처리할 수 있는 능력
		 * 5. 추상화 ->
		 * 
		 *  상속 계층도, 자식 클래스, 공통적인 멤버 가진 부모클래스, abstract 키워드 - 추상클래스
		 */
		
		//upCasting
//		Parent p1 = new Child();
	}
}

abstract class Parent{
		abstract void disapA();
		abstract void disapB();
}

abstract class Child extends Parent{

	@Override
	void disapA() {
		// TODO Auto-generated method stub
		
	}
	// 추상 클래스가 되어진다.
	
}

class Cescendat extends Child{

	@Override
	void disapB() {
		// TODO Auto-generated method stub
		
	}
	
}

/*
class Child extends Parent{

	@Override
	void disapA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void disapB() {
		// TODO Auto-generated method stub
		
	}
	
}

class Child extends Parent{
	
}
*/

