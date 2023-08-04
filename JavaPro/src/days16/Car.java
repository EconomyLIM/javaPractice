package days16;

public class Car {

	//field
	String name;
	String gearType;
	int door;
	private Engine engine = null;
	
	{
		//인스턴스 초기화 블럭 
		//		this.engine = new Engine();
	}
	//constructor
	Car(){
		//		this.engine = new Engine(); // 생성자 초기화
	}

	public Car(Engine engine) {
		this.engine = engine;
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
