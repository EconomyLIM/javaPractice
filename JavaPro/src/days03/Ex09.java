package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		// 두문자열 비교
		String name1= "홍길동";
		String name2; 
		
//		int num = 11;
//		int num2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("비교할 이름을 입력 > ");
		name2 = br.readLine();
//		num2 = br.read();
		
		// 디버깅
		System.out.printf("[%s] \n", name2);
		// 두 문자열을 비교할때는 equals 를 사용
		System.out.println(name1.equals(name2));
		// 두 문자열의 대소문자를 비교하지 않고 비교
		System.out.println(name1.equalsIgnoreCase(name2));
	}
}
