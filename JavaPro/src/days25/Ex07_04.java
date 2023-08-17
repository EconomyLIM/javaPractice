package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_04 {
	public static void main(String[] args) {
		// 파일 복사
		String pathName = ".\\src\\days25\\Ex01.java";
		String copyPathName = ".\\src\\days25\\Ex01_Copy.java";
		
		fileCopy_textStream02(pathName, copyPathName);
		
	}
	//복사 처리 시간(ns) 12047100
	private static boolean fileCopy_textStream02(String pathName, String copyPathName) { // 버퍼 기능 + 보조 스트림 사용해서 파일 복사
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try (FileReader fr = new FileReader(pathName); 
				FileWriter fw = new FileWriter(copyPathName, true);
				BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE)){
			
				int code;
				String line = null;
				char buf [] = new char[BUFFER_SIZE];
				int readCharLine = 0;
				while ( (readCharLine = br.read()) != -1) {
				} //while
				fw.flush();
				
				System.out.println("파일 복사 완료!!");
				
				long end = System.nanoTime();
				System.out.printf("복사 처리 시간(ns) %d\n", (end-start));
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}
