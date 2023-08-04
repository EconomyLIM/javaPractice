package days10;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		//추가 : append
		//십입 : insert
		
		int index = 2;
		int n = 100;
		int [] tmp = new int [m.length+1];
		//[1]
//		System.arraycopy(m, n, tmp, index, n);
		//[2]
		for (int i = 0; i < m.length; i++) {
			if(i < index) {tmp[i] = m[i];}
			else if(i>=index) {tmp[i+1] = m[i];}
		} //for
		tmp[index] = 100;
		m=tmp;
		System.out.println(Arrays.toString(m));
	} //main
}
