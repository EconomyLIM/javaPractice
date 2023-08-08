package days19;

import java.util.Date;

public class Ex13 {
	public static void main(String[] args) {
		// 달력 그리기 Date사용
		int year = 2023;
		int month = 8;
		int dayOfWeek = getDayOfWeek(year, month, 1); //요일 반환
		int lastDay = getLastDay(year,month);
		
		Date today = new Date();
//		today = new Date(today.getYear(), today.getMonth()+1, today.getDate());
		int t_year = today.getYear()+ 1900;
		int t_month = today.getMonth() +1;
		int t_date = today.getDate();
		System.out.println(today.toString());
		
		Date d = new Date(year-1900, month-1, 1); // 2023.08.01
		int date = d.getDate() - dayOfWeek;
		d.setDate(date);
		
		int y = d.getYear() + 1900;
		int m = d.getMonth() +1;
		int dd = d.getDate();
		
		for (int i = 1; i <= 42; i++) {
			
			if( t_year == y && t_month == m && t_date == dd) {
				 System.out.printf("[%d]\t", d.getDate() );
			}else {
				 System.out.printf(m == month?"%d\t":"(%d)\t", d.getDate() );
			}

			if(i%7==0)System.out.println();
			date = d.getDate()+1;
			d.setDate(date);
		} //for
	} // main

	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int date = d.getDate() - 1;
		d.setDate(date);
		return d.getDate();
	} //getLastDay

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay();
	} //getDayOfWeek
}
