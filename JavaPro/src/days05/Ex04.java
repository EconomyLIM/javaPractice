package days05;

public class Ex04 {

	public static void main(String[] args) {
		//		int sum= 0;
		//		for (int i = 0; i <= 10; i++) {
		//			sum+=i;
		//			System.out.printf(i == 10 ? "%d" : "%d +", i );
		//		} //for
		//		
		//		System.out.printf("= %d", sum);

		//		int sum= 0;
		//		for (int i = 1; i <= 10; i++) {
		//			if (i%2 == 1) {
		//				sum+=i;
		//				System.out.printf(i == 10 ? "%d" : "%d +", i );
		//			}
		//		} //for

		//[3]continue문 설명
		//				int sum= 0;
		//				for (int i = 1; i <= 10; i++) {
		//					if (i%2 == 0) continue;
		//						sum+=i;
		//						System.out.printf(i == 10 ? "%d" : "%d +", i );
		//					
		//				} //for
		//[4]
		int sum= 0;
		for (int i = 1; i <= 10; i+=2) {
			sum+=i;
			System.out.printf(i == 10 ? "%d" : "%d +", i );
		} //for

		//[5] 1~n까지의 합
		//		int n = 5;
		//		int sum= 0;
		//		for (int i = 1; i <= n; i++) {
		//				sum+=i;
		//				System.out.printf(i == n ? "%d" : "%d+", i );
		//		} //for


		System.out.printf(" = %d", sum);
	}

}
