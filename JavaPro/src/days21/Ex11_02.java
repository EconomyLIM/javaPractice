package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex11_02 {
	public static void main(String[] args) {
		
//		DateTimeFormatter format
//		DateTimeFormatter parse
		
		
		String source = "2023년 08월 10일 (목) 23:33";
		String pattern = "yyyy년 MM월 dd일 (E) HH:mm";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime ldf = LocalDateTime.parse(source ,dtf);
		System.out.println(ldf);
		/*
		String source = "2023년 08월 10일 (목)";
		String pattern = "yyyy년 MM월 dd일 (E)";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println(d);
		*/ 
		
	}//main
}
