package days15;

public class Ex09 {
	public static void main(String[] args) {

		/*
		 * 1)문제점 -> E e1 = new R();
		 * 1)문제점 -> E e1 = new S();
		 * 1)문제점 -> E e1 = new T();
		 * e1. getPay()가 없다
		 *  why? Employee 클래스 안에 getPay()메서드 선언 X
		 *  => E에다 getPay 추가
		 */

		// 추상클래스 Ex)초,중,고,대 학생관리
		// 추상클래스 ->학생클래스 하나 만든다 -> 공통적으로 멤버

		/*
		 * [다형성] - 여러 가지 형태를 가질 수 있는 능력
		 * 	E e1 = new R();
		 * 	E e1 = new S();
		 * 	E e1 = new T();
		 * 
		 */
		//Cannot instantiate the type Employee  --> 객체로 생성할수 없다 -> 불완전한 클래스(추상 클래스)이기 때문
		//		Employee emp1 = new Employee("이준희","서울 강남구","010-1234-1234", "2023.12.12");
		/*
		Regular emp1 = new Regular("주강민","서울 양천구","010-5678-5678", "2023.11.11",500000);
		Employee emp2 =  new SalesMan("임경재", "경기도 성남시", "010-5678-5678", "2021.03.12", 50000000,20,70000);
		Employee emp3 = new Temp("박정호", "서울 목동", "010-3232-3232", "2021.04.12", 20,250000);

		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		 */

		/*
		Employee [] emps = new Employee[3];
		emps[0] = new Regular("주강민","서울 양천구","010-5678-5678", "2023.11.11",500000); // 업캐스팅 -> 자동형변환된다
		emps[1] = new SalesMan("임경재", "경기도 성남시", "010-5678-5678", "2021.03.12", 50000000,20,70000);
		emps[2] = new Temp("박정호", "서울 목동", "010-3232-3232", "2021.04.12", 20,250000);
		 */

		Employee [] emps = {
				new Regular("주강민","서울 양천구","010-5678-5678", "2023.11.11",500000),
				new SalesMan("임경재", "경기도 성남시", "010-5678-5678", "2021.03.12", 50000000,20,70000),
				new Temp("박정호", "서울 목동", "010-3232-3232", "2021.04.12", 20,250000)
		};
		for (int i = 0; i < emps.length; i++) {
			emps[i].getPay();
		} //for


	} //main
	
	public void dispGetPay() {
		
	}
} //class
