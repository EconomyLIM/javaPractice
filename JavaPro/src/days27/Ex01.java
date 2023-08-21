package days27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {
	public static void main(String[] args) {


		Child c = new Child();
		c.name = "홍길동";
		c.age = 21;


		String pathName = ".\\src\\days27\\Child.ser";

		try(FileOutputStream fos = new FileOutputStream(pathName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			//java.io.NotSerializableException: 직렬화할 수 없는 예외
			oos.writeObject(c);

			oos.flush();

			System.out.println("c객체를 직렬화 시켜서 스트림 oos 파일로 저장완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//[2] 자식클래스 직렬화 - ?
class Parent {
	String name; //-> 부모의 멤버는 직렬화 대상에서 제외 되었다.
}

class Child extends Parent implements Serializable{

	private static final long serialVersionUID = 1L;
	int age;
	/** 개발자가 직접 부모의 멤버를 직렬화 대상에 추가되도록 구현한다.
	 * 
	 */

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(name);// 개발자가ㅏ 직접 직렬화 대상에 부모멤버를 포함
		oos.defaultWriteObject();
		
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		name = ois.readUTF();
		ois.defaultReadObject();
	}
}

//1. 부모를 직렬화할 수 있는 implemetns Serializable클래스로 선언
// 2. 자식클래스는 자동으로 직렬화 가능한 클래스가 되더라
/*
class Parent implements Serializable{
	String name;
}

class Child extends Parent{
	int age;
}*/