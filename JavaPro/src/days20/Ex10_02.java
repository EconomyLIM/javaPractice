package days20;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex10_02 {
	public static void main(String[] args) throws ParseException {

		String source = "이름:이준희, 나이: 20, 성별: true";
		String pattern = "이름:{0}, 나이: {1}, 성별: {2}";
		MessageFormat mf = new MessageFormat(pattern);
		Object[] objs = mf.parse(source);
//		for (Object obj : objs) {
//			System.out.println(obj);
//		}
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		} //for
		
//		String name = "이준희";
//		int age= 20;
//		boolean gender = true;

//		String output =  MessageFormat.format(pattern, name, age, gender);
//		System.out.println(output);
	
	}
}
