package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {
	public static void main(String[] args) {
		//날짜 + 시간
		
		/*
		LocalDateTime ldt = LocalDateTime.now();
		ldt= ldt.truncatedTo(ChronoUnit.DAYS); // truncated->절삭(내림) -> 시간밑으로 절삭해버림
		System.out.println(ldt);
		*/
		/*
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		LocalDateTime ldt2 = ld.atTime(lt);
		LocalDateTime ldt3 = lt.atDate(ld);
		*/
		
		//LocalDateTime -> LocalDate 변환
		//LocalDateTime -> LocalTime 변환
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt.toLocalDate();
		ldt.toLocalTime();
		
	}
}
