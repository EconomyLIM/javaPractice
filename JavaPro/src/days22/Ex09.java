package days22;

import java.util.Stack;

public class Ex09 {
	public static void main(String[] args) {
		// ArrayList 특징
		// Vector 특징				특징은 알아야 한다.
		// LinkedList 특징
		// Stack 과 Queue
		/* 		
┌─────────────────────┐
│	                                     │
│                                       │

		 * 		                       
		 *  스택은 라스트인 퍼스트 아웃(LIFO)구조
		 *  ->push
		 *  <- pop()		peek() : 마지막에 뭐가 들어있는지 확인만하는것
		 *   empth()
		 *   index search() 없으면 -1반환 / 0부터 시작하지않고 1부터 서치 시작
		 *   스택은 어디서 사용하냐 -> 웹브라우저에서 뒤로/ 앞으로 
		 */
		// Vector 부모클래스 동기화 처리 o
		
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		/*
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop()); // java.util.EmptyStackException
		*/
		/*
		while (!s.empty()) {
			System.out.println(s.pop());
		}
		*/
		/*
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek());
		*/
		System.out.println(s.search("임경재")); // 3 -> 1부터 찾음 (뒤에서)
	}
}
