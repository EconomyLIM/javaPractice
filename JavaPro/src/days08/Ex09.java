package days08;

public class Ex09 {
	public static void main(String[] args) {
		//로또 6/45
//		1~45 정수를 6개 출력
		for (int i = 1; i <= 6; i++) {
			int lottoNumber = (int)(Math.random()*45+1);
			System.out.println(lottoNumber);
		}// 중복번호 있을 수 있음
		
	} //main
}
