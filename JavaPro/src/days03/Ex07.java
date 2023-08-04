package days03;

public class Ex07 {

	public static void main(String[] args) {
		char lowerCase, upperCase;
		
		lowerCase = 'x';
		//upperCase 변수에는 lowerCase의 대문자를 저장해서 출력
		//대문자 소문자 차 = 32
		// 소문자 -32 = 대문자
		// 대문자 -> 소문자, 소문자 ->대문자 
		upperCase = (char) (lowerCase - 32);
		System.out.printf("%c \n", upperCase);
		
		upperCase = 'A';
		lowerCase = (char) (upperCase + 32);
		System.out.printf("%c \n", lowerCase);
		
		System.out.println('4' - '2'); //2
	}

}
