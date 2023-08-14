package days23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
		
		int n= 5;
		LinkedHashSet<Integer> lotto = null;
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>();
		ArrayList<Integer> slist = null;	
		int no=1;
		int lottoNumber ;
		for (int i = 0; i < n; i++) {
			lottoNumber = -1;
			lotto = new LinkedHashSet<Integer>();
			while (lotto.size() <6) {
				lottoNumber = (int)(Math.random()*45)+1;
				lotto.add(lottoNumber);
				
			}
			lottos.add(lotto);
		} //for
		
		Iterator<LinkedHashSet<Integer> > it =  lottos.iterator();
		
		while (it.hasNext()) {
			lotto = it.next();
			System.out.printf("%d게임",no++);
			Iterator<Integer> ir2 = lotto.iterator();
			while (ir2.hasNext()) {
				lottoNumber = ir2.next();
				System.out.printf("[%02d]", lottoNumber);
				
			}
			System.out.println();
		}

}
}


