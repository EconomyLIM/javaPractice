package days08;

public class Ex03 {
	int a = 1;
	public static void main(String[] args) {
		int firstTerm = 1; // 첫번째 항
		int secondTerm = 1; // 두번째 항
		int nextTerm = 1; // 
		int sum = firstTerm + secondTerm;

		System.out.printf("%d+%d+",firstTerm, secondTerm);

		for (int i = 1; i <= 8; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.printf("%d+",nextTerm);
			sum +=nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.printf("=%d",sum);
		// f s
		//   f s
		//     f s
		//[A]
		//		while (true) {
		//			nextTerm = firstTerm + secondTerm;
		//			if (nextTerm> 100) {
		//				break;
		//			} //if
		//			System.out.printf("%d+",nextTerm);
		//			sum +=nextTerm;
		//			firstTerm = secondTerm;
		//			secondTerm = nextTerm;
		//		}

		//[B]
		//		while ((nextTerm = firstTerm + secondTerm) <= 100) {
		//			
		//			System.out.printf("%d+",nextTerm);
		//			sum +=nextTerm;
		//			firstTerm = secondTerm;
		//			secondTerm = nextTerm;
		//		}
	}

}
