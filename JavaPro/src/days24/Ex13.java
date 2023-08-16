package days24;

public class Ex13 {
	public static void main(String[] args) {
		Box05<String> box1 = new Box05<>();
		
		Box05 box02 = new Box05();
		// == Box05<Object> box02 = new Box05<>();
		/*
		 * 원시타입과 제네릭타입간의 형변환
		 * 경고만 발생키기고 자동으로 사용 가능
		 * <T> 없으면 Object 타입으로 컴파일 된다.
		 */
	}
}
