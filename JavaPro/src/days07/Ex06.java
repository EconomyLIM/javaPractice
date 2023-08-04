package days07;

public class Ex06 {
	int a = 1;
	public static void main(String[] args) {
		int sum= 0;
		
		for (int i = 1; i <=10 ; i++) {
			
			sum += i%2==0?-i:i;
			System.out.printf(i%2==0?"%d+" : "%d-", i );
			/*
			if (i%2 ==0) {
				System.out.printf(" %d + ", i);
				sum = sum-i;
			}
			else {
				System.out.printf(" %d - ",i);
				sum = sum+i;
			}
			*/
		} //for
		
		// switch 문 쓰는게 좋다.
		
		boolean sw = false; //default = false;
		
		for (int i = 1; i <=10 ; i++) {
//			if (sw) {
//				System.out.printf(" %d + ", i);
//				sum = sum-i;
//				//sw = false;
//			}
//			else {
//				System.out.printf(" %d - ",i);
//				sum = sum+i;
//				//sw = true;
//			}
			sum += sw? -i : i;
			sw = !sw;
		}
		System.out.printf("\b =%d", sum);
	} //main
}
