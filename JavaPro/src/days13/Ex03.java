package days13;

public class Ex03 {
	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Tv 객체 생성
//		Tv tv1 = null;
		Tv tv1 = new Tv();
		//Exception in thread "main" java.lang.NullPointerException
		// 클래스 사용할때 NullPointerException 오류가 가장 많이 발생
		
		//			멤버를 가리킬떄
		// 객체명.필드명
		// 객체명.메서드명()
		tv1.power();
		System.out.println("Tv: " + (tv1.power ? "ON" : "OFF"));
		tv1.channelUP();
		System.out.println("현재 채널: "+tv1.channel);
		tv1.power();
		System.out.println("Tv: " + (tv1.power ? "ON" : "OFF"));
		System.out.println("end");
		
	} // main
} // class
