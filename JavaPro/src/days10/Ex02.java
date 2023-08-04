package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex02 {
	public static void main(String[] args) {
		
		getTotalDays(2023,7,1);
		// 함수 프로토타입 = 함수원형 
	} // main
	private static int getDayOfWeek(int year, int month, int day) {
		// 날짜 시간 기능(,일,함수, 메서드)구현된 클래스
		//java.util.Date, Calendar
		// jdk LocalDate, lOcalTime, LocalDateTime
		LocalDate d = LocalDate.of(year, month, day);
		DayOfWeek w =  d.getDayOfWeek();
		 // 1:월요일 2:화요일 ...7:일요일
		return w.getValue()%7;
	}
	
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1, 1, 1);
		LocalDate endDate = LocalDate.of(year, month, day);
		
		int totalDays =  (int) startDate.until(endDate, ChronoUnit.DAYS) + 1;
		startDate.until(endDate, ChronoUnit.MONTHS); //개월 수
		startDate.until(endDate, ChronoUnit.YEARS); //개월 수
		
		return totalDays;
	}
	
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month, 1);
		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth());
		return lastDate.getDayOfMonth();
	}
}
