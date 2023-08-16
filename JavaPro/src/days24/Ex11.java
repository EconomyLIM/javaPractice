package days24;

import java.util.ArrayList;

public class Ex11 {
	public static void main(String[] args) {
		// 제한된 제네릭 클래스
		// T - 모든 타입이 아니라 과일 타입 제한해서 재네릭 클래스
		
		FruitBox <Apple> box1 = new FruitBox<Apple>();
		// 과일만 담겠다
		//Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
//		FruitBox <Toy> box2 = new FruitBox<Toy>();
	}
}
/*
interface Eatable{
	
}
class Fruit implements Eatable{
	public String toString() {return "Fruits";}
}

class Apple extends Fruit{
	public String toString() {return "Apple";}
}

class Grape extends Fruit{
	public String toString() {return "Grape";}
}

class Toy{
	public String toString() {return "Toy";}
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
class Box04<T>{ 
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
//과일만을 담을 수 있는 제네릭 클래스 제한해서 선언
//class FruitBox<T extends Fruit> extends Box04{
	class FruitBox<T extends Fruit & Eatable> extends Box04{
	// Fruit 클래스의 자식클래스이고 Eatable인터페이스도 구현 (&기호연결)
}
*/