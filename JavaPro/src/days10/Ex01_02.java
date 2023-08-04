package days10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01_02 {
	public static void main(String[] args) {
		
		int n = 125;
		int share, reminder;
		
		String s = "";
		char one;
		char [] ch = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		
		while (n!=0) {
			share = n/16;
			reminder = n%16;
			s= ch[reminder]+ s;
			n = share;
		} //while
		
		System.out.println(s);
	} //main
}
