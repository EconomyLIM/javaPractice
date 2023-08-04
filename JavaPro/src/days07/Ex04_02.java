package days07;

import java.util.Scanner;

public class Ex04_02 {
	int a = 1;

	public static void main(String[] args) {
		String regex = "[1-3]";

		int com, user;
		char ans = 0;
		
		do {
			try(Scanner scanner = new Scanner(System.in)) {
				System.out.printf("> user 가위(1), 바위(2), 보(3) 선택?");
				user = scanner.nextInt();
				//		user = scanner.nextInt();

				com = (int) (Math.random()*3)+1;
				String [] rsp = {null ,"가위", "바위", "보"}; // 비워놓으면 null

				System.out.printf("사용자: %d(%s), 컴퓨터: %d(%s) \n", user,rsp[user], com, rsp[com] );
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
				
				System.out.println("계속하시겠습니까?");
				ans = (char)System.in.read();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} while (ans == 'Y' || ans == 'y');


	}

}
