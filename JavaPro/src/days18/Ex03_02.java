package days18;

public class Ex03_02 {
	public static void main(String[] args) {
		
		// 주민번호가 같으면 동일한 사람이다.
		Person person1 = new Person("111", "홍길동");
		Person person2 = new Person("111", "홍길둥");
		String opString = "123";
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		//3) Object.toString()
		// days18.Person@be11
		// 패키지명. toString@해시코드의 16진수 값
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println(person1.rrn.hashCode());
		System.out.println(person2.rrn.hashCode());
		// Object -> equals 오버라이딩
		System.out.println(person1.rrn.equals(person2.rrn));
		System.out.println(person1.equals(person2));
	} //main
}

class Person implements Cloneable{
	String rrn ; 
	String name;
	
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	} // 
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rrn.hashCode();
	}

	//(person1.equals(person2) 업캐스팅, 매개변수 다형성
	
	@Override																		// 애노태이션 설명
	public boolean equals(Object obj) {									// 오버라이딩 의미
		if(obj != null && obj instanceof Person) {						// if문 설명 and연선자 왜 들어갔는지
			Person p =(Person)obj; // 다운캐스팅							
			this.rrn.equals(p.rrn);
		}//if
		return false;																// false문이 왜 들어갔는지
	} //equals
	
	@Override
	public String toString() {
//		return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn= %s, name= %s]",rrn,name);
	}
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	
	
	// 오버라이딩 조건(주의사항)
	// JDK1.5부터 새로운 문법 -> 공볍 반환 타입 추가(convariant return type)추가 
	// 오버라이딩 할때 조상 메서드의 반환타입을 자식 클래스 타입으로 변경 가능
	@Override
	protected Person clone(){
		
		Person p= null;
		try {
			p= (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p; 
	}


} //Person



