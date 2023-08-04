package days05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int c = br.read();
		

		System.out.println(c);

		if (48<=c &&c<= 57 ) {
			System.out.println(" 숫자 입니다.");
		}
		else if (65<= c && c<=90){
			System.out.println(" 알파벳 대문자입니다.");
		}else if (97<= c && c<=122 ) {
			System.out.println(" 알파벳 소문자입니다.");
		}else {
			System.out.println(" 특수문자 입니다.");
		}
		
		five_02(10);

	}
	
	public static void five_02(int sum) {
		int num = 0;
		for(int i = sum ; i >= 1 ; i--) {
			System.out.printf("%d + ",i);
			
			num +=i;
		}
		System.out.printf("\b = %d", sum);
		
	}
}
