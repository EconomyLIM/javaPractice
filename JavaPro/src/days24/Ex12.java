package days24;

import java.util.ArrayList;

public class Ex12 {
	public static void main(String[] args) {
		// [와일드 카드]
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();

		//Juice juice = Juicer.makeJuice(fruitBox);
		
		// makeJuice메세더를 제네릭 메서드로 선언(수정)
		// 호출방법 다르다
//		Juice juice = Juicer.<Apple>makeJuice(appleBox);
		Juice juice = Juicer.makeJuice(appleBox); //<Apple> 생략 가능
		
		// 제네릭 메서드
		// 제네릭 쓸 수 있는곳 클래스, 메서드
		// - 메서드의 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라고 한다.
		// - 형식 public static <T> Juice makeJuice(FruitBox<T> box){
		//	
		//}
	}
}


class Fruit {
	public String toString() {return "Fruits";}
}

class Apple extends Fruit{
	public String toString() {return "Apple";}
}

class Grape extends Fruit{
	public String toString() {return "Grape";}
}



// 상자 Box04제네릭 클래스 선언

class Box03<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		this.list.add(item);
	}
	int size(T item) {
		return this.list.size();
	}
	T get(int i) {
		return this.list.get(i);
	}
	public String toString() {return this.list.toString();}
}
class Box05<T>{ 
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		this.list.add(item);
	}
	int size(T item) {
		return this.list.size();
	}
	T get(int i) {
		return this.list.get(i);
	}
	public String toString() {return this.list.toString();}
}
class FruitBox<T extends Fruit > extends Box05<T>{

}
// 클래서 선언, 제네릭클래스 x
// 매개변수를 과일박스를 주면
// 쥬스를 만들어서 반환하는 기능이 있는 쥬스 클래스 
class Juice{}

class Juicer{
	//											? = 와일드 카드 > Fruit에서 상속받은 것만 가능하다.
	//FruitBox<? super Fruit> box : Fruit 부모들만 가능하다.
	// FruitBox<?> box : 모든 타입 가능
	// 메서드 오버로딩 조건 
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		return new Juice();
	}
	*/
	// 위의 일반 메서드를 제네렉 메서드로 변경
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		return new Juice();
	}
	
}





