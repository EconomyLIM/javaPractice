package days04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in); ) { //자동으로 리소스를 반환하는// sc.close()안해도됨
			int n = sc.nextInt();
			
			String result = null;
			
			//switch문
			//key: 변수, 수식
			//value 리터럴
			switch (n%2) {
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
				default:
					break;
			}
			System.out.printf("n = %d, %s", n, result);
		} catch (Exception e) {
			e.printStackTrace();
		}// catch
		
		System.out.println("END");
	}

}
