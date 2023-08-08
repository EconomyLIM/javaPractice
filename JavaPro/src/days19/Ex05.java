package days19;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * [Math] 클래스
		 * 수학 관련된 static 메서드
		 * static필드 2개
		 */
		
		System.out.println(Math.sqrt(4));
		System.out.println("-".repeat(40));
		//올림 , 내림, 반올림
		
		// 소수점 첫번째 자리에서 올림
		System.out.println(Math.ceil(2.179)); // return -> double
		System.out.println(Math.ceil(2.523));
		System.out.println(Math.ceil(2.0));
		System.out.println("-".repeat(40));
		// 소수점 첫번째 자리에서 내림
		System.out.println(Math.floor(2.179)); // return -> double
		System.out.println(Math.floor(2.523));
		System.out.println(Math.floor(2.0));
		System.out.println("-".repeat(40));
		//반올림 함수
		System.out.println(Math.round(2.179)); // return -> int
		System.out.println(Math.round(2.523));
		System.out.println(Math.round(2.0));
		System.out.println("-".repeat(40));
		
		// Math클래스 : 최대 성능을 얻기 위해서 
		//					JVM이 설치된 Os의 메서드를 호출해서 내부적으로 처리
		// 					문제점: 운영체제가 다르면 결과는 다르게 나올 수 있음.
		//StrictMath클래스: 성능은 포기하더라도 OS마다 동일한 결과값을 나오게하기 위해 StaticMath클래스 사용
	}
}
