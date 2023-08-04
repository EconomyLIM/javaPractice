package days16;

public class K_engine implements Engine {

	int speed;
	
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel*0.08;
	} // moreFuel

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel*0.08;

	} // lessFuel

	@Override
	public void stop() {
		this.speed = 0;

	} //stop

}
