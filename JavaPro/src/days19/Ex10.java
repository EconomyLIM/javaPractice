package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {
		// 정규표현식(Regular Expression) 
		// String regex
		// 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		// 미리 정의된 기호가 있다.
		// 자바에서는 정규표현식과 관련된 클래스가 두개 밖에 없다.
		// String이라는 클래스안에 matches(regex) 함수 말고
		/*
		 * 1) Pattern 클래스 
		 * 2) Matcher 클래스 
		 */
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		// 1) data라는 배열에 들어있는 단어들 중에 c로 시작하는 단어를 모드 찾아서 출력
		//			 data[i].startsWith("c")
		//			 data[i].matches(regex)
		// 2) 
		
		//String regex = "c.*";
//		String regex = "c[a-zA-Z]*"; //c시작 +영문자 0 이상
//		String regex = "c[a-z]"; // c시작 + 소문자 하나
//		String regex = "c\\w"; // '\w' == [a-zA-Z0-9]
//		String regex = ".*"; // '.' == 모든문자란 소리-> .* == 모든 문자 출력
//		String regex = "c.*t"; // c와 t사이 모든문자
//		String regex = "c\\d"; // '\d' == [0-9]
//		String regex = "c\\D"; // '\D' == [^0-9]
		//String regex = "(b|c)"; // b or c
//		String regex = "(b|c).*"; // b or c
//		String regex = "[bc].*"; // b or c
//		String regex = "[bcd].*"; // b or c or d == [b-d]
//		String regex = "[bcd].{2,3}"; // b or c or d == [b-d]뒤에 두문자 or 세문자 와야한다.
//		String regex = "[bcd].+"; //1개이상
//		String regex = "[bcd].?"; //1개이상 또는 0개 이상
		
		String regex = "[a-zA-Z&&[^b-d]].*"; //알파벳 대문자 소문자 중에 bcd문자는 제외 + 모든0개에서부터 여러개
		
		
		
		
		
		
		// \\s공백 / \\S공백이 아니여야 한다.
		
		Pattern p = Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if( m.matches() ) {
				System.out.println(data[i]);
			}
		} //for
	}
}
