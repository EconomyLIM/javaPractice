package days06;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int code;
		//Syntax error on token "continue", invalid VariableDeclaratorId --> 변수 선언자 id가 잘못됐다
		// countinue: 예약어 --> 변수명 사용할 수 없다.
		char con = 'y';
		
		do {
			
			System.out.printf(" > 한문자 입력 ? ");
			code = System.in.read();
			System.out.printf("one = \'%c\' \n",(char)code);
			
			System.in.skip(System.in.available());
			
			System.out.print("\n\n continue? ");
			code = System.in.read(); // 'y', 'n'
			con = (char)code;
			
			System.in.skip(System.in.available());
			
		} while (con == 'y' || con =='Y');
		
		System.out.println("End");
		
		/*
		System.out.printf(" > 한문자 입력 ? ");
		code = System.in.read();
		System.out.printf("one = \'%c\' \n",(char)code);
		// System.in 입력스트림 ['a'] ['\r' 13 ] ['\n' 10]
		System.in.skip(System.in.available());

		System.out.printf(" > 한문자 입력 ? ");
		code = System.in.read();
		System.out.printf("one = \'%c\' \n",(char)code);*/
	}

}
