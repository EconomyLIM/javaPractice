package days19;

import java.util.Date;

public class Ex12 {
	public static void main(String[] args) {
		// [달력]
		// 년, 월, 일 무슨요일?
		/*
		
		d.setYear(year-1900);
		d.setMonth(month-1);
		d.setDate(date);
		*/
		Date d = new Date();
		int year= 2010;
		int month = 6;
		int date =1;
		d = new Date(year-1900, month-1, date);
		System.out.println(d.toLocaleString());
		
		System.out.println(d.getDay());
		System.out.println("일월화수목금토일". charAt(d.getDay()));
		
		//2010 5월의 마지막 날짜 ? 28, 29, 30 , 31
//		d.setMonth(month) - 하루
		date = d.getDate() - 1;
		d.setDate(date);
		System.out.println(d.toLocaleString());
		System.out.println(d.getDate());
	}
}
