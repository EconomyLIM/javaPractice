package days05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ex03 {

	public static void main(String[] args) {
		// ASCII 256가지
		//[1] 한라인에 10개씩 출력
		//[2] 라인번호를 붙이고싶다
		// ASCII 10 '\n' LineFeed(LF) 
		// ASCII 13 '\r' CarrageReturn(CR)
		//엔터 == 개행 == '\r\n'
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
//			if (i%10 ==0) {
//				System.out.printf("%d: ", i/10+1);
//			}
			if (i%10 ==0) {
			System.out.printf("%d: ", lineNumber++);
		}
			System.out.printf("[%c]", (char)i);
			if (i%10 == 9) {
				System.out.println();
			}
		} //for
	

	}
}
