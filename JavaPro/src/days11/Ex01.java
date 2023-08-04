package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {

		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int max = 0;
		int cnt = 0;
		int index[] = new int [m.length];
		
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]> max) {
				max = m[i];
			}
			
		}//for
		
		for (int i = 0; i < m.length; i++) {
			
			if (max == m[i]) {
				index[cnt++] = i;
			}
		} //for
		System.out.println(max);
		System.out.println(Arrays.toString(index));
//		String.join(null, args);
		
		int [] copyIndex =  Arrays.copyOf(index, cnt);
		System.out.println(Arrays.toString(copyIndex));
		
		
//		String string  = "index = ";
//		for (int i = 0; i < m.length; i++) {
//			if (max == m[i]) {
//				string +=i +",";
//			}
//		}
//		System.out.println(string.substring(0,string.length()-1));
		
	} // main
}
