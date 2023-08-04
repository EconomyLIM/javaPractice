package days08;

import java.util.Scanner;



public class Ex01 {
	

	public static void main(String[] args) {
		
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			int kor = getScore(scanner, "국어");
//			int eng = getScore(scanner, "영어");
//			int mat = getScore(scanner, "수학");
			//국어 점수의 등급 출력
			char grage = getGrade(kor);
			System.out.printf("kor> grade:%c>\n", grage);
//			System.out.printf("%d %d %d", kor, eng, mat);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} //main

	private static char getGrade(int score) {
		char grade = '가';
		
		switch (score/10) {
		case 10: case 9: grade='수'; break;
		case 8: grade='우'; break;
		case 7:  grade='미'; break;
		case 6:  grade='양'; break;

		default:
			break;
		}
		
		return grade;
	}

	public static int getScore(Scanner scanner, String subject) {
		int score = 0;
		boolean flag = false;
		String inputData; 
		String regex = "100|[1-9]?\\d";
		
			do {
				if (flag) {
					System.out.println("점수 입력 잘못(0~100)");
				}
				System.out.printf("%s점수 입력: ", subject);
				inputData = scanner.nextLine();
				flag = true;
			} while (!inputData.matches(regex));
			
			score = Integer.parseInt(inputData);
			
		
		return score;
	}
	
}
