package days18;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		//The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
//		Arrays.sort(m, Collections.reverseOrder());
		// 기본형 배열은 이 형태를 사용할 수 없다.
//		Arrays.sort(null);
//		타입의 T는 절대 클래스가 와야한다
		/*
		 * 비교를 해가지고 내림찬수를 할 수 있는데 배열이 기본형은 안된다 
		 * 반드시 collecntion은  comparable을 상속 받은것만 가능하다
		 */
		
		
		
//		int tmp [] = new int [m.length];
//		for (int i = m.length-1; i >=0 ; i--) {
//			tmp[4-i] = m[i];
//		} //for
		
//		System.out.println(Arrays.toString(tmp));
		
		// 기본형 int를  래퍼클래스 Integer클래스로 변환
		Integer [] temp =  Arrays.stream(m).boxed().toArray(Integer [] :: new);// box -> Integer로 된 stream 객체가됨
		Arrays.sort(temp, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(temp));
		
	} //main
}
