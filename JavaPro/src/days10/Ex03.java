package days10;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/*
 * 배열 단점 - > 그래서 컬렉션 클래스 사용한다
 * 1) 배열크기 자동 크기 증가 /감소가 없다
 * 2) 요소 삽입 불편
 */

public class Ex03 {

	static int index = 0; // 전역변수
	static Scanner scanner = new Scanner(System.in);
	static char con = 'y';
	
	
	public static void main(String[] args) throws IOException {

		int [] m = new int[3];
		
		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료" };

		int selectedNumber;
		while (true) {
			dispMenus(menus);
			selectedNumber = selectMenus(scanner);
			processMenus(selectedNumber, m);
		}//while

	}// main

	private static void processMenus(int selectedNumber, int [] m) throws IOException {

		switch (selectedNumber) {
		case 1:
			add(m);
			Ex02 ex02 = new Ex02();
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;
		case 5: // 배열 요소 조회
			list(m);
			break;
		case 6:
			exit();
			break;
		}//switch
		stop();
	} // processMenus

	private static void list(int []m) {
		System.out.println("[5.조회]");
		if(index == 0) System.out.printf("요소 없음");
		else {
			for (int i = 0; i < m.length; i++) {
				System.out.printf("m[%d]=%d");
			} //for
		}
		System.out.println();
	}

	public static void stop() {
		System.out.print(">아무키나 누르면 계속합니다.");

		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		} // catch

	} //stop

	private static  void add(int[] m) throws IOException {
		System.out.println("1.추가");

		do {
			//			if(index == 3) break;
			if(index == m.length) {
				int temp[] = new int [m.length+3];
				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				}//for
				m=temp;
			}//if
			
			System.out.printf("정수입력");
			int n = scanner.nextInt();
			m[index++] = n;
			
			System.out.print("요소 추가 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		}while (Character.toUpperCase(con)=='Y'); 
		//		}while (Character.toUpperCase(con)=='Y' && index< 3); 
	} //add

	private static void exit() {
		System.out.println("\n\n 프로그램 종료합니다");
		System.exit(-1); // 시스템을 어디서나 종료한다.
	} //exit

	private static int selectMenus(Scanner scanner) {
		System.out.printf("메뉴를 선택하세요");

		return scanner.nextInt();
	} // selectMenus

	private static void dispMenus(String[] menus) {
		System.out.println("메뉴");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		} // for
		System.out.println();
	} // dispMenus
}
