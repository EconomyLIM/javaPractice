package days16;


import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

public class Ex02 {
	
	public static void main(String[] args) {
//		Regular e1 = new Regular();
//		dispGetPay(e1);
		
		SalesMan e2  = new SalesMan();
		dispGetPay(e2);
		
//		Temp e3 = new Temp();
//		dispGetPay(e3);
	} //main
	
	//인스턴스 메서드 -> 클래스 메서드
	private static void dispGetPay(Employee emp) { 
		// emp 도대체 Regular, SalesMan, Temp 인스턴스 확인핤 ㅜ있는 연산자 instance of
		//  항상 자식클래스 먼저 물어봐야 한다.
		// if else if 구문 확인
		if (emp instanceof SalesMan) {
			System.out.println("SalesMan Type 이다.");
			SalesMan s1 = (SalesMan)emp;
		}
		else if (emp instanceof Regular) {
			System.out.println("Regular Type 이다.");
			Regular s1 = (Regular)emp;
		}
		
		else if (emp instanceof Temp) {
			System.out.println("Temp Type 이다.");
		}
		
		System.out.println(emp.getPay()); 
	}

}
