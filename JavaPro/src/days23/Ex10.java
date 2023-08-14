package days23;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class Ex10 {
	public static void main(String[] args) {
		//		[Properties 컬렉션 클래스]
		/*== HashTable 컬렉션클래스
		 *  Map
		 *  HashTable<String, String> == Properties
		 *  key,value : String
		 *  환경설정 값들을 Properties 컬렉션 클래스 사용해서 쓰기/ 읽기 저장
		 */
		//오라클 + java 연동
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";          
		
		// map에는 put(key,value)
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		System.out.println(p.getProperty("className"));
		
		//????.properties 확장자 저장.
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jcbc.configuration";
		try(FileWriter fw = new FileWriter(fileName)) {
			p.store(fw, comments);
			System.out.println("Save End");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
