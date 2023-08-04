package days14;

public class Car {

	//field
	String name;
	String gearType;
	int door;
	//엔진 필요
	//	Engine engine = new Engine(); // 명시적 초기화 -->결합력이 높은 코딩(나쁜코딩)
	private Engine engine = null;
	{
		//인스턴스 초기화 블럭 
		//		this.engine = new Engine();
	}
	//constructor
	Car(){
		//		this.engine = new Engine(); // 생성자 초기화
	}

	public Car(Engine engine2) {
		this.engine = engine2;
	}

	//method
	void speedUP(int fuel) {
		this.engine.moreFuel(fuel);
	} //speedUP

	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}//speedDown

	void stop() {
		this.engine.stop();
	}//stop

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
