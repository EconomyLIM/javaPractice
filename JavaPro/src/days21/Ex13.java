package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex13 {
	public static void main(String[] args) {
		/*
		 *  1. 컬렉션 클래스 - 다수의 데이터를 다를수 있는 클래스 -ArrayList
		 *  		ㄴ	가장 많이 사용되는 컬렉션 클래스
		 *  		ㄴ List 인터페이스를 구현한 클래스 (순서 있고 중복허용하고@_@)
		 *  		ㄴ Array가 붙은걸 봐서는 배열처럼 사용한다.
		 *  		ㄴ 하나의 값들을 배열 요소(element)라고한다.
		 *  		ㄴ 배열을 사용할까요 ArrayList를 사용할까요?
		 *  		ㄴ 배열의 단점이 보안된게 ArrayList (참고: days10.Ex03)
		 *  		ㄴ 성능을 요구하는거라면 배열을 쓰는게 나을 수 있다. 
		 *  		
		 */
		
		String [] names = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println(names.length);
//		names[3] = "이지현";
		// 검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("정하영")) System.out.println(names[i]);
		} //for
		Arrays.fill(names, null);
		ArrayList list = new ArrayList(3); // 크기를 설정하지 않으면 초기 크기는 10
		list.add("주강민"); //0
		list.add("정하영"); //1
		list.add("임경재"); //2
		list.add("이지현"); //3
		System.out.println(list.size());
		System.out.println(list.get(3)); //이지현
		// 검색 후 출력
		System.out.println(list.contains("정하영"));
		int index = list.indexOf("정하영");
		if(index != -1) {
			System.out.println(list.get(index));
			list.remove(index);
			list.add(index, "이상문");
		}else {
			System.out.println("없다");
		}
		System.out.println(list);
		index = list.lastIndexOf("정하영"); //뒤에서 부터 찾는다
//		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		// ***iterator  = 요소를 반복적으로 처리할 수 있는 반복자(Iterator)를 반환하는 메세드***
		// hasNext() -> 다음 요소가 있으면 true 없으면 false
		Iterator ir =  list.iterator();
		while (ir.hasNext()) {
			
			// 다음요소를 얻어오는 메소드.next();
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
	} //main
}
