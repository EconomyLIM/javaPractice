package days18;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;

public class Ex08_03 {
	public static void main(String[] args) {
		String s= "안녕하세요 .입니다 .입니다 .입니다";
		String name = "홍길동";
		System.out.println(s);
		//첫번째 입니다를 찾아서 앞에 홍길동
//		int index = s.indexOf("입니다");
//		System.out.println(index);
		/*
		s.substring(0,7); // 안녕하세요 .
		+name
		+s.substring(index) // 7번째 부터 다시 복사
		*/
		/*
		ArrayList list = new ArrayList();
		String regex = " ";
		String [] names = s.split(regex);
		for (int i = 0; i < names.length; i++) {
			list.add(i, names[i]);
		} //for
		list.add(3,"홍길동");
		System.out.println(list);*/
		/*
		int index = s.lastIndexOf("입니다");
		System.out.println(index);
		s = s.substring(0,index) +name +s.substring(index);// 7번째 부터 다시 복사
		*/
		/*
		int fromIndex = 0;
		int Index = s.indexOf("입니다", fromIndex);
		System.out.println(Index );
		fromIndex = Index  +"입니다".length();
		int secondIndex = s.indexOf("입니다.", fromIndex);
		*/
		int fromIndex = 0;
		int index = -1;
		while ((index = s.indexOf("입니다", fromIndex))!= -1) {
			System.out.println(index);
			fromIndex = index + "입니다".length();
		}
		
		// 메서드
		// 매개변수 (String target, String sw, int no)
		// 리턴값 : int index;
		
	}
}
