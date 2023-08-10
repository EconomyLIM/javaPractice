package days21;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14_02 {
	public static void main(String[] args) {

		ArrayList team1 = new ArrayList(10);
		//		System.out.println(team1.size()); //size는 요소의 갯수를 출력
		String t1 = "이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 ";
		//		t1 =  t1.replace("(팀장)", " ");
		t1 =  t1.replaceAll("[(]팀장[)]", " ");
		// t1 =  t1.replaceAll("\\(팀장\\)", " "); 위와 동일
		String [] t1Arr =  t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		} //for
		//System.out.println(team1);

		ArrayList team2 = new ArrayList(10);
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");

		ArrayList team3 = new ArrayList(10);
		team3.add("박정호");
		team3.add("이상문");
		team3.add("이주영");

		ArrayList<String> class5= new ArrayList<String>(team1);
		System.out.println(class5);
		class5.addAll(team2);
		System.out.println(class5);
		class5.addAll(team3);
		System.out.println(class5);

		//
		Iterator ir = class5.iterator();
		while (ir.hasNext()) {
			String object = (String) ir.next();
			//			System.out.println(object);
		}
		System.out.println(class5.containsAll(team1)); //true
		// 원본 그대로 유지 - 복제본, 수정 삭제 추가
		ArrayList class5Clone = (ArrayList) class5.clone();
		class5Clone.removeAll(team1);
		// 2조 + 3조원
		
		System.out.println(class5Clone);
		// 정렬할때 Comparator 
		// 바로 밑 익명클래스
		/*
		class5Clone.sort( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		} );
		*/
//		class5Clone.sort(String::compareTo);
		System.out.println(class5Clone);
		
		
	}
}

/*
1조
이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
2조
박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
3조
박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
 */