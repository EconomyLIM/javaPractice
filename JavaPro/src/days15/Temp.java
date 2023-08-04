package days15;

//임시직 사원 클래스
public class Temp extends Employee{
	
	//------------------------------- 필드
	private int days; // 근무일수
	private int payOfDay; // 하루일당
	
	//------------------------------- 생성자
	public Temp() {
		super();
		System.out.printf("Temp 디폴트 생성자 호출");
	}
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDays) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.payOfDay = payOfDays;
		System.out.printf("Temp(6) 생성자 호출");
	}
	
	//------------------------------- 메소드
	@Override // 어노테이션 붙이면 컴파일러가 체크해줌
	public int getPay() {
		return this.days*this.payOfDay;
	}
	
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명: %s, 주소: %s, 연락처:%s, 입사일자:%s, 근무일수:%d, 하루일당:%d \n",
				this.getName(),
				this.getAddr(),
				this.getTel(),
				this.getHiredate(),
				this.days,
				this.payOfDay);
	} // dispEmpInfo
	
} //class Temp
