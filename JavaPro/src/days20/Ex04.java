package days20;

import java.time.chrono.ThaiBuddhistDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04 {
	public static void main(String[] args) {
		//jdk 1.1 Calendar == 추상클래스 - 날짜, 시간
		// Calendar c = new Calendar(); XXXX
//		Calendar c = new GregorianCalendar(); //표준 달력
//		BuddhistCalendar 태국
		
		Calendar c = Calendar.getInstance(); //내부적으로 그래골리언칼랜더 객체를 돌려준다.
//		c.add(int field 변경 시킬 값, (-)value);
		// c.clear(시간, 분, 초) = d2.setHours;
		// 년
		
		System.out.println(c.get(1)); 
		System.out.println(c.get(Calendar.YEAR)); 
		// 월
		System.out.println(c.get(Calendar.MONTH)+1);
		// 일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		// 시
		System.out.println(c.get(Calendar.HOUR)); //12시 기준
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24시 기준
		// 분
		System.out.println(c.get(Calendar.MINUTE));
		// 초
		System.out.println(c.get(Calendar.SECOND));
		// 밀리 세컨드
		System.out.println(c.get(Calendar.MILLISECOND));
		// 요일
		/* Date 0(일) 1(월) ...
		 * Caledar 1(일) 2(월)
		 * 
		 */
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);
		System.out.println("일월화수목금토일".charAt(c.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//해당월의 몇번째 주
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		// 해당연도의 몇번째 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	
		
		
	} // main
}
