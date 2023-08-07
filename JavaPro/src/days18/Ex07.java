package days18;

public class Ex07 {
	public static void main(String[] args) {
		// [객체로 부터 Class 얻어오는 3가지 방법]
		Card card1 = new Card("HEART",3 );
		// 1) 첫번째 방법 : getClass() 메서드
		/*
		Card card1 = new Card("HEART",3 );
		Class cls =  card1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		*/
		
		/*//[2] 두번째 방법: 모든 클래스명.class클래스 변수가 제공된다.
		Class cls = Card.class;
		System.out.println(cls);
		// Class cls 얻어와서 객체를 생성해보자
		try {
			Card card2 =  (Card) cls.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//[3] 새번째 방법 : Class 클래스의 static 메서드 - forName()
		String className = "days18.Card";
		try {
			Class cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // main
}

final class Card{
	String kind;
	int num;
	
	Card(){
		this("'SPACE", 1);
	} // Card
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	} // Card
	
	@Override
	public String toString() {
		return super.toString();
	} //toString
	
} // Class Card