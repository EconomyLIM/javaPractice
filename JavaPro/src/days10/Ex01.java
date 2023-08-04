package days10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		String s = "";
		char one;
		int n = 125;
		int share, reminder;
		char [] ch = {'a', 'b', 'c', 'd', 'e', 'f' };
		while (n!=0) {
			share = n/16;
			reminder = n%16;
//			if(reminder >=10) System.out.println(ch[reminder-10]);
			if(reminder >= 10)one = ch[reminder-10];
			else one= (char) ((char)reminder+'0');
			s= one +s;
			
			n = share;
		} //while
		
		System.out.println(s);
	} //main
}
