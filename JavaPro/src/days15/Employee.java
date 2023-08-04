package days15;

// 사원 클래스
// 모든 사원들이 공통적으로 가져야할 멤버 구현
public abstract class Employee {
	
	//*****************필드
	private String name; // 사원 이름
	private String addr; // 사원 주소
	private String tel; // 연락처
	private String hiredate; //주소
	
	//*****************생성자
	public Employee() {
	System.out.printf("emplyee 디폴트 생성자 호출\n");
	}
	
	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.printf("emplyee(4)  생성자 호출\n");
	}
	
	//*****************메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	//해당 사원들의 정보를 출력하는 메소드
	public void dispEmpInfo() {
		System.out.printf("사원명: %s, 주소: %s, 연락처:%s, 입사일자:%s\n",
				this.name,
				this.addr,
				this.tel,
				this.hiredate);
	} // dispEmpInfo

	@Override
	public String toString() {
		return String.format( "사원명: %s, 주소: %s, 연락처:%s, 입사일자:%s",
				this.name,
				this.addr,
				this.tel,
				this.hiredate);
	} // toString
	
	/*
	 public int getPay() { //가상적으로 기능은 없지만 만들어놓고 오버라이딩 해서 써라 
		 return 0;
	 }*/
	
	//This method requires a body instead of a semicolon
	// body라고 불리는 body{}몸체가 구현이 안된 불완전한 메서드 = 추상메서드
	// abstract 키워드 붙인다.
	public abstract int getPay();
	
	//The abstract method getPay in type Employee can only be defined by an abstract class
	// 추상메소드가 1개라도 있으면 불완전한 클래스가 된다. -> 객체를 생성할 수 없다. -> 추상클래스라고 부른다.
	// 추상클래스는 클래스 앞에 abstract붙인다.
	
	
} //class
