package util;

import java.util.Scanner;


public class prac {
	public static void main(String[] args) {

		int year= 2023;
		for (int i = 1; i <= 12; i++) {
			printCalendar(year,i);
		} //for
	} //main

	private static void printCalendar(int year, int month) {
		 int dayOfweek = getDayOfWeek(year, month, 1);
		 int lastDay = getLastDay(year,month);
		 
		 System.out.printf("\t\t\t[%d년 %d월]\n",year, month);
		 System.out.println("-".repeat(60));
		 String week = "일월화수목금토";
		 
		 for (int i = 0; i < week.length(); i++) {
			 System.out.printf("\t%c", week.charAt(i));
		} //for
		 System.out.println();
		 System.out.println("-".repeat(60));
		 
		 for (int i = 0; i < dayOfweek; i++) { // 시작일 전 공백찌는 for문
			 System.out.printf("\t");
		} //for
		 for (int i = 1; i <= lastDay; i++) { // 날짜 찍는 for문
			 System.out.printf("\t%d",i);
			 if ((i+dayOfweek )%7 ==0) {
				System.out.println();
			} //if
		} //for
		 
		 System.out.println();
		 System.out.println("-".repeat(60));
	} // printCalendar

	private static int getDayOfWeek(int year, int month, int day) {
		int totalDays = getTotalDays(year, month, day);
		int dayOfweek = totalDays%7;

		return dayOfweek;
	} // getDayOfWeek
	
	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0;
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100+ (year-1)/400;
		
		for (int i = 1; i < month; i++) {
			totalDays+=getLastDay(year, i);
		} //for
		totalDays++;
		return totalDays;
	} // getTotalDays

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if (month == 2 && days08.Ex05.isLeapYear(year)) {
			lastDay++;
		}
		return lastDay;
	} // getLastDay
}
