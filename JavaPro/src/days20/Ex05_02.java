package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_02 {
	public static void main(String[] args) {
		// 날짜 시간 정보를 사용자가 원하는 형식으로 출력하는 방법\
		
//		SimpleDateFormat 형식화 클래스 
		String pattern = "yyyy. MM. dd. a HH:mm:ss";
		SimpleDateFormat sdf =new SimpleDateFormat(pattern);
		
		/* Date 클래스
		Date today = new Date();
		String str_Today =  sdf.format(today);
		System.out.println(str_Today);
		*/
		
		// Calendar 객체
		Calendar c = Calendar.getInstance();
		// Calendar 데이트 타입을 Date로 형 변화를 해야 SimpleDateFormat를 쓸 수 있다.
		//[1]Date today = new Date(c.getTimeInMillis());
		Date today = c.getTime();
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
	} //main
}
