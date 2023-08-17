package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_05 {
	public static void main(String[] args) {
		// 실행파일 복사
		// 바이트 스트림 
		/* FileInputStream
		 * FileOutputStream
		 */
		String pathName = "C:\\Program Files (x86)\\Kakao\\KakaoTalk\\KakaoTalk.exe";
		String copyPathName = "C:\\Users\\user\\Documents\\KakaoTalk.exe";
		
//		fileCopy_byteStream(pathName, copyPathName);
		fileCopy_byteStream02(pathName, copyPathName);
		
	}
	//복사 처리 시간(ns) 12047100
	private static boolean fileCopy_byteStream(String pathName, String copyPathName) { // 버퍼 기능 + 보조 스트림 사용해서 파일 복사
		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(pathName);
				FileOutputStream fos = new FileOutputStream(copyPathName)){
			
				int b;
				while ( (b = fis.read()) !=-1 ) {
					fos.write(b);
				}
			
				System.out.println("파일 복사 완료!!");
				long end = System.nanoTime();
				System.out.printf("복사 처리 시간(ns) %d\n", (end-start));
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	} // fileCopy_byteStream
	private static boolean fileCopy_byteStream02(String pathName, String copyPathName) { // 버퍼 기능 + 보조 스트림 사용해서 파일 복사
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try (FileInputStream fis = new FileInputStream(pathName);
				FileOutputStream fos = new FileOutputStream(copyPathName);
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE)){
			
				byte [] b = new byte[BUFFER_SIZE];
				int readByteNumber = 0;
				while ( (readByteNumber =  bis.read(b)) != -1) {
					bos.write(b, 0 ,readByteNumber);
				} //while
				
				bos.flush();
				
			
				System.out.println("파일 복사 완료!!");
				long end = System.nanoTime();
				System.out.printf("복사 처리 시간(ns) %d\n", (end-start));
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	} // fileCopy_byteStream02
}
