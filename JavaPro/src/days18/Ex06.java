package days18;

public class Ex06 {
	public static void main(String[] args) {
		
		Person p1 = new Person("111", "홍길동");
		
		/*
		try {
			// clone() 오버라이딩 불편한 점 
			// 다운캐스팅으로 해야한다.
			Person p1Clone = (Person) p1.clone();
			System.out.println(p1Clone);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Person p1Clone = p1.clone();
		System.out.println( p1.hashCode());;
		System.out.println(p1Clone.hashCode());
		Person p3 = p1;
		
		System.out.println( p3.hashCode());;
		System.out.println(p3.rrn);
		/*
		 * 클론을 할려면 implement로 선언
		 * clone 메소드 오버라이딩
		 */
	} //main
}
