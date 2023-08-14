package days23;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex10_02 {
	public static void main(String[] args) {

		Properties p = new Properties();
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		
		try(FileReader fr= new FileReader(fileName)) {
			p.load(fr);
			System.out.println("Load End");
			
			String className = p.getProperty("className");            
			String url = p.getProperty("url");      
			String user = p.getProperty("user");;                                                                   
			String password = p.getProperty("password"); 
			System.out.println(className +", "+ url +", " + user+", " + password);
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try catch
	} //main
}
