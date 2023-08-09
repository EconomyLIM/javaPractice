package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06 {
	public static void main(String[] args) {
		
		//add() set() roll() 차이점
		
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);
		//c.add(Calendar.DATE, 1);
		
		System.out.println(Ex05.getPatternDate(c, "yyyy-MM-dd")); 
	} //main
}
