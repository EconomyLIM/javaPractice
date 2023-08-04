package days14;

public class Ex10_02 {
	//필드
	String name = "익명"; // 명시적 초기화
	int age;
	boolean gender;
	static double rate;
	public Ex10_02() { // 생성자 초기화
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		this.rate = 0.01;
	}
	
	
	static { //클래스 초기화 블럭-> 클래스 변수 초기화
		// 객체생성과 상관 없이 프로그램이 시작할때 한번 static초기화 블럭이 실행된다.
		
	}
	{
		// [인스턴스 초기화 블럭]
		/*
		 * 오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면 그 중복 초기화 코딩을 인스턴스 초기화 블럭으로 따로 선언할때 사용하는 블럭이다.
		 */
	
	}
	public static void main(String[] args) {
		/*
		 * 필드(멤버변수) 초기화 방법
		 * 1) 명시적 초기화
		 * 2) 생성자 초기화
		 * 3)	초기화 블럭 {}
		 * 		1) 인스턴스 초기화  //
		 * 		2) 클래스 초기화 블럭 //
		 * 		 * 4)
		 */
		Ex10_02 obj= new Ex10_02();
	}
}
