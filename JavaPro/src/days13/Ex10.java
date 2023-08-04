package days13;

public class Ex10 {
	public static void main(String[] args) {
		
		// [리턴자료형이 참조타입]
		/*
		 * Point 클래스 안에 메서드 추가
		 * 		ㄴ Point 객체를 매개변수로 받아서
		 * 			x, y좌표를 10씩 증가 시킨후
		 * 			증가시킨 좌표를 반환하는메소드 
		 */
		
		Point p1 = new Point();
		p1.x = 1;
		p1.y = 2;
		
		//객체명.메서드명
//		Point p2= p1.plusPoint(p1);
		Point p2 = new Point();
		p2.x = 10;
		p2.y = 20;
		p2= p2.plusPoint(p2);
		p2.dispXY();
		
		p1.plusPoint();
	} //main
}
