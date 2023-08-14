package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex05_03 {
	public static void main(String[] args) {
		int [] score = {80,95,50,85,45,65,10,100};
//		Integer scoreArr[] = Arrays.stream(score).boxed().toArray(Integer[]::new);
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
		// 1. 75보다 큰점수 출력
		// 2) 50보다 작은 점수를얻어와서 출력
		// 3) 50~75
		
//		List list = Arrays.asList(score);
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
		/*
		Collection<int[]> list = Arrays.asList(score);
		TreeSet<Integer> ts = list.toArray();
		*/
		
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} //for
		System.out.println(ts.subSet(75, true, ts.last(), true));
		System.out.println(ts.subSet(ts.first(), 50));
		System.out.println(ts.subSet(50, 75));
		NavigableSet<Integer> ss = ts.tailSet(75, false);
	}
}
