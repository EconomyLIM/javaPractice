package days20;

import java.time.LocalDate;

public class Ex13 {
	public static void main(String[] args) {
		//날짜 객체도 불변 객체
		
		LocalDate d =  LocalDate.now();
		System.out.println(d);
		d = d.withYear(2020);
		System.out.println(d);
		d = d.plusYears(1);
		System.out.println(d);
		d = d.minusMonths(3);
		System.out.println(d);
		d =d.withDayOfMonth(22);
		System.out.println(d);
				
	} //main
}
