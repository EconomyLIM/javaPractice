package days21;

import java.util.Date;

public class Ex02 {
	//복습문제-> 5번
	public static void main(String[] args) {
		Date sday = new Date(2023-1900,7-1,13);
		sday.setDate(sday.getDate()+100);
		System.out.println(sday.toLocaleString());
	}
}
