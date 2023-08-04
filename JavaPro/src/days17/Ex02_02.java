package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_02 {

	//파일 읽어서 출력+try catch
	//한문자 씩 읽지 말고 한라인씩 읽고 싶다.
	public static void main(String[] args) {

		//------------------------------------지역변수

		String fileName = "C:\\Setup.log";
		FileReader fr = null;
		BufferedReader br = null;
		
		//------------------------------------

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr); // 업캐스팅 다형성
			String line = null;
			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
				System.out.printf("%d: " +line + "\n", lineNumber++);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				} //try-catch 
			} //if
		} //finally
	} //main

}
