package days04;

import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		int sum = 0;
		// for --> 초기식 : 조건식 : 증감식
//		for( ; ; ) {
//			System.out.printf("%d + ", i);
//			sum +=i++;
//			if (i== 11) {
//				break; //조건식도 없고 break 도 없으면 무한루프 
//			} //for
//		}
//		System.out.printf("\b = %d", sum);
		
//		for(int i = 1, j=1, k=10 ; (i<=10) && (k>=1) || (j<=10); i++, j++, k--) {  // 초기, 조건, 증감 세개다 여러개 가능하다.
//			
//			System.out.printf("%d + ", i);
//			sum +=i;
//		} // for
//		
//		System.out.printf("\b = %d", sum);
		
		for(int i = 10 ; i>=1 ; i--) {
			
			System.out.printf("%d + ", i);
			sum +=i;
		}
		System.out.printf("\b = %d", sum);
		
		//문제 1~10까지의 합을 주세요
	}

}
