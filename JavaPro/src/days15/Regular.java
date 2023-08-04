package days15;

//정규직
public class Regular extends Employee{

	//is-a관계(상속)--> 정규직은 사원이다
	//필드 - name, addr, tel, hiredate
	//생성자 상속 x
	//메서드 - dispEmpInfo(), @Override toString()

	//*******************필드
	private int basePay; //기본급

	
	//**********************생성자
	public Regular() {
		super();  // 부모의 default생성자를 호출, 생략해도 컴파일러가 자동적으로 실행
		System.out.printf("Regular 디폴트 생성자 호출\n");
	}
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		//The field Employee.name is not visible
		//this.name= name; X
		//this.setName(name); O
		// super(); // 부모의 default생성자를 호출
		super(name, addr, tel, hiredate); //부모 상속된 필드 초기화
		this.basePay = basePay;
		System.out.printf("Regular(5) 생성자 호출\n");
	}
	
	public int getBasePay() {
		return basePay;
	} // getBasePay

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	} // setBasePay
	
	
	//************************메소드
	@Override
	public void dispEmpInfo() {
//		super.dispEmpInfo(); // 부모의 멤버를 가리킬때 super
//		System.out.printf(",기본급: %d\n",this.basePay);
		System.out.printf("사원명: %s, 주소: %s, 연락처:%s, 입사일자:%s 기본급: 500000\n",
				this.getName(),
				this.getAddr(),
				this.getTel(),
				this.getHiredate(),
				this.basePay);
		
	} //dispEmpInfo
	
	@Override
	public String toString() {
		return super.toString()+ String.format(",기본급: %d\n",this.basePay);
	} //toString

	public int getPay() {
		return this.basePay;
	} // getPay
	
} //class Regular
