package days03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String name = "홍길동";
		
		System.out.printf("%s\n",name);
		System.out.printf("[%s]\n",name);
		System.out.printf("[%10s]\n",name);
		System.out.printf("[%-10s]\n",name);
		
		
		
		int n = 50;
		System.out.printf("%d\n",n); //50
		System.out.printf("%#o\n",n); //062 -->8진수
		System.out.printf("%#x\n",n); //0x32 -->16진수 
		// 0을붙히면 플래그를 붙힐 수 있음
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.2f\n", pi); // 자동 반올림 처리
		System.out.printf("[%10.3f]\n", pi); // 자동 반올림 처리
		
		int no = 1;
		System.out.printf("%d\n", no);
		System.out.printf("%4d\n", no);
		System.out.printf("%04d\n", no);
		
		
		// java.util.MissingFormatArgumentException: Format specifier '%c'
		System.out.printf("%1$d(%1$c)\n", 65);
	}

}
