package days09;

import java.util.Scanner;


public class Ex04 {
	public static void main(String[] args) {
		// 달력 만들기
		// 입력받은 날짜의 1일과 시작하는 요일 알아야 함
		// 그 달의 며칠까지 있는지도 알아야 함
//		
//		int year, month;
//		
//		try(Scanner scanner = new Scanner(System.in)) {
//			System.out.printf(">년도 월 입력");
//			year = scanner.nextInt();
//			month = scanner.nextInt();
//			
//			printCalendar(year,month);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}// catch
//		
		int year = 2023;
		for (int i = 1; i <=12 ; i++) {
			printCalendar(year, i);
		}
	
	} //main

	public static void printCalendar(int year, int month) {
		
		
		// 입력받은 날짜의 1일과 시작하는 요일 알아야 함
		//일요일(0) 월요일(1) ... 토요일(6)
		int dayOfWeek = getDayOfWeek(year,month,1);
		// 그 달의 며칠까지 있는지도 알아야 함
		int lastDay = getLastDay(year,month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n",year, month);
		System.out.println("-".repeat(60));
		String week = "일월화수목금토";
		
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i)); 
		}
		
		System.out.println();//개행
		System.out.println("-".repeat(60));
		//날짜 
		// 1일 날짜 앞의 공백 찍는 for문
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		} //for
		
		// 날짜 찍는 for문
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("\t%d",i); 
			if ((i+dayOfWeek)%7 ==0) {
				System.out.println();
			}//if
		} //for
		
		System.out.println();
		System.out.println("-".repeat(60));
	} // printCalendar
	
	private static int getDayOfWeek(int year, int month, int day) {
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays%7;
		System.out.println("일월화수목금토".charAt(dayOfWeek));
		
		return dayOfWeek;
	} // getDayOfWeek

	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0 ;
//		for (int i = 0; i < year; i++) {
//			totalDays +=  days08.Ex05.isLeapYear(year) ? 366: 355;
//		}
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		for (int i = 1; i < month; i++) {
			totalDays += getLastDay(year, i);
		} //for
		totalDays++;
		return totalDays; 
	} //getTotalDays

	//[1]
//	public static int getLastDay(int year, int month) {
//		//31일				: 1 3 5 7 8 10 12
//		//30일				: 4 6 9 11
//		//28일or 29일  : 2
//		int lastDay = 0;
//		switch (month) {
//		case 2:
//			lastDay = (days08.Ex05.isLeapYear(year))? 29:28; 
//			break;
//		case 4: case 6: case 9: case 11:
//			lastDay = 30;
//			break;
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			lastDay = 31;
//			break;
//		}
//		return lastDay;
//	} // getLastDay

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if (month ==2 && days08.Ex05.isLeapYear(year)) lastDay++; // 윤년체크
		
		return lastDay;
	} // getLastDay
}
