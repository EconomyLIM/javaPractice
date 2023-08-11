package days22;

public class Ex08 {
	public static void main(String[] args) {
		// 특징은 암기해놓아야한다. 순서가 유지하고 있다.
		// LinkedList 컬렉션 클래스
		/* 1. 배열 ->
		 * 		특징: 메모리상에 동일한 자료형으로 연속적으로 놓임 
		 * 		장점: 읽기 성능이 가장빠르다.
		 * 		단점: 배열이 동적으로 하기 어렵다.
		 *  	
		 * 2. LinkedList
		 * 		특징: 비연속적
		 * 		(1) ArrayList, Vector + Element(요소)
		 * 		(2) LinkedList 안에 들어간 값 = 노드(Node)
		 * 			각 노드들은 연결되어져 있다.
		 * 			[노드]		[0x100]노드]		[0x200]노드]
		 * 	주소:	0x100	0x200				0x300
		 * 	ex) 중간에 노드를 삽입하고 싶다(주소0x400)
		 * 
		 * 주소를 하나만 가지고 있는것 = 단방향 링크드리스트
		 * 주소를 앞뒤 두개씩 가지고 있는 것 = 양방향 링크드리스트
		 * 환형 링크드리스트 
		 */
		
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 20;
		node2.next = node1;
		
		Node node3 = new Node();
		node3.value = 30;
		node3.next = node2;
		
		Node node4 = new Node();
		node4.value = 40;
		node4.next = node3;
		
		//
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		//노드3삭제
		node5.next = node4;
		// node4삭제
		node5.next = null;
	}		
		
}

class Node{
	int value;
	Node next = null; //다음 노드의 주소를 참조필드
	//Node prev = null; //이전 노드의 주소를 참조필드
	
}