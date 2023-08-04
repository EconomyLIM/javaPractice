package days13;

public class Ex07_03 {
	
	public static void main(String[] args) { //참조형 매개변수 args 
		//참조형 매개변수 반댓말 = 기본형 매개변수	
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		
		swap(p);
		System.out.println(p.x+"," +p.y);
		
	} // main
	// 메서드의 매개변수 Point p 객체타입
	//참조형 매개변수
	private static void swap(Point p) { // 클래스 복사 -> 동일한 인스턴스를 가르키기 떄문에
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}
}
