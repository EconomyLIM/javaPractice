package days15;

// 영업직 사원 클래스
// 자식클래스를 가질 수 없는 final(최종)클래스
public final class SalesMan extends Regular{
	
	//필드 - name, addr, tel, hiredate, basePay
	// 생성자 상속 x
	// 메소드 - dispEmpInfo(), @toString(), getPay();
	
	//----------------------------필드
	private int sales;
	private int comm;
	
	//----------------------------생성자
	public SalesMan() {
		super();
		System.out.printf("Salesman 디폴트 생성자 호출");
	}
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		
		System.out.printf("Salesman(7) 생성자 호출");
	}
	
	//----------------------------메소드
	@Override
	public void dispEmpInfo() {
		
		System.out.printf("사원명: %s, 주소: %s, 연락처:%s, 입사일자:%s 기본급: %d, 판매량: %d, 커미션: %d\n",
				this.getName(),
				this.getAddr(),
				this.getTel(),
				this.getHiredate(),
				this.getBasePay(),
				this.sales,
				this.comm);
		
	} //dispEmpInfo
	
	public int getPay() {
		return super.getPay() + this.sales*this.comm;
	} // getPay
	
} //class SalesMan
