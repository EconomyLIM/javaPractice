package days07;

import java.util.function.BiConsumer;

public class Ex06_02 {
	int a = 1;
	public static void main(String[] args) {
		//시험 (1~n합 구하는 재귀 함수)
		int n = 10;
		int result = recursiveSum(n);
		System.out.printf("1~%d의 합 : %d\n",n,result);
	} // main

	private static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result+=i;
		}
		return result;
	}
	//재귀함수는 안쓰는게 좋다
	//하지만 성능은 떨어져도 재귀함수를 쓸데가 있다
	private static int recursiveSum(int n) {
		if (n==1) {return n;}
		else return n+ recursiveSum(n);
	}
}
