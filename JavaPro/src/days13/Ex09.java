package days13;

public class Ex09 {
	public static void main(String[] args) {
		// 클래스 복사(copy)
		
		/*
		 * 클래스 복제 (clone)
		 * 		ㄴ 얉은 복제
		 * 		ㄴ 깊은 복제
		 */
		
		Point p = new Point();
		
		// 객체명.필드명
		// 객체명.메서드명
		p.x = 100;
		p.y = 200;
		
		//클래스 복사(동일한 인스턴스를 참조)
		Point pcopy = p;
		pcopy.x=1;
		
		System.out.println(p.x); //1
		
		//클래스 복제
		Point pclone = new Point();
		pclone.x = p.x;
		pclone.y = p.y;
	} //main
}
