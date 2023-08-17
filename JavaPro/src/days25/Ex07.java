package days25;

import java.io.File;
import java.io.FileReader;

public class Ex07 {
	
	public static void main(String[] args) {
		
		/* File클래스 : 파일, 폳더를 다루는 클래스 
		 * 
		 */
		/*
		String parent = ".\\src\\days25";
		String child = "Ex01.java";
		File f = new File(parent, child);
		*/

		String fileName = ".\\src\\days25\\Ex01.java";
		File f = new File(fileName);
		System.out.println(f.isDirectory()); // false
		System.out.println(f.isFile()); // true
		
		System.out.println(f.length()); // 단위는 byte
		int fileLength = (int)f.length();
		System.out.println(fileLength);
		
		try(FileReader fr = new FileReader(f)) {
			int code;
			
			//라인단위로 처리하는 보조스트림사용하면 라인번호 앞에 붙일때 더 코딩이 편해질거다.
			while ((code = fr.read()) != -1) {
				System.out.printf("%c",(char)code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
