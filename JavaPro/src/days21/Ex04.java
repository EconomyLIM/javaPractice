package days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws ParseException {
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		int no; 
		String name;
		String addr; 
		int i=0;
		
		String pattern = "번호:{0},이름:{1},주소:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		
		
		// java.lang.ClassCastException:
		// ClassCastException 클래스 형변환 x
		//
		/*
		Object[] objs = mf.parse(source);
		no = Integer.parseInt(objs[0].toString());
		System.out.println(no);
		*/
		
		try {
			Object[] objs = mf.parse(source);
			Integer [] m = new Integer[objs.length];
			String[] s = new String[objs.length] ;
			if (objs instanceof String[]) {
				s[i] = (String)objs[i];
				i++;
			}
			else if (objs instanceof Integer[]) {	
				s[i] = objs[i].toString();
				i++;
			}
			System.out.println(Arrays.toString(objs));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
