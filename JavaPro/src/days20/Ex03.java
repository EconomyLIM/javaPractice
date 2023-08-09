package days20;

import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		Date sday = new Date(2023-1900,7-1,13, 9, 0, 0);
		String [] sunit = { "초", "분", "시간", "일"};
		int [] unit = {1000,60,60,24};
		long cnt = 0;
		Date today = new Date();
		System.out.println(sday.getTime());
		System.out.println(today.getTime());
		
		dispDiffDays(today,sday);
//		long diff = today.getTime() -sday.getTime();
//		for (int i = 0; i < unit.length; i++) {
//			cnt = diff / unit[i];  
//			System.out.printf("%s : %d%s\n" ,sunit[i], cnt,sunit[i]);
//			diff = diff/unit[i];
//		} //for
	} //main

	private static void dispDiffDays(Date sday, Date eday) {
		long diff = sday.getTime() - eday.getTime();
		long mok = diff/(1000*60*60*24);
		System.out.printf("%dd-",mok);
		diff %= (1000*60*60*24);
		
		mok = diff/(1000*60*60);
		System.out.printf("%dh-",mok);
		diff %= (1000*60*60);
		
		mok = diff/(1000*60);
		System.out.printf("%dm-",mok);
		diff %= (1000*60);
		
		mok = diff/(1000);
		System.out.printf("%ds-\n",mok);
		diff %= (1000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dispDiffDays(sday, new Date());
	}
	
}
