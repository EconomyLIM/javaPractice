package days05;

import java.util.Scanner;

public class Ex02_05 {

	public static void main(String[] args) {
		char one;
		try(Scanner sc = new Scanner(System.in)) {
			
			
			System.out.print("한문자 입력?");
			String inputData = sc.next();
			String regex = "[#@$!]"; // 자바 정규표현식 [^aeiouAEIOU] --> 모음 제외 
			if (inputData.matches(regex)) {
				System.out.println("특수문자");
			}//if
			
			String inputData_2 = sc.next();
			String regex2 = "[!#$%]";
			if(inputData_2.matches(regex2)) System.out.println("특수문자");
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
