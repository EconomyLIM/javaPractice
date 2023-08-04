package days16;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15_02 {
	// 개발자가 고의로 예외 발생시키기
			/*
			 * 1. new 예외 클래스()
			 * 2. throw문을 사용해서 예외를 발생시킬 수 있다.
			 * 
			 * 예)국어 점수를 입력받아서 수~가 등급 처리
			 * 		0~100 점수범위가 벗어나면 예외 발생 -> 처리
			 * 		
			 */
	public static void main(String[] args) {
		
		// checked 예외 -> 예외처리를 해야함
		//Unhandled exception type IOException
		// System.in.read();
		
		//unchecked 예외 -- >checked 예외로 바뀜
		//why? unChecked 예외 - > RuntimeException 상속
		// checked 예외 > IOException 상속
//		int kor = getScore();
		
		
		
//		System.out.println(kor);
		/*
		try {
			
		}catch (InputMismatchException e) {
			System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("end");	
		}
		*/
		
	} //main

	public static int getScore() throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		int score;
		
		System.out.print("국어점수 입력");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		}else {
			throw new IOException("점수를 벗어났다.");
		}
		
	}
}
