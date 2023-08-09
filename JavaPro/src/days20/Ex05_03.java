package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex05_03 {
	public static void main(String[] args) {
		
		//Date -> Calendar로 형변환
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		
	} //main
}
