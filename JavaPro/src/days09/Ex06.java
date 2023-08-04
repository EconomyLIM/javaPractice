package days09;

import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) {
		
		int [] m = new int[3];
		
		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료" };
		Scanner scanner = new Scanner(System.in);
		int selectedNumber;
		while (true) {
			dispMenus(menus);
			selectedNumber = selectMenus(scanner);
			processMenus(selectedNumber);
		}//while
		
	}// main

	private static void processMenus(int selectedNumber) {
		
		switch (selectedNumber) {
		case 1:
			System.out.println("배열에 요소 추가");
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;
		case 6:
			exit();
		default:
			break;
		}
	} // processMenus
	
	private static void exit() {
		System.out.println("\n\n 프로그램 종료합니다");
		System.exit(-1); // 시스템을 어디서나 종료한다.
	} //main

	private static int selectMenus(Scanner scanner) {
		System.out.println("메뉴를 선택하세요");
		
		return scanner.nextInt();
	} // selectMenus
	
	private static void dispMenus(String[] menus) {
		
	} // dispMenus
	
} //class
