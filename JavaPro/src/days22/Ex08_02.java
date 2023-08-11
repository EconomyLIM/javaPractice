package days22;

import java.util.LinkedList;

public class Ex08_02 {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		
		System.out.println(list); //[김호영, 이지현, 김정주]
		
		list.addFirst("유희진");
		System.out.println(list); // [유희진, 김호영, 이지현, 김정주]
		list.add(1, "임경재");
		System.out.println(list); // [유희진, 임경재, 김호영, 이지현, 김정주]
		
		System.out.println(list.size()); // 5
		
		System.out.println(list.contains("김동현")); // false
		System.out.println(list.indexOf("김동현")); // -1
		int m =-1;
		if (( m = list.indexOf("김정주") ) != -1) {
			list.set(m, "고경림");
		}else {
			System.out.println("없다");
		}
		System.out.println("「」");
		/* 비교						읽기	  추가,삭제		| 					비고
		 *  1. ArrayList		: 빠르다		느림		| 		   순차적인 추가,삭제가 빠름
		 *  2. LinkedList		: 느리다		빠름		| 데이터가 많으면 많을수록 접근성은 떨어짐 
		 */
	}
}


