package days08;
//
public class Ex09_02 {
	public static void main(String[] args) {
		int lotto[] = new int [6];

		fillLotto(lotto);
		dispLotto(lotto);


	}

	public static void fillLotto(int[] lotto) {
		
		int index = 0;
	
		int lottoNumber = (int)(Math.random() *45 + 1);
		lotto[index++] = lottoNumber;
		System.out.print(lottoNumber);
		
		boolean flag = false;
		
		while(index <= 5) {
			flag = false;
			
			lottoNumber= (int)(Math.random() *45 + 1);
			
			for (int i = 0; i < index; i++) {
				if(lotto[i] == lottoNumber) {
					flag = true;
					break;
				}
			}//for
			if (!flag) {
				lotto[index++] = lottoNumber;
			}
		}// while
		System.out.println();
	} //fillLotto

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n",i ,lotto[i]);
		}
	}

}
