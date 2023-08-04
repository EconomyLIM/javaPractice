package days07;

import java.util.Scanner;

public class prac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor = getScore(scanner, "국어");
		
//		System.out.printf();
	 //main
	

	}
	public static int getScore(Scanner scanner, String subject) {
		int score = 0;
		boolean flag = false;
		String inpuData;
		String regex = "100|[1-9]?\\d";
		
		do {
			if (flag) {
				System.out.println("점수 입력 잘못");
			}
			System.out.printf("%s 점수입력",subject);
			inpuData = scanner.next();
			flag = true;
		} while (!inpuData.matches(regex));
		
		score = Integer.parseInt(inpuData);
		return score;
	}//getScore
}
