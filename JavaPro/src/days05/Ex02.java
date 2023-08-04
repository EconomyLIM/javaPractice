package days05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//한문자 입력받기
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			// 문자열 맨 앞을 얻어온다는 표현이 맞는말
			
			System.out.print("한문자 입력?");
			one = sc.next().charAt(0);
			
			if ('0' <= one && one <= '9') {
				System.out.println("숫자");
			}else if (('a' <=one && one<='z') || ('A'<= one && one<='Z')) {
				System.out.println("알파벳");
			}else if (one == '#' || one == '!' || one == '$' || one == '@') {
				System.out.println("특수문자");
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
	
	private  static void  name() {
		Scanner sc = new Scanner(System.in);
		char one2 = sc.next().charAt(0);
	}
}
