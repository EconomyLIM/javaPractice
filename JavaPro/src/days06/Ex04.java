package days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		String name;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">이름 입력");
//			name = scanner.next(); 
			name = scanner.nextLine();
			
			
			/*
			 * [1]
			 * char [] nameArr = new char[name.length()];
			for (int i = 0; i < nameArr.length; i++) {
				nameArr[i] = name.charAt(i);
			}
			System.out.println(Arrays.toString(nameArr));*/
			
			char [] nameArr = name.toCharArray();
			
			//char[] -> String 변환
			name = String.valueOf(nameArr);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
