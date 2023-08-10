package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {
	public static void main(String[] args) {
		
		// 날짜와 날짜 사이의 간격(차) Period
		// 시간과 시간 사이의 간격(차) Duration
		
		/*
		 * - between(), until()
		 * static			nonstatic
		 * 
		 *  - of(), with() 변경
		 *  - plus(), minus() 등등메서드
		 *  
		 */
		
		//개강일
		LocalDate start = LocalDate.of(2023, 7, 13);
		// 오늘날짜
		LocalDate today = LocalDate.now();
//		today = today.plusDays(1);
		// 날짜 간격 차
		
		Period p = Period.between(start, today);// 오늘까지 포함할려면 +1
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		// 시간차 Duration
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime nt = LocalTime.now();
		Duration d = Duration.between(st, nt);
		long ss = d.getSeconds();
		System.out.println(ss/(60*60));
		System.out.println(ss%(60*60));
		
//		long b =  d.get(ChronoUnit.HOURS);
//		System.out.println(b); //java.time.temporal.UnsupportedTemporalTypeException: 

		
		
		
	} //main
}
