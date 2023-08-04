package days08;

public class Ex07 {
	public static void main(String[] args) {
		// 재귀함수
		// 1)1~n 합 재귀함수
		// 2) 팩토리얼(factorial) = 계승
		// 정의 -> 1에서 양의 정수의 곱
		// n! = n*(n-1)*(n-2)*...*1
		// 0! = 1
		
		// 일반함수
		int result = recursiveFactorial(5);
		System.out.println(result);
		// 재귀함수
		
	} //main

	private static int recursiveFactorial(int n) {
		//재귀
		if (n>1) {
			return n*recursiveFactorial(n-1);
		}else if (n ==0 || n==1) {
			return 1;
		}else return -1;
	} // recursiveFactorial

	private static int factorial(int n) {
		int result = 1;
		for (int i = n; i >=1; i--) {
			result = result * i;
		}
		return result;
	} // factorial
}
