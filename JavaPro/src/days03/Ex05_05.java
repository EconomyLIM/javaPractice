package days03;

public class Ex05_05 {

	public static void main(String[] args) {
		//단항연산자 : ++ -- + - ~(비트부정 연산자) ! (cast)
		
		System.out.println(+3); //양수를 나타내는 단항연산자
		System.out.println(-3); //음수를 나타내는 단항연산자
		
		//비트부정 (틸드)연산자 0>1 1>0
		System.out.println(~5);
		// 5를 2진수를 바꾸면 0000 0101
		// 를 부정하면 1111 1010
		// -1하면 1111 1001
		// 1의보수 0000 0110 --> 6 의 음수 --> -6
		}

}
