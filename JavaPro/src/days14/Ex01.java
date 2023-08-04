package days14;

public class Ex01 {
	
	//필드
	String message;
	//생성잦 선언
//	public  Ex01() {
//		System.out.println("Ex01디폴드 생성자");
//		message = "안녕";
//	} // Ex01
	
	public Ex01(String string) {
		System.out.println("Ex01 1 생성자");
		message = string;
	}

	public static void main(String[] args) {
		
//		Ex01 obj = new Ex01();
		
		//he constructor Ex01(String) is undefined
		Ex01 obj = new Ex01("원하는 메시지");
		
		System.out.println(obj.message);
		/*
		 * 낼 시험문제 1번 - > 생성자(constructor)가 뭔지 
		 * 1. 일종의 메서드이다. (생성자 메서드라고 불린다)
		 * 2. 메서드명 == 클래스명 -> 메소드명 반드시 클래스의 이름과 같아야 한다. 
		 * 3. 리턴 자료형을 사용하지 않는다. (void도 사용하지 않는다. == return문도 사용하지 않는다. )
		 * 4. 매개변수가 없는 생성자를 디폴트 생성자라고 한다.
		 * 5. 접근지정자 p,p,d,p, 기타제어자 x
		 * 6. 생성자는 인위적으로 호출할 수 없다. ->객체명.생성자 메서드 X
		 * 		호출 시기: 객체 생성할때 자동으로 호출 된다. Ex) new Ex01(); ->생성자 호출
		 * 7. 생성자 역할: 객체 생성할때 > 생성자 호출> 필드 초기화 
		 * 8. 생성자는 오버로딩(중복함수) 가능
		 * 9. 클래스 선언시 생성자를 1개라도 선언하지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가후 컴파일 한다.
		 * 10. 디폴트 생성자를 선언하지 않고 생성자를 오버로딩하면 주의사항
		 * 11. 생성자는 상속되지 않늕다 
		 */
		
	} //main
}
