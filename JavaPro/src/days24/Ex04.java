package days24;

public class Ex04 {
	public static void main(String[] args) {
		
		/* [중첩 클래스와 중첩 인터페이스]
		 * 1. 클래스와 클래스들간의 관계
		 * 		has -a 관계
		 * 		is -a 관계 (상속)
		 *  2. 어떤 클래스가 특정 클래스와 관계가 있다면
		 *  		A			B
		 *  B라는 클래스 안에 (내부에) A클래스 선언한다.
		 *  3. 중첩 클래스 (Nested Class)
		 *  4. 장점: 
		 *  	1) 두 클래스의 멤버들을 서로 쉽게 접근할 수 있다.
		 *  	2) 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다.
		 * 5. 예
		 * 		clss A{
		 * 		필드
		 * 		메서드
		 * 		생성자
		 * 		getter, setter
		 *		//중첩클래스
		 *		class B{
		 *	
		 *		}
		 *		// 중첩인터페이스
		 *		interface Ic{
		 *
		 *		}
		 * }
		 * 6. 중첩 클래스의 종류 : 선언 위치에 따라서 구분
		 * 		1) 클래스의 멤버 선언
		 * 			(1) 인스턴스 멤버 클래스 - A객체를 생성해야지 B중첩클래스 사용할 수 있다.
		 * 			(2) 정적(static) 멤버 클래스 - A라는 클래스로 객체 생성 없이 C클래스 바로 접근 가능
		 * 
		 * 			중첩클래스도 A(외부)$B(내부).class클래스 파일 생성
		 * 
		 * 		2) 특정 메서드의 내부 선언
		 * 			(3) 로컬 클래스 - 메서드가 실행될때에만 사용할 수 있다.
		 * 6-2. 예)
		 * 	class A{
		 * 
		 * 		void disp(){
		 * 		
		 * 			class D{ 접근 지정자 사용 x
		 * 				D(){}
		 * 				int d1;
		 * 				void test(){}
		 * 					} // class D
		 * 			D obj = new D();
		 * 			obj.d1;
		 * 			obj.test();
		 * 		}
		 * 
		 * =============================
		 * 		class B{
		 * 			B(){} 생성자
		 * 			int b1; 인스턴스 필드
		 * 			void test () {}; 메서드
		 * 			static 선언 못함
		 * 		}
		 * 		예) A a = new A();
		 * 			A.B b = new A.B();
		 * 			b.b1 = 100;
		 * 			b.test();
		 * 
		 * ==============================
		 * 		static class C{
		 * 		// 모든 필드 메서드 선언 가능
		 * 		int c1 = 1;
		 * 		static c2 = 1;
		 * 		void test1(){}
		 * 		static void test1(){}
		 * 		}	
		 * 		예) 외부 객체를 생성할 필요가 없다.
		 * 		A.C c = new A.C();
		 * 				
		 * }
		 * 		 
		 */
		
	}
}
