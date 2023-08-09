package days20;

import java.util.Date;

public class Ex02_02 {
	public static void main(String[] args) {
		Date d = new Date(2023-1900,8-1,9);
		Date today = new Date();
		int index = d.toLocaleString().lastIndexOf(".");
		System.out.println(index);
		String s1 =  d.toLocaleString().substring(0, index);
		String s2 =  today.toLocaleString().substring(0, index);
		
		System.out.println(s1.equals(s2));
	}
}
