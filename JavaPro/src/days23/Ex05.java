package days23;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		
		// Set: HashSet, LinkedHashset
		// [TreeSet]
		/* 1. 중복허용x 순서유지x
		 * 2. 이진 검색 트리라는 구조로 데이터를 저장하는 컬렉션 클래스
		 * 3. 이진 검색 트리 - 검섹 ,정렬, 범위 검색하는데 성능 좋음
		 * 4. LinkedList처럼 노드Node가 서로 연결된 구조
		 * 5. 최상위 노드 : root(루트) 노드
		 * 		부모 - 자식 노드관계
		 * 		형제 노드 관계
		 * 6. 트리노드
		 * class Treenode{
		 * 		TreeNode left; 왼쪽 자식 노드
		 * 		Object element; 요소
		 * 		TreeNode right; 오른쪽 자식 노드
		 * }
		 */
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts); // [1, 4, 5, 6, 7, 9]
		System.out.println(ts.first()); // 1
		System.out.println(ts.last()); //9
		System.out.println(ts.subSet(4, 7)); //  [4, 5, 6]
		System.out.println(ts.higher(1)); // 4
		System.out.println(ts.lower(4)); // 1
		// 지정된 값(3)과 같은 객체를 반환
		// 트리 구조에 3값이 없으면 작은 값을 가진 객체중에 가장 가까운 값을 반환
		System.out.println(ts.floor(3)); // 1
		System.out.println(ts.ceiling(3));; // 4
		
		
		
		
		
		
		
		
		
		
	} //main
	
}
