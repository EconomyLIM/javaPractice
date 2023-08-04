package days05;

import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) {
		char one;
		String inputdata;
		String regex = "[#!$@]";
		try(Scanner sc = new Scanner(System.in)) {
			
			
			System.out.print("한문자 입력?");
			one = sc.next().charAt(0);
			
			if ( Character.isDigit(one) ) {
				System.out.println("숫자");
			}else if (Character.isAlphabetic(one)) {
				System.out.println("알파벳");
				
			}else if (one == '#' || one == '!' || one == '$' || one == '@') {
				System.out.println("특수문자");
				//정규표현식 [#$!@]
			}
			else if (('가' <= one && one <= '힣')||(('ㄱ' <= one && one <= 'ㅎ'))) {
				System.out.println("한글");
			
			} 
			else {
				System.out.println("x");
			}
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
