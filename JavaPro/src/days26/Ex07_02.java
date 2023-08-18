package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex07_02 {
	/* 직렬화: 객체를 스트림으로 만드는것
	 * 역직렬화: 스트림을 객체로 만드는 것
	 * 객체를 직렬화해서 읽기/쓰기 할 수 있는 바이트 스트림
	 * Object [InputStream]
	 * Object [OutputStream]
	 * 직렬화가 가능한 클래스로 만들귀 위해서 단지
	 * ㄴSerializable 인터페이스를 구현만 하면 된다.
	 */
	public static void main(String[] args) {
	
		
		String pathName = ".\\src\\days26\\UserInfo.ser";
		
		try(FileInputStream fis = new FileInputStream(pathName);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// ois스트림 ->?UserInfo u1 객체 (역직렬화)
		UserInfo u1 = (UserInfo) ois.readObject();
		UserInfo u2 = (UserInfo) ois.readObject();
		ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //main
} //class Ex07_02

//The serializable class UserInfo does not declare a static final serialVersionUID field of type long
