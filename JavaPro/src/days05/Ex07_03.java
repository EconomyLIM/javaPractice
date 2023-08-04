package days05;

public class Ex07_03 {
	public static void main(String[] args) {
		// for each문
		
		prac1();
	} // main
	
	private static void prac1() {
		// 1. 정수 10개 저장할 배열 m 을 선언
		// 2. 임이의 정수 1~100을 각 배열의 요소에 저장
		// 3. for문을 사용해서 각 배열의 요소를 출력
		int m[] = new int [10];
		
		for(int i = 0 ; i < m.length ; i++) {
			m[i] = (int)(Math.random()*100 +1);
		}
		
		for (int n : m) {
			System.out.println(n);
			
		}
	}// prac1
} // class
