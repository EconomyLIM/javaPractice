package days04;

import java.util.Scanner;

public class Ex10_03 {

	public static void main(String[] args) {
		
		int com, user;
		
		try(Scanner scanner = new Scanner(System.in)) {
		System.out.printf("> user 가위(1), 바위(2), 보(3) 선택?");
		//입력값에 대한 유효성 검사
		user = scanner.nextInt();
		
		com = (int) (Math.random()*3)+1;
		String [] rcp = {"가위", "바위", "보"};
		
		System.out.printf("사용자: %d(%s), 컴퓨터: %d(%s) \n", user,rcp[user-1], com, rcp[com-1] );
		switch (user - com) {
		case 1: case -2:
			System.out.println("사용자 승리");
			break;
		case 2: case -1:
			System.out.println("컴퓨터 승리");
			break;
		default:
			System.out.println("무승부");
			break;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
