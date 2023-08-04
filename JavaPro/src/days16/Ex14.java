package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	// 다중 catch문~
	// JDK 1.7~ 멀티 catch문
	public static void main(String[] args) {
		InputStream souce = System.in;
		Scanner scanner = new Scanner(souce);
		int a= 0, b=0;
		double c = 0.00;

		try {
			System.out.print("두 정수 입력");
			 a = scanner.nextInt();
			 b = scanner.nextInt();
			 
			c = a/b;
			
			System.out.printf("%d / %d = %.2f\n",a, b, c);
			System.out.println("정상종료");
			
	
		} catch (InputMismatchException | ArithmeticException  e) {
			System.out.println("1:  " + e.toString());
			System.out.println("2:  " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(-1);
		}
	} //main
}
