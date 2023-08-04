package days10;

import java.util.Arrays;

public class Ex03_02 {
	public static void main(String[] args) {
		
		int [] m = new int[3];
		m[0]=5;
		m[1]=5;
		m[2]=5;
		//java.lang.ArrayIndexOutOfBoundsException
//		m[3]=5;
		
		
		int index =3;
		
		// 1. 원래 배열크기 + 3증가
		if (index == m.length) {
			int [] temp = new int[m.length+3];
		}//if
		
		// 2. m ->temp 요소 복소
	
		
		// 3. temp배열을 m 배열로 바꾸는 코딩
		
		m[3]=10;
		System.out.println(Arrays.toString(m));
		
	}//main
}
