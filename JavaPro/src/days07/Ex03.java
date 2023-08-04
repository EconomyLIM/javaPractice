package days07;

import java.util.Scanner;

public class Ex03 {
	int a = 1;

	public static void main(String[] args) {

		int com, user, cnt =1;
		int errcnt = 1;
		
		char con = 'y';
		String inputdata = null;
		String regex = "[1-3]";

		 try(Scanner scanner = new Scanner(System.in)) {

			do {
				
				do {
					// 첫번째 선택 + 그외 그분
					
					System.out.printf("%d> user 가위(1), 바위(2), 보(3) 선택?",cnt);
					inputdata = scanner.next();
					
					if(!(inputdata.matches(regex))) {
						System.out.printf("잘못입력 다시입력해주세요(1~3) 틀린횟수: %d \n", errcnt);
						errcnt++;
						if(errcnt == 5) {
							System.out.println("5번 잘못입력해서 종료합니다.");
							break;
						}
					}
					
				} while (!(inputdata.matches(regex)));
				
				user = Integer.parseInt(inputdata);
				
				com = (int) (Math.random()*3)+1;
				String [] rsp = {null ,"가위", "바위", "보"}; // 비워놓으면 null

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
				
				System.out.printf("사용자: %d(%s), 컴퓨터: %d(%s) \n", user,rsp[user], com, rsp[com] );
				System.out.printf("계속하시겠습니까?");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
				
				cnt++;
				
			} while (Character.toUpperCase(con) == 'Y');
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}

}
