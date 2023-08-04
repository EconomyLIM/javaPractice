package days05;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		// 기존 3번
//		ssumThree();
		//4번 문제 -> 두정수 사이의 홀수의 합을 출력
		ssumFour();
	}
	private static void ssumThree() {
		//Math클래스 - 수학 관련된 메서드
		//Math.min()
		//Math.max()
		int sum = 0;
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int min = Math.min(n, m);
			int max = Math.max(n, m);

			for (int i = min; i <= max; i++) {
				sum +=i;
				System.out.printf(i == m ? "%d" : "%d+" ,i);
			} //for
			System.out.printf(" = %d", sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ssumFour() {
		int sum = 0;
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			
			if (min%2 == 0 ) min++;
			
			for (int i = min; i <= max; i+=2 ) {
				sum+= i;
				
				System.out.printf(i == max ? "%d" : "%d+" ,i);
			} //for
			System.out.printf(" = %d", sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
