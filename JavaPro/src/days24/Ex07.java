package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07 {
	/* 제네릭스 어노테이션 열거형
	 * 자바10
	 * 스레드 + 네트워크x
	 * 람다식과 스트림
	 */
	public static void main(String[] args) {
		/*[제네릭Generics]
		 * 1. jdk1.5 제네릭
		 * 		jdk1.8 - 람다식
		 * 2. 제네릭이란?
		 * 		다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에서 [컴파일시] 타입을 체크해주는 기능
		 * 3. 왜? 1)객체의 타입을 컴파일시에 체크하기 때문에 객체의 타입 안정성을 높이고, 2)형 변환의 번거로움이 줄어든다. - > 코드가 간결해짐 
		 */
		/*
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList list = new ArrayList();
		list.add("홍길동");
		String name =(String) list.get(0); // 다운캐스팅
		System.out.println(name);
		
		list.add(20); 
		int age = (int) list.get(1);
		
		list.add(true);
		list.add('a');
		*/
		// 제네릭 클래스 <>
		ArrayList<String> list = new ArrayList<String>(); // 컴파일 될때 타입이 정해진더.
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영");
		/*
		String name = list.get(0);
		System.out.println( name );
		*/
		/*
		Iterator it =  list.iterator();
		while (it.hasNext()) {
			String name = (String) it.next(); // 제네릭을 안썼으면 다운캐스팅을 꼭 해야한다.
		}
		*/
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	} //main
}
