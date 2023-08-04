package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class Ex03_02 {
	public static void main(String[] args) {
		/*
		 * 주민등록번호
		 * 1. 생년원일, 나이,  성별, 내국인 외국인, 검증번호
		 *  
		 */
		// 주민등록번호 -> 나이
		// 세는나이 countingAge
		//만나이 americanAge
		String rrn = "990123-1700001";
		int age=  0;
		age = getCountingAge(rrn);
		System.out.println("세는나이: " +age);
		age = getAmericanAge(rrn);
		System.out.println("만나이: " + age);
		
		//Ex)2019:12:31 2020:1.1 2020:12:31 2021:1.1
		// 세는나이 : 1살			2살				2살			3살
		// 만 나이 : 0살			0살				1살			1살
		
	}//main
	
	private static int getAmericanAge(String rrn) {
		// 생일이 오늘날짜 지남 여부 체크
		// 생일이 지나지 않았다면 -1
		// 만나이 = 올해년도 - 생일년도 -1(O,X)
		// 생일이 지났는지 안지났는지 체크
		// 생일 1.23
		// 오늘 7.25
		
		int birthMMdd =Integer.parseInt(getBirth(rrn).substring(4).replace(".", "")); 
		//[1]Calendar
//		Calendar c = Calendar.getInstance();
//		int thisMonth = c.get(Calendar.MONTH); //7
//		int thisDay = c.get(Calendar.DATE); //25
//		int thisMMdd = thisMonth*100 + thisDay;
		
		//[2]
//		Date d = new Date();
//		int thisMonth = d.getMonth()+1;
//		int thisDay = d.getDate();
//		int thisMMdd = thisMonth*100 + thisDay;
		
		//[3]
		Date d = new Date();
		String pattern = "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		int thisMMdd = Integer.parseInt(sdf.format(d));
		
		boolean flag = thisMMdd - birthMMdd >= 0; //true면 생일지남
		
		int americanAge = getCountingAge(rrn)-1 +(flag? 0 : -1);
		return americanAge;
	} // getAmericanAge

	private static int getCountingAge(String rrn) {
		// 올해 연도
//		Calendar calendar = Calendar.getInstance();
//		int thisYear = calendar.get(Calendar.YEAR);
		Date d = new Date();
		int thisYear = d.getYear() + 1900;
		// 생일 연도
		int birthYear = Integer.parseInt(getBirth(rrn).substring(0,4));
		// 올해연도 - 생일연도 + 1
		
		int countingAge = thisYear - birthYear+ 1;
		return countingAge;
	} // getCountingAge

	public static int getGender(String rrn) {
//		return Integer.parseInt(rrn.substring(7,8));
		return rrn.charAt(7)-'0';
	}
	
	private static String getBirth(String rrn) {
		int year =Integer.parseInt(rrn.substring(0,2)); 
		int month=Integer.parseInt(rrn.substring(2,4)); 
		int day =Integer.parseInt(rrn.substring(4,6)); 
		int ㅅ = getGender(rrn);
		
		int centry = 1800;
		switch (ㅅ) {
		case 1: case 2: case 5: case 6:
			centry = 1900;
			break;
		case 3: case 4: case 7: case 8:
			centry = 2000;
			break;
		case 9: case 0:
			centry = 1800;
			break;
		} //switch
		year = centry + year;
		String birthday = String.format("%d.%d.%d", year, month, day);
		return birthday;
	} //getBirth
}
