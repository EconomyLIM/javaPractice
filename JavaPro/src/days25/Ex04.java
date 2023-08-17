package days25;

import java.util.Date;
import java.util.Scanner;

public class Ex04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* @어노테이션
		 * 1. 사전적의미 : 주석
		 * 2. 프로그램 소스코드 안에 다른 프로그램을 위한 미리앿곡된 형식을 포함시킨 것
		 * 3. JDK에서 기본적으로 제공하는 어노테이션을 "표준 어노테이션"
		 * 4. 표준 어노테이션 -> 컴파일러(다른프로그램)
		 * 		1) @Override: 컴파일러에게 오버 라이딩 한 메소드임을 알려주는 어노테이션
		 * 		2) @SuppressWarnings : 컴파일러의 특정 경고메시지가 나타나지 않게 사용하는 어노테이션
		 * 		3) @Deprecated : 앞으로 없어진 생성자 필드 메소드
		 *		4) @FunctionInterface : 함수형 인터페이스를 알려주는 어노테이션(람다식)
		 *			함수 + 인터페이스
		 *		5) @SafeWarags : 제네릭 타입의 가변인자에 사용되는 어노테이션
		 *		6) @Native : native메서드에서 참조되는 상수 앞에 붙암 ( c언어를 사용해서 만든 메서드)
		 *		[메타 어노테이션] : 어노테이션에 사용되는 어노테이션
		 *		7) @target
		 *		8) @Documented
		 *		9) @Inheritird
		 *		10) @Retention
		 *		11) @Repeatable
		 *
		 */		
//		컴파일러 경고-> 선언했는데 사용하지 않아서
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		
	}

	@Override
	public String toString() {
		return "Ex04";
	}
	
}
