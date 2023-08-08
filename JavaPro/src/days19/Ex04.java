package days19;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		//Stringtokenizer
		String str = "고경림, 김성준, 김정주, 김호영";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		st.countTokens();
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		//예외 발생
		System.out.println(st.nextToken());
		*/
		int countToken  = st.countTokens();
		for (int i = 0; i < countToken; i++) {
			System.out.println(st.nextToken());
		} //for
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
