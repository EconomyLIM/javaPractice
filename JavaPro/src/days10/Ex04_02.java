package days10;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04_02 {
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//추가 , 삽입, 수정
		
		//삭제
		int tmp[] = new int [m.length-1];
		System.arraycopy(m, 0, tmp, 0, 2);
		System.arraycopy(m, 3, tmp, 2, 2);
		m = tmp;
		System.out.println(Arrays.toString(m));
		// 0 1 2 3 4 
		// 0 1 2 3
		int [] m2 = {3,5,2,4,1};
		for (int i = 0; i < tmp.length; i++) {
			if(i<2) {tmp[i] = m2[i];}
			else if (i>=2) {tmp[i] = m2[i+1];}
		}
		m2 = tmp;
		System.out.println(Arrays.toString(m));
	} //main
}
