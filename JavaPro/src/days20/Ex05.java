package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex05 {
	public static void main(String[] args) {

		//		System.out.println(calendar.toString());
		// "2015. 5 .1 오전 9:11:12"로 출력하고싶다
		Calendar calendar = Calendar.getInstance();
		String pattern = "yyyy. MM. dd. a HH:mm:ss";
		System.out.println(getPatternDate(calendar, pattern));
//		[1]
//		//Date X
//		//  Calendar
//		// 1) 2015 5월 1일 무슨요일인지 알고싶다.
//		// 2) 2015 5월 몇일까지?
//
//		//		calendar.set(Calendar.YEAR, 2015);
//		//		calendar.set(Calendar.MONTH, 5-1);
//		//		calendar.set(Calendar.DATE, 1);
//
//		calendar.set(2015, 5-1, 1);
//
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		//[2]
		
		Calendar c = new GregorianCalendar(2015,5-1,1);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getActualMaximum(Calendar.DATE)); // 그 달의 가장 큰 날짜

	} //main
	/*
	public static String getPatternDate(Calendar c, String pattern) {

		SimpleDateFormat sdf =new SimpleDateFormat(pattern);
		Date d= c.getTime();
		return sdf.format(d);
	}
	 */
	public static String getPatternDate(Object obj, String pattern) {
		SimpleDateFormat sdf =new SimpleDateFormat(pattern);

		if (obj instanceof Date) {
			Date d = (Date)obj;
			return sdf.format(d);
		} else if (obj instanceof Calendar){
			Calendar c = (Calendar)obj;
			Date d= c.getTime();
			return sdf.format(d);
		}else {
			return null;
		} //else

	} //getPatternDate
}


