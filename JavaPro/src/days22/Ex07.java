package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// Vector 컬렉션 클래스
		// 		ㄴ List 인터페이스를 구현한 클래스
		// 		ㄴ 순서유지 중복허용
		//		ㄴ ArrayList와 동일
		//		차이점-> Vector은 멀티스레드에 안전(동기화 처리)
		// 		StringBuilder : 멀티스레드에 ㅌx 동기화 처리 x
		// 		StringBuffer : 멀티스레드에 o 동기화처리 o
		
		Vector vector = new Vector();
		
		vector.addElement("김호영"); //add() 와 동일
		vector.add("김성준");
		vector.add("이지현");
		
		System.out.println(vector.size()); //3
		System.out.println(vector.capacity()); //10
		
		vector.trimToSize(); //빈곳 제거
		System.out.println(vector.size()); //3
		System.out.println(vector.capacity()); //3
		
		vector.setSize(5);
		System.out.println(vector.size()); //5
		System.out.println(vector.capacity()); //6
		System.out.println(vector);
		
		vector.get(0); //김호영
		vector.elementAt(0); //0번째 요소를 가져오겠다.
		
		// 반복자X 열거자를 돌려준다.
		Enumeration em =  vector.elements(); // Enumeration<<열거자라고 부른다.
		Iterator ir = vector.iterator();
		// 반복자와 열거자의 차이점
		//
		/* fail fast
		 * 요소들을 읽고있는데 요소 값이 바뀌면 예외를 발생시킨다 -> 반복자 Iterator
		 * 요소들을 읽고있는데 요소 값이 바껴도 모른다 -> 열거자 Enumeration
		 * 
		 */
		//hasMoreElements -> 요소 더있는지 물어봄 ->true/false로 돌려줌
		while (em.hasMoreElements()) {
			// nextElement -> 다음 요소를 얻어오는 함수
			String name = (String) em.nextElement();
			System.out.println(name);
		}
		
		String str = (String) vector.remove(0);
		vector.removeElementAt(0);
		System.out.println(vector);
		
		// v벡터 null요소 제거한 나머지 요소를 출력
		vector.removeIf(n-> n== null);
		System.out.println(vector);
		// 메서드 참조
		vector.forEach(System.out::println);
		vector.forEach(n -> System.out.println(n));
		vector.addElement("김호영"); //add() 와 동일
		vector.add("김성준");
		vector.add("이지현");
//		vector.clear();
//		vector.clone();
//		vector.copyInto();
//		vector.firstElement() == vector.get(0)
//		vector.lastElement(); //마지막요소 가져온다. == vector.get( v.size()-1)
		vector.insertElementAt("임경재", 1); // ==vector.add(1,"임경재")
//		vector.listIterator();
		List sublist =  vector.subList(0, 2);
		System.out.println(sublist);
		
		
	}
}
