package days04;

public class Ex06 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i = 0 ; i <= 10 ; i++){
			
			if(i == 10) {
				System.out.printf("%d =", i);
			}else {
				System.out.printf("%d+", i);
			}//else
			sum += i;
		}
		System.out.printf("%d", sum);
	}
}


