package days18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import days15.Temp;

public class Ex01_02 {
	public static void main(String[] args) {
		String [] names = {
				"김호영", "박정호", "주강민", "김정주", "고경림"
		};
		
		// 이름을 오름차순 정렬
		// 이름을 내림차순 정렬
//		Arrays.sort(names, Collections.reverseOrder());
		/*
		String [] nameS = new String [names.length];
		for (int i = names.length-1; i >=0 ; i--) {
			nameS[4-i] = names[i];
		} //for
//		
		
		 //배열 -> 가눙 구현 클래스 : Arrays클래스
		// 컬렉션 - ? 기능 구현 클래스 : Collections 클래스
		 * 
		*/
		/*
		//익명 클래스 x
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				return o1.equals(o2);
				return o2.compareTo(o1);
			}
		});
		
		*/
		//람다식
		Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));

		System.out.println(Arrays.toString(names)); 
	}

}
