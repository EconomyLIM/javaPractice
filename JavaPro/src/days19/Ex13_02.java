package days19;

import java.util.Date;

public class Ex13_02 {
	

	public static void main(String[] args) {
		// 달력 그리기 Date사용
		int year = 2023;
		int month = 8;
		int dayOfWeek = getDayOfWeek(year, month, 1); //요일 반환
		int lastDay = getLastDay(year,month);

		Date today = new Date(System.currentTimeMillis());
	    Date temp = new Date(today.getYear(), today.getMonth(), today.getDate());
	    
		Date d = new Date(year-1900, month-1, 1); // 2023.08.01
		int date = d.getDate() - dayOfWeek;
		d.setDate(date);
		System.out.println(d.toString());
		System.out.println(temp.toLocaleString());
		System.out.println(today.toLocaleString());
		System.out.println(today.toString().substring(0, 11).equals(temp.toString().substring(0,11)));
		


		for (int i = 1; i <= 42; i++) {
			int m = d.getMonth() +1;
			 int date2 = d.getDate();
			 System.out.printf(m != month ? "(%d)\t" : (d.compareTo(temp) == 0 ? "[%d]\t" : "%d\t"), d.getDate());
			 
			// d.after
			// d.before
			// d.equals
			// d.compareTo

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

class Eqauls{

}
