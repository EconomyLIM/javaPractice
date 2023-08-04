package days13;

public class Point { //좌표 필드 구현
	//필드
	public int x = 0;
	public int y = 0;
	
	//메서드
	public void dispXY() {
		System.out.printf("x=%d, y=%d\n",x,y);
	} // dispXY
	
	//리턴자료형이 Point 클래스의 참조타입
	public Point plusPoint(Point p) {
		// 새로운 좌표객체를 생성해서 반환
		Point p2 = new Point();
		p2.x = p.x+ 10;
		p2.y = p.y +20;
		
//		int z = p.x + p.y;
		
		return p2;
	} // plusPoint
	
	
	//중복함수 오버로딩
	public void plusPoint() {
		System.out.printf("x=%d, y=%d",x,y);
	}
	
} //class 
