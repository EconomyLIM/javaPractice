package days06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		one();
	}

	private static void one() {
		int n;
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			boolean flag= false; // 숫자가 아니면 true로 바꾼다.
			System.out.print("> 정수(n) 입력? ");
			
			String inputString = scanner.nextLine();
			char [] idArr = inputString.toCharArray();
			for (int i = 0; i < idArr.length; i++) {
				
				
				if (!('0' <= idArr[i] && idArr[i] <='9')) {
					flag = true;
					break;
				} //if
			} // for
			
			if (!flag) { //-->flag값이 false냐 물어보는식
				n= Integer.parseInt(inputString);
				System.out.println(n);
			}else {
				System.out.println("잘못입력");
			}
			//			n = scanner.nextInt();
			
		} catch (Exception e) {
			
		}// catch
	}//one
}
