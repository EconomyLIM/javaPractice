package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		//Arrays : 배열을 사용하기 쉽도록 기능이 구현된 클래스 
		//	sort(), binarySearch(), fill, copy
		// Collections 클래스 : Collection 클래스를 사용하기 쉽도록 기능이 구현된 클래스
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list); // []
		
		//1,2,3,4,5
		// <?super Objcet>의미
		//		objcet/...
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		// 4, 5, 1,2,3
		Collections.rotate(list, 2);
		System.out.println(list); // [4, 5, 1, 2, 3]
		
		Collections.swap(list, 0, 2);
		System.out.println(list); //[1, 5, 4, 2, 3]
		
		Collections.shuffle(list);
		System.out.println(list); // 무작위로 섞는 작업
		
		Collections.sort(list);
		System.out.println(list);//[1, 2, 3, 4, 5]
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list, -1);
		
		// Collections.copy(null, null);
		// Collections.replaceAll(null, null, null) 등등
		
	}
}
