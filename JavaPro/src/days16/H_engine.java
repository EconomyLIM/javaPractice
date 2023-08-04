package days16;

public class H_engine implements Engine {

	int speed;
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel*0.10;
	} // moreFuel

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel*0.10;

	} // lessFuel

	@Override
	public void stop() {
		this.speed = 0;

	} //stop

}
