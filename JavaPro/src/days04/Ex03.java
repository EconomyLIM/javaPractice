package days04;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	//1.제어문
	//1, 정의 : 프로그램의 실행순서를 제어하는 문 
		//2. 종류
		//1) 조건문
		//2) 분기문
		//3) 반복문
		//4) 조건반복문
		//5) 기타
		
		// condition 참/ 거짓 판가름할 수 있는식 
//		if (condition) {
//			
//		}
		// 입력값에 대한 유효성 검사 코딩추가
		
		try (Scanner sc = new Scanner(System.in); ) { //자동으로 리소스를 반환하는// sc.close()안해도됨
			int n = sc.nextInt();
			
			if(n%2 ==0) {
				System.out.println(n+ "은 짝수입니다.");
			} //if문
			else {
				System.out.println("홁수다 임마");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러");
			
		}
		

	
	}

}
