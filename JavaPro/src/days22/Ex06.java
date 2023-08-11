package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		// [시험]
		// String[] -> ArrayList 변환
		String [] nameArr = {"송해영", "유희진", "임경재", "정하영" };
		ArrayList names = new ArrayList(4);
		//1. for을 돌려서 Arraylist에 add로 추가
		//2. Type == 클래스 
		// List<t>list = Arrays.asList(T,a)
		List li = Arrays.asList(nameArr);
		System.out.println(li);
		
		ArrayList list2 = new ArrayList(li);
		System.out.println(list2);
		// ArrayList ->String 
		
	} //main
}
