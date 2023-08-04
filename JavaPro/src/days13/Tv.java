package days13;

//public class Tv {
//illegal modifier for the class Tv; only public, abstract & final are permitted
// private class Tv {
class Tv {
	// 클래스 안에있는 구성 --> 멤버
	// 멤버변수(필드 field) / 지역변수 X
	// 멤버변수는 초기화 하지 않으면 각 자료형의 기본 값으로 초기화 되어져 있다.
	// 선언 형식: [접근 지정자][기타 제어자] 자료형 필드명[=초기화];
	public String color; // string의 초기값 = null
	public boolean power; // 초기값 = false
	public int channel; // 초기값 = 0;

	// 멤버 함수(메서드 method)
	public void power() {
		power  = !power;
	} //power
	// ↑ 
	public void channelUP() {
		channel++;
	} // channelUP
	// ↓
	public void channelDown() {
		channel--;
	} // channelDown

} //class
