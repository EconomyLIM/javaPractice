package days14;

public class Ex05 {
	public static void main(String[] args) {
		// 시험[3]
		// this 키워드 
		/*
		 * 1. 정의: 객체 자기 자신의 주소 값을 가지는 참조 변수
		 * 2. this의 세가지 용도
		 * 		1) 멤버를 가리킬 때의 this // Ex)this.필드명 this.메소드명 -->Point (int x, int y)
		 * 		2) 생성자에서 또 다른 생성자를 호출할 때의 this
		 * 		3) 단독으로 사용할때의 this : 리턴값, 매개변수
		 */
		
		Person p = new Person();
		//[name][age][gender][getter]... - > [0x100]
		//0x100												p
		
//		Point p3 = new Point(39);
//		p3.printPoint();
		
	}//main
}
