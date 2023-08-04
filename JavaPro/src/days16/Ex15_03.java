package days16;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15_03 {

	public static void main(String[] args) {
		
		try {
			
		}catch (ScoreOutOfBoundException e) {
			System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("end");	
		}
		
		
	} //main

	public static int getScore() throws ScoreOutOfBoundException{
		
		Scanner scanner = new Scanner(System.in);
		int score;
		
		System.out.print("국어점수 입력");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		}else {
			throw new ScoreOutOfBoundException("점수를 벗어났다.");
		}
		
	}
}
