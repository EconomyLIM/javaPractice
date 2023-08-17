package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex06 {
	public static void main(String[] args) {
		
		//ProPerties 컬렉션 클래스 
		// HashTable<String,String>+ load()/store();
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger"; 
		
		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		String fileName = ".\\src\\com\\util\\jdbcproperties.xml";
		String comments = "jcbc.configuration";
		try(FileOutputStream os = new FileOutputStream(fileName)) {
//			p.store(fw, comments);
			p.storeToXML(os, comments);
			System.out.println("Save End");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}
