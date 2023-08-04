package days02;

import java.security.GuardedObject;

public class Ex08 {
	public static void main(String[] args) {
		
	    int age = 1124;
		System.out.println(age);
		gob();
		
		// 1비트 = 0,1
		// 1바이트 = 8비트 : 
		//정수 유형 + 1바이트 크기 할당 : byte
		//정수 유형 + 2바이트 크기 할당 : short
		//정수 유형 + 4바이트 크기 할당 : int
		//정수 유형 + 8바이트 크기 할당 : long
	}
	
	public static void gob() {
		for (int i = 1 ; i <= 9 ; i++) {
			for (int y = 1 ; y<= 9 ; y++) {
				System.out.printf("%d X %d = %d \n", i, y, i*y);
			}
		}
	}

}
