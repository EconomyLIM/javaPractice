package days05;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		//[1]1~10합  
		//ssum();
		//[2]두 정수 n,m 을 입력받아서 두 정수사이의 합
//		ssumTwo();
		//[3]
		ssumThree();
	}

	private static void ssum() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum+=i;
		} //for
		System.out.printf(" = %d", sum);
	} // ssum

	private static void ssumTwo() {
		int sum = 0;
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int min = n>m ? m:n;
			int max = n>m ? n:m;
			
			for (int i = min; i <= max; i++) {
				sum +=i;
				System.out.printf(i == m ? "%d" : "%d+" ,i);
			} //for
			System.out.printf(" = %d", sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // ssumTwo
	
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
	
}
