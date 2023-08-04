package days10;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		System.out.printf("%d\t%d",(int) '가', (int) '힣');
		//											44032		55203
		
		Random rnd = new Random();
		char one = (char)(rnd.nextInt('힣' - '가' + 1) +'가');
		
		for (int i = 0; i < 10; i++) {
			System.out.println(one);
			
		}

		
		
		// 12~23  임의의 정수
		// 0~11 임의의 정수             +12
		
	  // (int)(	Math.random()*12(max-min+1 ) + min(가)
		//
	}
}
