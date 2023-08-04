package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_03 {
	// 중첩 try- catch 문

	public static void main(String[] args) {
		InputStream souce = System.in;
		Scanner scanner = new Scanner(souce);
		int a= 0, b=0;
		double c = 0.00;

		try {
			System.out.print("두 정수 입력");
			a = scanner.nextInt();
			b = scanner.nextInt();
			try {
				c = a/b;
				System.out.printf("%d / %d = %.2f\n",a, b, c);
				System.out.println("정상종료");
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("정수만 입력해라");
			}

		} catch (InputMismatchException  e) {
			System.out.println("1:  " + e.toString());
			System.out.println("2:  " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {	} catch (Exception e2) { } // try -catch 문은 어디든지 올 수 있다.
			System.exit(-1);
		}
	} //main
}
