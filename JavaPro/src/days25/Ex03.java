package days25;


public class Ex03 {
	//						  0			1			2			3 순서
//	enum Direction{EAST, SOUTH, WEST,NORH}
//	enum Direction{EAST=100, SOUTH, WEST,NORH} // 문법에러
	enum Direction{
		EAST(100,"▶"), SOUTH(200,"◀"), WEST(300,"▼"),NORH(400,"▲");

		private final int  value;
		private final String symbol;
		/*
		Direction(int value) {
			this.value = value;
			}
		*/
		Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
			}
		public int getValue() {
			return value;
		}
		public String getSymbol() {
			return symbol;
		}
		// 추상메서드도 가능하다.
	}
// 왜생성자 필요?
	
	public static void main(String[] args) {
		//[열거형에 멤버 추가]
		// 열거형 구조 이해
		/* 1. enum Direction{EAST, SOUTH, WEST,NORH}
		 * 2. 컴파일러가 클래스 변환
		 * 		class Direction extends Enum { 
		 * 		static final Direction EAST = new Driection("EAST");
		 * 		static final Direction EAST = new Driection("SOUTH");
		 * 		static final Direction EAST = new Driection("WEST");
		 * 		static final Direction EAST = new Driection("NORTH");
		 * 
		 * 		private String name;
		 * 		private Direction (String name){
		 * 		this.name = name;
		 * 		}
		 * 	}
		 *  열거형 orinal()은 메서드에 의해서 열거형 상수를 사용하는데
		 *  내가 원하는 정수값을 설정해서 사용할 수 있다.
		 * 
		 */
		
		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(dir.value);
			System.out.println(dir.ordinal());
			System.out.println(dir.getSymbol());
		}
		
		
		System.out.println("");
		
	}
}
