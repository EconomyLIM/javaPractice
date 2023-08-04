package days10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01_03 {
	public static void main(String[] args) {
		
		int n = 125;
		int share, reminder;
		
		String hex = "0123456789ABCDEF";
		StringBuilder sb = new StringBuilder();
		
		while (n!=0) {
			share = n/16;
			reminder = n%16;
			sb.append( hex.charAt(reminder));
			n = share;
		} //while
		
		System.out.println(sb.reverse());
	} //main
}
