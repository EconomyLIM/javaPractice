package days06;

import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) {
		// 정규 표현식
		one();
	}

	private static void one() {
		int n;
		
		try(Scanner scanner = new Scanner(System.in)) {
			

			
			System.out.print("> 정수(n) 입력? ");
			String inputString = scanner.nextLine();
			// 비밀번호 --> 8~15, 숫자1, 알대1, 알소1, 특수문자
			
			// 정규 표현식
			// 0~9숫자로만 이루어진 문자열을 체크하는 정규표현식
//			String regex = "^[0-9]+$"; // +: 한개이상 // ^[ ]+$: 처음부터 끝까지  
			String regex = "^\\d+$"; // 위에거와 동일
			boolean flag= inputString.matches(regex); // 숫자가 아니면 true로 바꾼다.

			
			
			if (flag) { //-->flag값이 false냐 물어보는식
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
