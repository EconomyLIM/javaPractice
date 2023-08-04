package days03;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.util.IllegalFormatConversionException: d != java.lang.String
		System.out.printf("%s\n", "홍길동");
		
		 Calendar c = Calendar.getInstance();
		 System.out.printf("%1$tm %1$te, %1$tY\n", c);
		 
		 System.out.printf("%(d\n",-123);
		 System.out.printf("%,d\n",123123123);
		 
		 // %[argument_index$][flags][width]conversion -> print문의 기본형식
		 // %											  d 
		

	}

}
