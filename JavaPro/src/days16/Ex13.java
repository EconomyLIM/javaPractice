package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// 예외처리
		InputStream souce = System.in;
		Scanner scanner = new Scanner(souce);
		int a= 0, b=0;
		double c = 0.00;
		// JVM의 예외처리기에 의해서 InputMismatchException 예외객체 생성-> 개발자 파악 처리

		try {
			System.out.print("두 정수 입력");
			 a = scanner.nextInt();
			 b = scanner.nextInt();
			 
			c = a/b;
			
			System.out.printf("%d / %d = %.2f\n",a, b, c);
			System.out.println("정상종료");
			
			// 다중 catch문~
			// JDK 1.7~ 멀티 catch문
		} catch (InputMismatchException e) {
			System.out.println(">정수만 입력하세요");
			//System.exit(-1); // 프로그램 종료
		} catch (ArithmeticException e) {
			System.out.println("[알림] 0 으로 나눌 수 없다.");
			//System.exit(-1);
		} catch (Exception e) { // 모든 예외의 최상위 예외 -->Exception 
			// Exception e -> 매개변수 다형성 
			e.printStackTrace();
			//System.exit(-1);
		} finally {
			// 예외 발생 유무 상관없이 처리할 구문
			System.exit(-1);
		}
		// catch 예외처리 방법 중 하나
		// catch 문을 쓸때는 부모 예외를 제일 밑에다 쓴다.
		
		
		/*
		 * 1. 프로그램의 오류? -프로그램 오작동 또는 비정상적으로 종료되는 원인
		 * 2. 오류의 발생 시점 
		 * 		1) 컴파일 오류
		 * 		2) RunTime 실행 오류
		 * 				(1) 에러 Error : 메모리 부족, 스택오류, 복구할수 없는 심각한 오류(에러는 Error클래스의 자식 클래스)
		 * 				(2) 예외 Exception : 수습될 수 있는 비교적 덜 심각한 실행 오류
		 * 		3) 논리적 오류 - 가장 오류잡기 어렵다
		 */

	} // main
}
