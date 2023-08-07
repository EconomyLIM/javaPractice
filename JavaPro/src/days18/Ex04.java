package days18;

public class Ex04 {
	public static void main(String[] args) {
		// Object. hashCode () 메서드
		// 해시-> 해시함수 (해싱기법)
		// 	ㄴ 데이터 관리 기법중의 하나.
		//  ㄴ " 			: 저장, 검색 등등
		//  ㄴ	객체 저장 -> 주소 값 -> 해시코드 변환 -> 반환하는 메서드
		// 해시코드가 같지 않으면 같은 객체가 아니다.
		// [참고] 동일한 객체인지 체크 = 물론 equals() + hashcode둘다 오버라이딩을 해야한다. 
		
		//String s1 = "홍길동";
		//String s2 = "홍길동";
		//String 참조 -> 배열 인터페이스 (클래스)이다.
		//String 클래스이므로 new String이라고 써야한다. -> 하지만 그냥 String만 썻다 -> 왜?? 
		// String 클래스 equals와 hashcode는 오버라이딩 되어있다.. 
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
