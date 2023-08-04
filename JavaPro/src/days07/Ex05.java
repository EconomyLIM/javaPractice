package days07;

import java.util.Iterator;

public class Ex05 {
	int a = 1;
	public static void main(String[] args) {
		//[정규표현식]
		// 1. 주민등록번호 000000-0000000
		
//		String regex = "[0-9]{6}-\\d{7}";
//		// 정규표현식 숫자-> [0-9] \d
//		// 정규표현식 반복횟수 -> ?(0,1) // +(1,여러)
//		// 정규표현식 반복횟수 -> {n} {n,m} {n,}
//		
//		String rrn  = "123456-1234567";
//		if (rrn.matches(regex)) {
//			System.out.println("올바른 주민등록 번호 형식");
//		} else {
//			System.out.println("올바른 주민등록 번호 형식");
//		}
//		
		Two();
	} // main
	
	private static void Two() {
		//우편번호
		
		String [] zipCode = {"123-456", "12345", "123456", "123-a56", "123-4567" };
		String regex = "\\d{3}-\\d{3}|\\d{5}";
		boolean flag = false;
		
		for (int i = 0; i < zipCode.length; i++) {
			flag = zipCode[i].matches(regex);
			System.out.printf("%s - %s 우편번호\n"
					,zipCode[i], flag ? "올바른" : "잘못된");
		}
	}
}
