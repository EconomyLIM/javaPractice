package days06;

public class Ex06_03 {
	public static void main(String[] args) {
//		One();
//		tWo();
		three();
	}

	private static void One() {
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				//(1,2)	
				System.out.printf("%dX%d=%02d |", j, i, i*j);
			
			}//forJ
			System.out.println();

		} //forI
	
	} //one
	private static void tWo() {
		
		for (int k = 1; k <= 2; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 4*k-2; j <= 4*k+1; j++) {
					//(1,2)	
					System.out.printf("%dX%d=%02d |", j, i, i*j);
				}//for J
				System.out.println();
			} //for I
			System.out.println();
		} //for K:
	} // tWo
	
	private static void three() {
		
		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 3*k-1; j <= 3*k+1 && j != 10; j++) {
					//(1,2)	
//					if(j>9) continue;
					System.out.printf("%dX%d=%02d |", j, i, i*j);
					
				}//for J
				System.out.println();
			} //for I
			System.out.println();
		} //for K
		
	}
}
