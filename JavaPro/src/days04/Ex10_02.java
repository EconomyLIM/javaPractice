package days04;

public class Ex10_02 {

	public static void main(String[] args) {
		//임의의 수 발생시키는 클래스 메서드
		// 0.0 <= double <1.0
		for(int i = 1; i<= 10 ; i++) {
		System.out.println((int) (Math.random()*3)+1);
		}
	}
}
