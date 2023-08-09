package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06_02 {
	public static void main(String[] args) {
		// 낼 시험 = Calendar로 날짜 갖고와서 add로 하기
		// Calendar 객체의 요일, 마지막날짜, add
		
		// add() set() roll() 차이점
		
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		// 이 날짜객체에 하루전

//		c.set(Calendar.DATE, 0); // -1: 2023-07-30 / 0: 2023-07-31 / 
		// set 함수는 날짜를 더하고빼는것보단 원하는 날짜로 세팅하는게 더 맞다.
		
		// c.set(Calendar.DATE, 10);
		// c.set(Calendar.DATE, 32);
		
		// c.add(Calendar.DATE, -1); // 2023-07-31
		
		// c.roll(Calendar.DATE, 1); //2023-08-02
		// c.roll(Calendar.DATE, -1); //2023-08-01
		
		System.out.println(Ex05.getPatternDate(c, "yyyy-MM-dd")); 
	} //main
}
