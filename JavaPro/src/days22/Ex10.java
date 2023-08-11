package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class Ex10 {
	public static void main(String[] args) {
		//큐(Queue)
		// Deque == DoubleQueue
		/* FIFO 구조
		 *  offer()		poll(), peek()함수와 똑같다.
		 *  
		 */
		// Collection 인터페이스를 상속받은 인터페이스
//		Queue<String> q = new LinkedList<String>();
		Deque q = new LinkedList();
		
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		q.offerFirst("이상문");
//		q.pollFirst();
//		q.pollLast();
		
		while (!q.isEmpty()) {
//			System.out.println(q.poll());
			String name = (String)q.remove();
			System.out.println(name);
		}
	}
}
