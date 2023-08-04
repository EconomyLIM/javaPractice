package days10;

import java.util.Arrays;

public class Ex03_03 {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int [] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
		
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
//			System.arraycopy(m, index, temp, index, index); //[복사당할 배열] [복사 시작할 곳] [복사할 배열] [복사할 배열안 시작할 곳] [몇개 복사할건지] 
			System.arraycopy(m, 0, temp, 0, m.length);
			//Arrays클래스
			
			m = temp;
		}//if
		m[3]=10;
		System.out.println(Arrays.toString(m));
		
	}//main
}
