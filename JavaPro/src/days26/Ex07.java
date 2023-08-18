package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex07 {
	/* 직렬화: 객체를 스트림으로 만드는것
	 * 역직렬화: 스트림을 객체로 만드는 것
	 * 객체를 직렬화해서 읽기/쓰기 할 수 있는 바이트 스트림
	 * Object [InputStream]
	 * Object [OutputStream]
	 * 직렬화가 가능한 클래스로 만들귀 위해서 단지
	 * ㄴSerializable 인터페이스를 구현만 하면 된다.
	 */
	public static void main(String[] args) {
		//Student 클래스 -> 객체 - > 파일저장
		
		UserInfo u1 = new UserInfo("김호중", "1234", 25);
		UserInfo u2 = new UserInfo("이지현", "4321", 23);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		String pathName = ".\\src\\days26\\UserInfo.ser";
		
		try(FileOutputStream fos = new FileOutputStream(pathName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			//java.io.NotSerializableException: 직렬화할 수 없는 예외
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			
			System.out.println("u1, u2, list 객체를 직렬화 시켜서 스트림 oos 파일로 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //main
} //class Ex07

//The serializable class UserInfo does not declare a static final serialVersionUID field of type long
class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 3309514712716172016L; // 고유번호
	
	String name;
	transient String password;
	int age;
	
	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
