package days14;

public class Point {

	//필드
	private int x;
	private int y;
	
	// 디폴트 생성자
	public Point() {
		System.out.println("point 디폴트 생성자 호출됨");
	} // Default Point

	public Point(int x, int y) {
		this.x = x;
		//[this 안넣을시]The assignment to variable x has no effect
		this.y = y;
		
		System.out.println("point 2 생성자 호출됨");
	} // Point
	
	public Point(int i) {
		this(i,i); // 매개변수 두개짜리 생성자 Point 호출하는 코드 --> Point(x,y)
		System.out.println("point 1 생성자 호출됨");
		
//		this.x = i;
//		this.y = i;
	}

	// 호출한 객체: p1
	// p1.printPoint()
	// p2.printPorint()
	// 객체명.필드명,메소드명
	public void printPoint() {
		System.out.printf("x= %d, y= %d",this.x,this.y);
	} // printPoint
	
	//p1.offsetPint(10)
	public Point offsetPoint(int n) {
		this.x += n;
		this.y += n;
		
		return this;
	}
	
} // class 
