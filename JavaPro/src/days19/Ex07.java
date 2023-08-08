package days19;

public class Ex07 {
	public static void main(String[] args) {
		
		//[오토박싱과 오토언박싱]
		
		int i = 100; //변수
		Integer j  = i; //j == 클래스 타입의 객체 ==> 기본형 (i) ->객체 (j) ==> 변경하는 작업을 = 박싱->오토박싱
		int k = j; // 객체 j가 기본형 변환 -> 오토언박싱
		
		teeeeeeeeest(i); // int
		teeeeeeeeest(j); // Integer 클래스
		teeeeeeeeest('a'); // Integer 클래스
//		teeeeeeeeest(true); // Integer 클래스
		
		
		
	}//main
	private static void teeeeeeeeest(Object i) { // Object로 매개변수를 주면 모든 자료형을 매개변수로 받아서 처리
		System.out.println(i);
		if(i instanceof Integer) {
			int z = (int)i+100;
			System.out.println(z);
		}
		else if (i instanceof Character) {
			char c = Character.toUpperCase((char)i);
			System.out.println(c);
		}
	}
	/*
	private static void teeeeeeeeest(int i) { //Integer -> int 형변환
		System.out.println(i);
	}
	*/
}
