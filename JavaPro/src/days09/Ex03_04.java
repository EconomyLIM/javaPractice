package days09;

public class Ex03_04 {
	public static void main(String[] args) {
		/*
		 * 주민등록번호
		 * 4. 주민번호 검증
		 */

		String rrn = "981028-1111111";
		boolean checkSum = checkRRN(rrn);
		if (checkSum) {
			System.out.println("올바른 주민번호");
		}else {
			System.out.println("잘못된 주민번호");
		}
	}

	private static boolean checkRRN(String rrn) {
		int total = 0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <= 12; i++) {
			total += (rrn.charAt(i)-'0')*m[i];
		}
		int check = (11 - total % 11)% 10;
//		check %= 10;
		int ㅍ = rrn.charAt(13) - '0';

		return ㅍ == check;

	} // checkRRN

	//	private static boolean checkRRN(String rrn) {
	//		String rrnPlace = rrn.replace("-", "");
	//		System.out.println(rrnPlace);
	//		
	//		char[] chk = rrnPlace.toCharArray();
	//		int result = 0, resultTwo = 0;
	//		int sum = 0;
	//		
	//		for (int i = 0; i <= 7; i++) {
	//			result += (chk[i]-'0')*(i+2);
	//		} // for I
	//		for (int j = 8; j <= 11; j++) {
	//			resultTwo += (chk[j]-'0')*(j-6);
	//		}// for J
	//		sum = 11-((result + resultTwo)%11);
	//	
	//		if (sum == rrnPlace.charAt(12)-'0') {
	//			return true;
	//		}else {
	//			return false;
	//		}// else
	//	} //checkRRN
}
