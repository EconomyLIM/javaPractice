package days22;

import java.util.HashSet;

public class Ex14 {
	public static void main(String[] args) {
		// Collection 인터페이스 자식
		// Set 인터페이스 구현한 컬렉션 클래스
		/* 특징: 순서 x, 중복허용 x
		 *  -Hashset
		 *  (참고) Set + 순서유지 o => LinkedHashSet
		 */
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(11);
		// 순서 저장x
		System.out.println(hs); // [1, 9, 11, 15]
		
		hs.add(1);
		System.out.println(hs); // [1, 9, 11, 15]
		
		System.out.println(hs.size());
		
	}
}
