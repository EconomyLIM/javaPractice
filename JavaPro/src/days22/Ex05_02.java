package days22;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex05_02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Personz("박정호", 23));
		list.add(new Personz("김성준", 21));
		list.add(new Personz("주강민", 39));
		list.add(new Personz("이경서", 41));
		list.add(new Personz("신기범", 11));
		
		System.out.println(list+"\n");
		
		list.sort(null);
		list.sort((Comparator) new Comparator<Personz>() {

			@Override
			public int compare(Personz o1, Personz o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
	}
}
class Personz{
	String name;
	int age;

	public Personz() {
		super();
	}
	public Personz(String name, int age) {
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
	
}