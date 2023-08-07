package days18;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex08_05 {
	public static void main(String[] args) {
		
		String userDir =  System.getProperty("user.dir");
//		System.out.println(userDir);
		String path = userDir.concat("\\src\\days18\\SS19.txt");
//		System.out.println(path);
		/*
		try(FileReader fr = new FileReader(path);) {
			int code;
			while ( (code = fr.read() )!= -1) {
				System.out.printf("%c", code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		String [] nameArr = new String[20];
		int index =0;
		try(FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {
			
			String name;
			while ( (name = br.readLine()) != null ) {
				nameArr[index++] = name;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} //catch
		//String.join함수 자주쓴다.
		String nametag ="<ol><li>".concat(String.join("</li><li>", nameArr)).concat("</li></ol>");  
		System.out.println(nametag);
		
	} //main
}
