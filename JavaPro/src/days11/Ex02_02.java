package days11;

import java.util.ArrayList;

public class Ex02_02 {
	public static void main(String[] args) {
		//1,순차 검색 sequential search
		//2. 이진검색 + 정렬 
		int m []  = {3,5,2,4,1};
		int n = 4;
//		int index =sequentialSearch(m,n);
		int temp[] = new int [m.length+1];
//		System.out.println(index);
		
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(6);
		
		int index = list.indexOf(4);
		System.out.println(index);
		System.out.println(list);
		list.add(index, 100);
		System.out.println(list);
	}

	private static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if(n == m[i]) {
				index =i;
				break;
			}//if
		}//for
		return index;
	} // sequentialSearch
}
