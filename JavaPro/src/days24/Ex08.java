package days24;

public class Ex08 {
	public static void main(String[] args) {
		// 제네릭 클래스
		/*
		Box box1 = new Box();
//		box1.setItem("홍길동");
		box1.setItem(100);
		System.out.println(box1.getItem());
		*/
		// 		String 대입된 타입
		Box <String> box1 = new Box<>();
		box1.setItem("홍길동");
		System.out.println(box1.getItem());
		// 자동호환
		Box box2 = new Box();
		box1.item ="XXXX";
	}
}

// 다양한 타입을 사용하기 위해 -> 컴파일 시에 타입을 결정하는 기능 : 제네릭
// 제네릭 클래스 선언
//<T> T,K,V 아무문자나 줘도 된다.
// 제네릭 용어
/* 1) Box(클래스명) - 원시 타입( raw Type)
 * 2) T - 타입 변수 또는 타입 매개변수
 * 3) Box<T> - 제네릭 클래스, 'T[의] Box'
 * 
 */
class Box<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}

/*
class Box{
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
*/
/*
class Box{
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
}
*/
/*
class Box{
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
}
*/
/*
class Box{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
*/
