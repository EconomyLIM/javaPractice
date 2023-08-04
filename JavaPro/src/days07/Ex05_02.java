package days07;

import java.util.Scanner;

public class Ex05_02 {
	int a = 1;
	public static void main(String[] args) {
		/*
		 * 국어 점수를 입력받아서  0<=<100
		 * 
		 */
		
		int [] kors = {99, 1, 100, 101, -90,0};
		String kor = "100";
//		String regex = "\\d{1,2} |100"; //09
//		String regex = "[0-9] |[1-9][0-9] |100"; //09
		String regex = " 100 | [1-9]?\\d "; //09
		
		System.out.println(kor.matches(regex));
		try(Scanner scanner = new Scanner(System.in)) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	} // main
}
