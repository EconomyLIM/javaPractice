package days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		//Arrays 클래스
		// [Object 클래스]
		Ex08 obj = null;
//		Object.isNull(obj) obj 객체가 Null일때 true를 반환하는 메서드 : isnull
//		Object.isNull(obj) obj 객체가 Null이 아닐때 true를 반환하는 메서드 : isnonnull
		/*
		 * if(obj != null) XXX
		 * if( !Object,isNull(obj)) XXX
		 * if( Object.nonNull) XXX
		 */
		/*
		if (obj == null) {
			new ~~~Exception("에외메시지");
		}
		this.name = name;
		*/
		
		//or
//		this.name =  Objects.requireNonNull(name, "에외메시지");
		
		// if( a!==null && a.equals(b)) 
		// if( Objects.equals(a,b) ) {}
		
		// java.util.Random()클래스가 있더라
		Random rndRandom = new Random();
		rndRandom.nextBoolean(); // 랜덤하게 true/false 값 준다.
//		rndRandom.nextInt(bound); // 0<=  정수 <=bound
		
	}
}
