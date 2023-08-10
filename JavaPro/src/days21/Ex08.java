package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex08 {
	public static void main(String[] args) {

		// 1.
		Date date = new Date(2023-1900,8,1);
		date.setDate(date.getDate() -1);
		System.out.println(date.getDate());

		//2. 
		Calendar calendar = new GregorianCalendar(2023,8-1,1);
		System.out.println(calendar.getActualMaximum(Calendar.DATE)); 

		//3.
		/*
		String source = "2009-12-30" ;
		LocalDate ld = LocalDate.parse(source);
		System.out.println(ld);
		*/
		/*
		LocalDate ld = LocalDate.now();
		ld = ld.withDayOfMonth(ld.lengthOfMonth());
		
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.lengthOfMonth());
		*/
		LocalDate today = LocalDate.now();
		LocalDate lastday =  today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastday);

	}
}
