package days02;

public class Ex12 {

	public static void main(String[] args) {
//진법 변환
		byte b= 10; // [00001010]
		int i = 10 ;  // [00000000 00000000 00000000 00001010]
		
		char c = 'A'; // 2진수 (0,1) > ASCII 코드 7비트(128문자)
		//자바 유니코드 2바이트 [00000000][00000000] 
		//확장 ASCII (8비트 256문자)
		//인코딩 -> 'A' => 65변환
		//디코딩 -> 65 => 'A' 변환
		char d = '\u0061';
		System.out.printf("d:%c\n", d); // 'a' = 97, 'A' = 65
		// 대문자 - 소문자 = 65 -97 = -32
		
	}

}
