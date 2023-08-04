package days03;

public class Ex08 {

	public static void main(String[] args) {
//		float pi = (float) 3.141592;
		float pi = 3.141592f;
		System.out.println((int) (pi * 1000 + 0.5)); //3141.592
		System.out.println((int) (pi * 1000 + 0.5)/ 1000f); 
		// 소수점 네번째 자리 에서 반올림한 실수값을 얻어와서 출력한다.
//		System.out.printf("%.3f", pi);
		pi = Float.parseFloat(String.format("%.3f", pi));
//		pi = Float.parseFloat(String.format("%.3f", pi));
		System.out.println(pi);
	}

}
