package days15;

public class Ex08 {
	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee("이준희","서울 강남구","010-1234-1234", "2023.12.12");
		emp1.dispEmpInfo();
		System.out.println(emp1.toString()); // toString = Object 클래스
		System.out.println(emp1); //객체만 쓰면 toString이 생략된 것이다.
		// 오버라이딩*/


		//정규직 사원 
		//		Regular emp2 = new Regular("주강민","서울 양천구","010-5678-5678", "2023.11.11",500000);
		// 문제점: 기본급 출력 X

		//		emp2.dispEmpInfo();
		// 자동형변환 조건 -> 상속 관계
		// Employee = Regular  클래스들 간의 자동형변환 
		// 상속관계가 있는 클래스들간의 자동형변환 
		// 부모 클래스 = new 자식클래스 --> 자식객체를 부모객체에 참조시키는걸 =업캐스팅(upcasting)
		 //Employee emp2 = new Regular("주강민","서울 양천구","010-5678-5678", "2023.11.11",500000);
//		 emp2.dispEmpInfo();
		// 업캐스팅 문제점-> 
		// emp2.getPay(); -->호출을 못함

		// 이상한점
		// Employee 클래스의 displInfo()가 아니라 Regular의 dispInfo가 출력됨
		 
		// 다운캐스팅 ->부모 객체를 자식 객체에 참조시키는거 -> 강제로 형변환 해야한다.
		//Regular emp = (Regular)emp2;
		//emp.dispEmpInfo();
		// 다운 캐스팅 조건 -> 업캐스팅이 일어난 그 객체만 다운캐스팅할 수 있다.
		// 
		
		// Type mismatch: cannot convert from Employee to Regular
		// cast 연산자가 클래스들간의 형변환에서도 사용한다.
//		Regular emp3 = (Regular) new Employee("이준희","서울 강남구","010-1234-1234", "2023.12.12");
		//java.lang.ClassCastException -> 실행 오류
//		emp3.dispEmpInfo();
		
		//
		//Employee emp3 =  new SalesMan("임경재", "경기도 성남시", "010-5678-5678", "2021.03.12", 50000000,20,70000);
		//emp3.dispEmpInfo();
		//System.out.println(emp3.getPay());
		
		//[5]
		Employee emp4 = new Temp("박정호", "서울 목동", "010-3232-3232", "2021.04.12", 20,250000);
		emp4.dispEmpInfo();
		System.out.println(emp4.getPay()); 
		
	} //main
}
