package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex06_04 {
	public static void main(String[] args) {

		// days26폴더안에 있는 모든 파일을 검색해서 "fileName" 문자열 검색
		String pathName = ".\\src\\days26";
		String keyWord = "fileName";

		File parent = new File(pathName);
		File [] list = parent.listFiles();
		File f = null;
		int lineNumber = 1;
		String line = null;
		for (int i = 0; i < list.length; i++) {
			f = list[i];
			lineNumber = 1;
			String fileName = f.getName();
			System.out.printf("==============%s=============\n", fileName);
			try(FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr)) {

				while ( (line = br.readLine())!= null ) {
					
					if (line.contains(keyWord)) {
						
						line = line.replaceAll(keyWord, "**"+keyWord+"**");
						System.out.printf("%d : %s\n", lineNumber, line);
					} //if
					
					lineNumber++;
				} //while


			} catch (Exception e) {
				e.printStackTrace();
			} //try catch
		} //for

	}
}
