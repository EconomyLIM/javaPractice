package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11_02 {
	public static void main(String[] args) {
		//jj,tt 핵심클래스
		/*'
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		//2023-08-09T15:49:58.242858700
		*/
		
		LocalDate id = LocalDate.of(2015, 11, 23);
		System.out.println(id);
		
		LocalTime lt = LocalTime.of(3,20,11);
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.of(id, lt);
		System.out.println(ldt.toString());
	}
}
