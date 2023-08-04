package days03;

public class Ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리 연산자 > 참/ 거짓
		/*
		 * 1. 일반 논리 연산자
		 * ㄱ. && 일반논리 AND (논리곱)
		 * ㄴ. || 일반논리 OR (논리합)
		 * ㄷ. ! 부정연산자 not 연산자 
		 * 2. 비트논리 연산자 : & ^ | ~
		 * 
		 * 산술 > 비교 > 논리 > 대입
		 * &&연산자에서 앞에가 거짓이면 뒤에코드는 처리안한다. 
		 */
		
		System.out.println(3>=5 && 10<1);
		System.out.println(3>=5 || 10<1);
		System.out.println(3<=5 || 10<1); // 노란줄 = DeadCode
		
		System.out.println( !(3>=5) ); // 부정연산자는 int 피연산자에 사용할 수 없다.
		// !부정연산자는 단항 연산자로 어떤 연산자보다 우선 순위가 높다.
	}

}
