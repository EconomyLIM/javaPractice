package days20;

import java.text.MessageFormat;

public class Ex10 {
	public static void main(String[] args) {
		// MessageFormat
		/* 특정형식 <- 데이터 (값) 출력
		 * 			  -> 데이터 (값) 읽기	
		 */
		
		String name = "이준희";
		int age= 20;
		boolean gender = true;
		
		// 위에 (데이터)값들을 특정형식으로 출력하고 싶다.
		//[1]String.format
//		String output = String.format("", name, age, gender);
		
		//[2]MessageFormat
		String pattern = "이름:{0}, 나이: {1}, 성별: {2}";
		String output =  MessageFormat.format(pattern, name, age, gender);
		System.out.println(output);
	
		// INSERT INTO board(no, title, writer, content, regdate)
		// Values ('{0}', '{2}','{1}','{4}','{5}') 
	}
}
