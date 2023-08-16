package days24;

public class Ex14 {
	public static void main(String[] args) {
		// 열거형 - 자료형
		// 1.jdk1.5 추가
		// 2. 서로 관련된 상수를 편리하게 편리하게 선언하기 위한것
		// 예) 팀 프로젝트 - 남자 여자 체크해서 코딩
		/*		표준화가 안됨 - 코딩하는 사람들 코드 다다름 - 유지보숨 힘듦
		 * 3. 열거형 선언 형식
		 * enum 열거형 이름 { 상수명, 상수명, ...};
		 * 4. 열거형 -> 컴파일될 때 -> 클래스
		 * 		열거형의 부모 클래스는 java.lang.Enum 클래스이다.
		 * 5. 열거형을 사용하는 방법 : 열거형이름 .상수명
		 * 6. Enum 클래스
		 * 		1) name(); : 열거형 상수 이름ㅇ르 문자열로 반환
		 * 		2) ordinal() : 열거형 상수가 정의된 순서를 반환
		 * 		3) valueOf() : name과 일치하는 열거형 상수를 반환
		 * 		4) getDeclaringClass() : 열거형의 class 객체 반환
		 */
		Card [] cards = Card.values();
		for (Card card : cards) {
			System.out.printf("%s \t %d\n",card.name(), card.ordinal());
		}
		 System.out.println(Card.valueOf("HEART")); //Card안에있는 상수 HEART 
		 
		 switch (Card.valueOf("HEART")) {
		case CLOVER:
			break;
		case DIAMOND:
			break;
		case HEART:
			System.out.println("1234");
			break;
		case SPACE:
			break;
		default:
			break;
		}
		 
		 Card ctype = Card.valueOf("HEART");
	}
	class InnerA{}
	interface InnerIA{}
	enum InnerCard{}
	// 어떨떄 클래스들을 안에 선언이나 밖에 선언하는지
	// 바깥클래스에 밀접한 관련(그 클래스 안에만 쓰겟다하면 안에다 선언)
}

class A{
	
}
interface IA{
	
}

//enum Card {
//	
//}