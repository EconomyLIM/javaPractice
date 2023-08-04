package days07;


public class Ex07_02 {
	int a = 1;
	public static void main(String[] args) {
		/*
		// 1. 1/2+2/3+3/4+ ... +8/9+9/10= ???
		double sum = 0;
		for (int i = 1; i <= 9 ; i++) {
			sum += (double)i/(i+1);
			System.out.printf("%d/%d+", i ,i+1);
		}
		System.out.printf("=%f\n", sum);
		
		
	    // 2. 1+2+4+7+11+16+...+191 = ???
		// 계차수열 --> https://terms.naver.com/entry.naver?docId=3338127&cid=47324&categoryId=47324
		int term = 1; //항
		int defference = 0; //계차
		int sumTwo = 0; // 총합
		
		for (int i = 1; i <= 20; i++) {
			term += defference;
			System.out.printf("%d+",term);
			sumTwo +=term;
			defference++;
		}
		System.out.printf("%d", sumTwo);
		*/
		
		for (int i = 1; i <= 20; i++) {
			//(n^2-n)/2+1 <<공식
			int term =  (int) ((Math.pow(i, 2)-i)/2+1);
			System.out.printf("%d+ ",term);
		} // for
		
	} // main
}
