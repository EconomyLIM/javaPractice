package days14;

public class Ex04 {
	public static void main(String[] args) {
		
		//private 필드 선언
		// 1. 왜? private 접근 지정자를 사용해서 필드 선언?
		// 2. 이유
		/*		1) private 필드 + 유효한 값만을 필드가 사용
		 * 		2) 필드를 읽기전용, 쓰기전용 -->set을 없애서 get만 놔두면 읽기전용이 된다.
		 * 3. 방법 getter, setter 
		 * 
		 */
		Person p3 = new Person(true); // 생성자를 통해서 값 할당
		System.out.println(p3.isGender());
		Person p1 = new Person();
		p1.setAge(20);
		System.out.println(p1.getAge());
		// 접근 지정자를 사용해서 필드(은닉화)
		// [Person의 멤버변수가 private일때 ]The field Person.name is not visible
		/*
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		*/
		
	} // main
} //class

// 자바의 똑같은 이름만 public 선언 가능, 그외는 불가능 
// [앞에 Public 붙일시] -> The public type Person must be defined in its own file
// 다른 패키지 에서는 사용할 클래스X
//class Person{
//	
//}
