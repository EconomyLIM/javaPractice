package days04;

public class Ex06_03 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i = 0 ; i <= 10 ; i++){

			System.out.printf("%d+", i);
			sum += i;
			
		}// for
		System.out.printf("\b = %d", sum); //\b --> 백스페이스 
	}
}


