package days16;

public class K_engine2 extends K_engine {

//	int speed; this 말고 super을 쓰면 부모껄 쓸수 있다
	
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel*0.12;
	} // moreFuel

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel*0.12;

	} // lessFuel

	@Override
	public void stop() {
		this.speed = 0;

	} //stop

}
