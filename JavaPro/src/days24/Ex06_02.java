package days24;

import java.util.Arrays;
import java.util.Comparator;


public class Ex06_02 {
	public static void main(String[] args) {

		String [] names = {"이지현", "김호영", "임경재", "유희진"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER); // 대소문자를 구분하지 않고 오름차순으로 정렬

		System.out.println(Arrays.toString(names));
		/*
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		 */
		/*
			부모타입 객체명 = new 부모타입(매개변수...){
		 	(필드, 메서드도 올 수 있다.)
			@Override (부모것의)재정의함수 구현
		};
		 */  
		// 내림차순을 할때 Comparator 객체가 필요하다.
		/* [1] Comparator 인터페이스를 클래스 선언후 클래스 객체 생성해서 사용
		 * [2] 익명 클래스 사용
		 */

		Arrays.sort(names,(o1,o2) -> o2.compareTo(o1)); // 람다식으로 구현 가능
		
		System.out.println(Arrays.toString(names));

	}
}
