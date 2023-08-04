package days06;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 'A', cnt = 1, line = 1; i <= 'z'; i++) {
			Scanner sc = new Scanner(System.in);
			if(i > 'Z' && i < 'a') continue;

			if (cnt % 10 == 1) {
				System.out.printf("%d : ", line++);
//				if(cnt %2 == 0 ) {
//					System.out.printf("계속 하려면 아무키나 누르세요");
//					sc.nextLine();
//				}
			} // if 라인 넘버 찍기
			System.out.printf("%1$c(%1$03d)", i);

			if (cnt++ %10 ==0) {
				System.out.println();
			} //if 10개씩 출력

			if(i == 'Z') {
				System.out.println();
				cnt = 1;
			} //if 소문자 개행후 10개씩 출력
		}//for
		
	} //main
}
