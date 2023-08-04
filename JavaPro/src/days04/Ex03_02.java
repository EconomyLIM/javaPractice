package days04;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); ) { //자동으로 리소스를 반환하는// sc.close()안해도됨
			int n = sc.nextInt();
			
			String result = "짝수";
			
			if(n%2 != 0) {
				result = "홀수";
			}
			
//			if(n%2 ==0) {
////				System.out.println(n+ "은 짝수입니다.");
//				result = "짝수";
//			} //if문
//			else {
////				System.out.println("홀수지롱");
//				
//			}//else
			
			System.out.printf("n = %d, %s", n, result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러");
		}// catch

	}

}
