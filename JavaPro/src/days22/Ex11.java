package days22;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11 {
	public static void main(String[] args) {
		// Priority: 우선순위
		// PriorityQueue -> 우선수위가 높은것부터 꺼내오는 큐
		Queue q = new PriorityQueue();
		
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println(q);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}