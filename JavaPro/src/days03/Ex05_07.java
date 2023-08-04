package days03;

public class Ex05_07 {

	public static void main(String[] args) {
		int x = 10;
//		int y = ++x; //전위형 
		int y = x++;// 후위형
		// 단독홀로 사용될 떄는 전.휘위형은 같은 결과이고 
		
		System.out.println(x + " , " + y);
	}

}
