package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex02 {
	public static void main(String[] args) {
		//Properties 컬렉션 클래스
		// . 현재 디렉토리
		// .. 현재 디렉토리의 상위디렉토리
		// 자바프로젝트명
		/*
		String userDir =  System.getProperty("user.dir");
		System.out.println(userDir);
		*/
		Properties sysProps = System.getProperties();
		Enumeration<Object> em = sysProps.keys();
		while (em.hasMoreElements()) {
			String key = (String) em.nextElement();
			String value = System.getProperty(key);
			System.out.println(key + " : " + value);
		}
		
	}
}
