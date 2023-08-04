package days16;

import java.util.ArrayList;

public class Ex09 {
	public static void main(String[] args) {
		// 인터페이스의 장점 [시험]
		/*
		 * 1. 개발시간을 단축시킨다.-> 인터페이스 작성 + 사용하는 곳-> 개발 진행
		 * 									인터페이스를 구현한 클래스 X
		 * Ex) has-a : Car, Engine 클래스 
		 * 		Car 클래스 코딩~~
		 * 		 ㄴ Engine 클래스 구현이 있어야 하는데 없으면 구현 
		 * 		Engine 인터페이스 구현 클래스 - H_engine, K_engine
		 */
		
		//[1]
		/*
		// 인터페이스 매개변수 다형성
		Engine engine = new K_engine2();
		Engine engine2 = new H_engine();
		Car myCar = new Car(engine);
		*/
		
		//2. 표준화가 가능하다.
		// Engine 인터페이스 구현해서 클래스를 만들었다면 
		// 그 클래스는 표준화 되어져 있다.
		
		//3. 서로 관련 없는 클래스들에게 인터페이스로 관계를 맺어줄 수 있다.
		// 	    ㄴ상속관계X (부모, 자식 관계X)
		// why?  
		
		//4. 독립적인 프로그래밍 가능하다. 
		// 		ㄴ 선언 + 구현 
		
	}
	
}
