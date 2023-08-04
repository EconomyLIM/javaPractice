package days09;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		
		// 정수를 입력받아서 2진수로 출력하는 코딩을 하세요.
		/*[1]
		int n = 10;
		String s = "00000000000000000000000000000000";
		String b = Integer.toBinaryString(n);
		s+=b;
		System.out.println(s);
		// 오버로딩, 중복함수
//		s.substring(beginIndex);
//		s.substring(beginIndex,endIndex);
		System.out.println(s.substring(b.length()));*/
		
		/*[2]
		int n = 10;
		String b = Integer.toBinaryString(n);
		String string = String.format("%032d\n", Integer.parseInt(b));
		System.out.println(string);*/
		
		/*[3]
		int n = 10;
		int i = 31;
		int [] c = new int[32];
		
		do {
		if (n%2 == 1) {
			c[i--] = 1;
			n /= 2;
		}//if
		else {
			c[i--] = 0;
			n /= 2;
		}//else
	} while (n>0); //while
		
		for (int j = 0; j < c.length; j++) {
			System.out.printf("%d",c[j]);
		} //for*/
		int n = 10, share, reminder;
		int [] binaryIndex = new int[3];
		while (n != 10) {
			
			share = n/2;
			reminder = n%2;
			share += reminder;
			System.out.println(Arrays.toString(binaryIndex).replace(", ", " "));
			n = share;
		}
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.reverse();
	}
}
