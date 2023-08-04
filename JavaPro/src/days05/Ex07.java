package days05;

import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		int code;
		char one;
		
		//[1]
		System.out.printf("한문자입력>");
		code = System.in.read();
		System.out.printf("code = %d\n",code);
		one = (char)code;
		System.out.printf("code = %c\n",one);
		
		//System.in.read(); //13
		//System.in.read(); //10
		System.in.skip(System.in.available()); // System.in.available() > inputStream에 가능한 바이트 
		
		//[2]
		System.out.printf("한문자입력>");
		code = System.in.read();
		System.out.printf("code = %d\n",code);
		one = (char)code;
		System.out.printf("code = %c\n",one);
	} //main
} //class
