package days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex12 {
	public static void main(String[] args) {
		// iterator(반복자), enumeration(열거자)
		// Listiterator (반복자)
		/* iterator에 양방향으로 조회기능이 추가된 반복자
		 * 왜 앞에 list가 붙어있나? list인터페이스를 구현한 클래스만 이 반복자 사용가능
		 * hasNext() hasPervious()
		 * next()		previous()
		 */
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator it = v.listIterator();
		while (it.hasNext()) {
			String name= (String)it.next();
			System.out.println(name);
		}
		//
		System.out.println("역방향으로 진행");
		while (it.hasPrevious()) {
			String name= (String)it.previous();
			System.out.println(name);
		}
	}
}
