package days18;

import java.util.IllegalFormatWidthException;

public class Ex08 {
	public static void main(String[] args) {
		//문자열 다루는 클래스(String...)
		/*
		 * String : 변경 불가능한 클래스
		 * StringBuffer
		 */
		String name = "홍길동";
		name +="님"; //힙영역의 인스턴스가 새로만들어진다.
		name +="안녕"; //힙영역의 인스턴스가 새로만들어진다.(주소가 새로 만들어진다.)
		String rrn = "123456-1234567";
		System.out.println(name);
		//1.
		System.out.println(name.length());
		//2.
		for (int i = 0; i < name.length(); i++) {
			System.out.printf("name[%d] = %c\n", i, name.charAt(i));
		} //for
		//3.
		System.out.println(name.substring(4));
		//4.정규식 패턴일치 여부 체크
		String regex = "\\d{6}-\\d{7}";
		rrn.matches(regex);
		
		//5. concat()
		String a = "ㅁㅁㅁ" + "ㅜㅜㅜ";
		String b = "ㅁㅁㅁ".concat("bbb");
		
		//6.
		//Streams rrn .chars()
		
		//7. 
		System.out.println("kenik".compareTo("kenik"));
		
		//8. 
		System.out.println("kenik".equals( "KeNik"));
		
		//9.
		boolean result = "안녕하세요 홍길동 입니다" .contains("송길동");
		//10.
		String url ="www.maver.com/test.jsp";
		String suffix = ".jsp"; // 접미사
		rrn.endsWith(suffix);
//		System.out.println(url.startsWith(prefix) );
//		System.out.println(url.endsWith(prefix) );
		
	} //main
}
