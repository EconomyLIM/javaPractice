package days17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {

	//파일 읽어서 출력+try catch
	public static void main(String[] args) {

		//------------------------------------지역변수

		String fileName = "C:\\Setup.log";
		FileReader fr = null;

		//------------------------------------

		try {
			fr = new FileReader(fileName);
			int one;
			while ((one = fr.read()) != -1) {
				System.out.printf("%c",(char)one);
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
				} catch (IOException e) {
					e.printStackTrace();
				} //try-catch 
			} //if
		} //finally
	} //main

}
