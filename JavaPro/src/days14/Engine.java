package days14;

public class Engine {

	//field
	int speed;
	
	//constructor
	public Engine() {

	}
	
	//method
	void moreFuel(int fuel) {
		this.speed += fuel*0.05;
	} // moreFuel

	void lessFuel(int fuel) {
		this.speed -= fuel*0.05;
	} // lessFuel
	
	void stop() {
		this.speed = 0;
	} //stop
	
} //class Engine
