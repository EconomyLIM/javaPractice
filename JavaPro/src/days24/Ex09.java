package days24;

public class Ex09 {
	public static void main(String[] args) {
		// [제네릭스의 제한]

	} //main
}

class Box02<T>{
	// Cannot make a static reference to the non-static type T
	// 제네릭클래스에서는 정적필드를 선언할 수 없다.
	//	static T item2; //static 필드
	T item2;

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}
	//Cannot make a static reference to the non-static type T
	// 2) static 메서드의 매개변수로 T 타입 사용할 수 없다.
	/*
	static int compare(T t1, T t2) {
		return 0;
	}
	*/
	// 3) T타입의 배열은 선언할 수 있다.
	T [] intArr;

}