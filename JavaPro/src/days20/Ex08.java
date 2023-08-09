package days20;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex08 {
	public static void main(String[] args) throws ParseException {
		//형식화 클래스
		// DecimalFormat
		// format() 숫자-> 원하는 형식의 문자열
		// parse() 문자열 -> 숫자

		// SimpleDateFormat
		// format() 날짜 -> 원하는 형식의 문자열
		// parse() 문자열 -> 숫자

		// [문제] 2023 8 9 일 "수요일" --> 날짜로 변환시키는 코딩
		String strDate = "2023년 8월 9일 \"수요일\" ";
		
		//요일 나타내는 패턴 기호-> E
		String pattern = "yy년 MM월 d일 \"E\" ";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(strDate);
		System.out.println(d.toLocaleString());
		// Date -> Calendar 형변환
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		
		System.out.println(Ex05.getPatternDate(calendar, pattern));
		
	} //main
}
