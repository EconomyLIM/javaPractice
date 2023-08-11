package days22;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex05_03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Person3("박정호", 23));
		list.add(new Person3("김성준", 21));
		list.add(new Person3("주강민", 39));
		list.add(new Person3("이경서", 41));
		list.add(new Person3("신기범", 11));
		
		System.out.println(list+"\n");
		
		list.sort(null);
		list.sort((Comparator) new Comparator<Person3>() {

			@Override
			public int compare(Person3 o1, Person3 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
	}
}
// 비교(이름순 오름차순 정렬기능) 기능이 있는 Person3클래스 선언

class Person3 implements Comparable{
	String name;
	int age;

	public Person3() {
		super();
	}
	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person3 p= (Person3)o;
		
		return this.getName().compareTo(p.getName());
	}
	
}