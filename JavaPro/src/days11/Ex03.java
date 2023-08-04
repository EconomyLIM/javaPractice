package days11;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int max = 92;
		int beginIndex = 0;
		int index =0;
//		while (index != -1) {
//			sequentialSearch(m, max, beginIndex);
//			if(index != -1)
//			System.out.println("찾은 위치 index:"+index );
//		}
//		
		while ((index = sequentialSearch(m, max, beginIndex)) != -1) {
			System.out.println("찾은 위치 index:"+index );
			beginIndex = index + 1;
		}
		/*
		int index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치 index:"+index );
		
		beginIndex = index + 1;
		index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치 index:"+index );
		
		beginIndex = index + 1;
		index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치 index:"+index );
		*/
		
		
		// 순차검색을 사용해서 max가 있는 위치 모두 출력
		
//		for (int i = 0; i < m.length; i++) {
//			if (m[i] == max) {
//				System.out.println(i);
//			} //if
//		}//for
//		
//		ArrayList list = new ArrayList();
//		for (int i = 0; i < m.length; i++) {
//			if (m[i] == max) {
//				list.add(i);
//			} // if
//		} //for
//		System.out.println(list);
//		
	} // main
	
	private static int sequentialSearch(int[] m, int n, int beginIndex) {
		int index = -1;
		for (int i = beginIndex; i < m.length; i++) {
			if(n == m[i]) {
				index =i;
				break;
			}//if
		}//for
		return index;
	} // sequentialSearch

}
