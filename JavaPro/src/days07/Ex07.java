package days07;

import java.util.function.BiConsumer;

public class Ex07 {
	int a = 1;
	public static void main(String[] args) {
		
		// 1. 1/2+2/3+3/4+ ... +8/9+9/10= ???
		double sum = 0;
		for (int i = 1; i <= 9 ; i++) {
			sum += (double)i/(i+1);
			System.out.printf("%d/%d+", i ,i+1);
		}
		System.out.printf("=%f\n", sum);
		
		
	    // 2. 1+2+4+7+11+16+...+191 = ???
		
		
		
	} // main

	private static void one(){
		System.out.println("1번문제");
		double sum = 0.0;
		
		for (int i = 1; i <= 9; i++) {
		System.out.printf("%d / %d +", i, i+1);
		sum += (double)i/(i+1);
		}
		
		System.out.printf("\b = %.2f\n",sum);
		// 실행결과: 1 / 2 +2 / 3 +3 / 4 +4 / 5 +5 / 6 +6 / 7 +7 / 8 +8 / 9 +9 / 10 + = 7.07
	} //one

	private static void two() {
		System.out.println("2번문제");
		int sumTwo = 0;
		for (int i = 1, n = 0,cnt = 1; cnt <= 20; i +=n) {
			sumTwo +=i;
			System.out.printf("%d+",i);
			n++;
			cnt++;
		}
		System.out.printf("\b = %d\n",sumTwo);
		// 실행 결과: 1+2+4+7+11+16+22+29+37+46+56+67+79+92+106+121+137+154+172+191+ = 1350
		
	} //two

}
