package days05;

public class Ex05 {

	public static void main(String[] args) {

		// exWhile();
		exWhileThree();

		/*
		 * 제어문 -> if, switch, for, break, continue
		 * 조건 반복문 while, do~while
		 */

		/*
		 * 컬렉션 
		 * [열거자] 반복해서 처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
		}
		 */

		/*
		 * [반복자] 반복해서 처리
		while (it.hasNext()) {
			type type = (type) it.next();

		}*/

		/*
		while (condition) { //condition(조건식)이 참일동안 반복해서 { } 실행

		}*/

		//for 과 while 조건반복문의 차이점
		// 반복횟수가 정해져 있으면 for 반복조건이 정해져있으면 while이 편할 수 있음

		//1~10까지 합 (while)
	}

	private static void exWhile() {
		int i = 1, sum = 0;
		while (i <= 10) {
			sum +=i;
			System.out.printf("%d+", i);
			i++;
		} // while
		System.out.printf(" = %d", sum);
	}

	private static void exWhileTwo() {
		int i = 0, sum = 0;

		while (i <= 10) {
			sum +=i;
			System.out.printf("%d+", i);
			i++;
		} // while
		System.out.printf(" = %d", sum);
	}

	private static void exWhileThree() {
		int i = 0, sum = 0;

		while ( ++i <= 10) { // 전위형 후위형 비교
			sum +=i;
			System.out.printf("%d+", i);
		} // while
		System.out.printf(" = %d", sum);
	}
}

