package days21;

import java.time.LocalDate;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 날짜와 시간 비교 :isAfter(), isBefore(). isEqual
		 * 오늘이 생일이니??
		 */
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 8, 10);
		
		birth = birth.withYear(today.getYear());
		System.out.println(birth);
		System.out.println(today.isBefore(birth)); //생일이 지나지 않은것
 		System.out.println(today.isEqual(birth)); // 생일
		System.out.println(today.isAfter(birth)); ////생일이 지남
		
		System.out.println((today.compareTo(birth) ==0 ? "같다 " : "틀리다"));
	}
}
