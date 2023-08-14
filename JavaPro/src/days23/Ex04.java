package days23;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// 1) a U b	 합집합
		/*
		ArrayList<Integer> hab = new ArrayList<Integer>();
		hab.addAll(a);
		Iterator<Integer> it = b.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if(!a.contains(i)) {
				hab.add(i);
			}
		}
		*/
		HashSet<Integer> hab = new HashSet<Integer>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab);
		
		// 2) a - b	 차집합
		HashSet<Integer> cha = new HashSet<Integer>();
		// 3) a ∩ b	 교집합
		HashSet<Integer> gyo = new HashSet<Integer>();
		/*
		cha.addAll(a);
		cha.removeAll(b);
		*/
		//Iterator는 중간에 수정 x
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if(!b.contains(i)) cha.add(i);
			else {
				gyo.add(i);
			}
			
		}
		System.out.println(cha);
		System.out.println(gyo);
		
		
	
//		gyo.
		
	}
}
