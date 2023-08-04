package days15;

import days07.prac;

public class Ex04 {
	public static void main(String[] args) {
		Point center = new Point(50,50);
		int r = 10;
		
		Circle c = new Circle(center, r);
		c.color = "red";
		//Shape 부모크랠스로부터 물려받은 draw메서드 수정
		// 재정의 함수 = 오버라이딩
		// 중복함수 = 오버로딩
		// 
		c.draw();
		
		System.out.println("-".repeat(30));
		//클래스 배열 초기화
		Point p[] = {
			new Point(1,1),
			new Point(20,40),
			new Point(10,6),
		};
		Triangle t = new Triangle(p);
		t.draw();
		
		System.out.println("-".repeat(30));
	}
}
 //자바는 컴파일러가 자동으로 extend java.lang.Object
class Point extends java.lang.Object{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point (){
		this(0,0);
	}
	
	String getXY() {
		return String.format("(%d, %d)",this.x , this.y);
	}
}
// 도형
class Shape{

	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s] \n", this.color);
	}
} // class Shape

class Circle extends Shape{
	
	Point center; //has - a 관계
	int r;
	
	public Circle() {
		this(new Point(0,0), 0);
	}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	// 그리기 메소드
	// @애노테이션 (annotation)
	@Override
	void draw() {
//		System.out.printf("[color=%s, center = (%d, %d)] \n", this.color, this.center.x , this.center.y);
		System.out.printf("[color=%s, center = %s] \n", this.color, this.center.getXY());
	}
	
} // class Circle

class Triangle extends Shape{
	Point [] p = null;

	public Triangle(Point [] p) { // 생성자 DI
		this.p = p;
	}
	
	@Override
	void draw() {
		
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n",
				this.p[0].getXY(), 
				this.p[1].getXY(),
				this.p[2].getXY());
	}
	
	
} // class Triangle

////원 
//class Circle{
//int x,y; //원점
//int r ; //radius
//
//public Circle () {}
//Circle(int x, int y, int r){
//	this.x = x;
//	this.y = y;
//	this.r = r;
//}
//}



