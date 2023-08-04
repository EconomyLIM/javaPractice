package days09;

public class Ex03_03 {
	public static void main(String[] args) {
		/*
		 * 주민등록번호
		 * 4. 주민번호 검증
		 */

		String rrn = "981028-1079317";
		boolean checkSum = checkRRN(rrn);
		if (checkSum) {
			System.out.println("올바른 주민번호");
		}else {
			System.out.println("잘못된 주민번호");
		}
	}

	private static boolean checkRRN(String rrn) {
		int total = 0;
		int ㄱ = rrn.charAt(0) - '0';  // '8' -> 8
		//int ㄴ = Integer.parseInt(rrn.substring(1, 2) );  // "3" -> 3
		int ㄴ = rrn.charAt(1) - '0';  // '8' -> 8 
		int ㄷ = rrn.charAt(2) - '0';  // '0' -> 8
		int ㄹ = rrn.charAt(3) - '0';  // '8' -> 8
		int ㅁ = rrn.charAt(4) - '0';  // '8' -> 8
		int ㅂ = rrn.charAt(5) - '0';  // '8' -> 8
		//                  6             '-'
		int ㅅ = rrn.charAt(7) - '0';  // '8' -> 8
		int ㅇ = rrn.charAt(8) - '0';  // '8' -> 8
		int ㅈ = rrn.charAt(9) - '0';  // '8' -> 8
		int ㅊ = rrn.charAt(10) - '0';  // '8' -> 8
		int ㅋ = rrn.charAt(11) - '0';  // '8' -> 8
		int ㅌ = rrn.charAt(12) - '0';  // '8' -> 8
		total += ㄱ*2 + ㄴ*3 + ㄷ *4 + ㄹ*5 + ㅁ*6 + ㅂ*7 + ㅅ*8 + ㅇ*9 + ㅈ*2 + ㅊ*3+ ㅋ*4+ㅌ*5;
		int check = 11 - total % 11;
		if(check==10) check=0;
		else if( check==11) check=1;

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
	//		System.out.println(sum);
	//		System.out.println(rrnPlace.charAt(12));
	//		if (sum == rrnPlace.charAt(12)-'0') {
	//			return true;
	//		}else {
	//			return false;
	//		}// else
	//	} //checkRRN
}
