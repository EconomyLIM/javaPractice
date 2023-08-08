package days19;

import java.util.Calendar;
import java.util.Date;

public class Ex11 {
	public static void main(String[] args) {
		// 날짜 시간 클래스 + 형식화 클래스
		// 일정관리 
		
		// jdk1.0 java.util.Date
		// jdk1.1 java.util.Calendar
		// 							ㄴGregorianCalnedar
		// jdk1.8 java.time 패키지 안에 여러 하위패키지와 다양한 클래스 추가 
		
		Date date = new Date();
//		System.out.println(date);

//		System.out.println(date.toGMTString());
		// 년
		System.out.println(date.getYear()+1900);
		// 월
		System.out.println(date.getMonth()+1);
		// 일
		System.out.println(date.getDate());
		// 시간
		System.out.println(date.getHours());
		// 분
		System.out.println(date.getMinutes());
		// 초
		System.out.println(date.getSeconds());
		// 밀리세컨드
		System.out.println(date.getTime()); // 19701.1~0:0:0 ms long
		// 요일
		System.out.println("일월화수목금토일". charAt(date.getDay()));
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.DAY_OF_WEEK);
		// 
	}
}
