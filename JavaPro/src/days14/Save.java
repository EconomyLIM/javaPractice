package days14;

//저축 관련 클래스 -> static 키워드
public class Save {
	
	// 필드
	private String name; //예금주
	private int money;	 //예금액
	
	//1. 인스턴스가 생성될 때 마다 필드가 생성되지 않는다.
	// 2. 클래스가 선언될때 Method Area에 필드가 생성
	// (객체를 생성하지 않아도 static필드는 벌써 생성되어져 있다. 프로그램 시작하면 메모리에 올라갔다가 프로그램 종료해야 사라진다.
	// 3. 모든 인스턴스(객체)가 공유하는 필드 된다
	// 공유 변수(필드), shared 변수, static 변수, 정적
	// [문제1]rate 이자율 왜 static 필드로 선언했나요?
	// ==static 필드는 언제 사용하나요?
	// -> 모든 객체가 다 사용하는 거라면 static 필드로 만드는게 낫다.
	// [문제2] 정적static 메서드 언제 사용하나요??
	// -> private으로 선언된 static필드에 접근하려면 static 메서드가 필요하다.
	// -> 
	
	private static double rate = 0.04;	 //이자율
	// 생성자
	public Save() {} //default Save
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		Save.rate = rate;
	} // Save(3)
	
	// 인스턴스 메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//static 메서드, 클래스 메서드, 정적메서드
	public static double getRate() {
		return rate;
	}// getRate
	
	// [static 선언할시] Cannot use this in a static context
	public static void setRate(double rate) {
		// 1.this 사용x
		// 2.인스턴스 변수 사용x
		// 3. 지역변수는 사용 가능
		int n = 10;
//		this.rate = rate;
		Save.rate = rate;
	} // setRate
	
	public void dispSave() {
		System.out.printf("예금주: %s, 예금액: %d, 이자율: %.2f \n",this.name, this.money, this.rate);
	} // dispSave
} //class
