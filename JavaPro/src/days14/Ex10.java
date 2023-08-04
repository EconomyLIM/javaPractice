package days14;

public class Ex10 {
	double avg ;//인스턴스 변수
	static double rate; // 클래스 변수
	public static void main(String[] args) {
		
		// [시험] 변수 초기화
		
		//변수-> 지역변수, 인스턴스변수, 클래스변수
		
		/*
		 * 1. 변수 초기화? 변수를 선언하고 처음으로 값을 할당하는 것
		 * 2. 지역변수는 반드시 초기화 해야 사용할 수 있다.
		 * 3. 인스턴스변수와 클래스 변수는 초기화하지 않으면 각 자료형의 기본값으로 초기화되어져 있다.
		 * 
		 */
		String name;
		Ex10 obj = new Ex10();
		System.out.println(obj.avg);
		System.out.println(Ex10.rate);
		//초기값
		/*
		 * double 0.0
		 * int byte short: 0
		 * long: 0L
		 * float: 0.0f
		 * String클래스 참조형 null
		 */
		
	} //main
}
