package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args){
		//DateTimeFormatter 형식화 클래스
		// java.time 패키지 핵심 클래스
		// 문자열 > 파싱 ? 핵심클래스
		// 		  < 포맷  <
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String pattern = "yyyy/MM/dd E요일 hh:mm:ss. SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		String output =  dtf.format(ldt);
		System.out.println(output);
		
    }
}
