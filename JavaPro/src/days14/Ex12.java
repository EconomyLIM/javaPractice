package days14;

public class Ex12 {
	public static void main(String[] args) {
		/*
		 * [클래스들간의 관계]
		 * 1. has -a 관계
		 * 		2개의 클래스 선언
		 * 		Car		클래스
		 * 		Engine	클래스 - 연료, 구동장치
		 * 		Car클래스는 Engine클래스는 가지는 has 관계라고 한다.
		 * 2. is - a관계 (상속)
		 */
		Engine engine = new Engine();
//		Car myCar = new Car(engine); // 의존성 주입(DI)
		// DI 2가지 방법
		// 1)생성자 통해서 DI
		// 2)setter 통해서 DI
		
		Car MyCar = new Car();
		MyCar.setEngine(engine);
		MyCar.speedUP(100);
		int carSpeed =  MyCar.getEngine().speed;
		
		System.out.println(carSpeed);
		
		MyCar.speedDown(10);
		carSpeed =  MyCar.getEngine().speed;
		System.out.println(carSpeed);
		
		MyCar.stop();
		carSpeed =  MyCar.getEngine().speed;
		System.out.println(carSpeed);
	}//main
}
