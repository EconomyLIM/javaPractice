package days02;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f ; // 4바이트 = 32비트[[0][00000000 8지수] [0*23 23가수]]
		double d; // 8바이트 = 64비트 [[0][00000000 11지수] [0*52 52가수]] 52자리에 소수점 52자리가 저장됨
		//float 와 double은 오차가 있다.
		// 9.1234567 실수
		// 1001.000111111....
		//1.xxx x 2^n 정규화
		// 앞으로 모든 실수 자료형은 double을 쓰는게 낫다 -> 오차를 줄일 수 있으니깐
		
		float pi = (float)3.14;
		System.out.println(pi);
	}

}
