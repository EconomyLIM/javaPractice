package days03;

public class Ex05_06 {
	int money = 3000;

	public static void main(String[] args) {
	// 단항연산자 ++ --  <--이 두개 증감연산자라고 부른다.
		// 어떤 기억공간의 값을 1증가시키는 코딩
		int n = 10;
		System.out.println(n);
		
		n++; //후위형 증감연산자
		// ++n; // 전위형 증감연산자
		// n+=1; 복합 대입 연산자+= 복합
		// n = n+1;
		System.out.println(n);
		
		n--; //후위형 증감연산자
		//--n; // 전위형 증감연산자
		//n = n-1;
		// n -=1; 복합 대입 연산자
		System.out.println(n);
		
		// n = n+3; 
		// n+=3;
		
		setMoney(0);
		
	}
	public static void setMoney (int money) {
		for(int i = 0 ; i <= 10 ; i ++) {
			
			money = money +i;
		}
		System.out.println(money);
	}
	
}
