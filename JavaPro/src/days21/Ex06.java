package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex06 {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		lt.get(ChronoField.MILLI_OF_SECOND); // int 형
		//lt.getLong(null); // long 형
		
		// 30분 후 
		lt = lt.plusMinutes(30);
		System.out.println(lt);
		
		//1시간 30분
		//lt = lt.plusMinutes(90);
		lt = lt.plusHours(1);
		lt = lt.plusMinutes(30);
	}

}
