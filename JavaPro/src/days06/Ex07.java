package days06;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [이름 붙은 반복문]
		 */
		// continue, break 이름; 붙일 수 있다.
		out : for (int i = 2; i < 9; i++) {
			in : for (int j = 1; j < 9; j++) {
				System.out.printf("%dX%d=%02d    ", i, j, i*j);
				if (j==5) {
					break out;
				}// if
			} // for J
			System.out.println();
		} // for I

	}// main
}
