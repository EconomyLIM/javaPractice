package days26;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		//File클래스
		/* 1. 가장 많이 사용되는 입출력의 대상 - 파일(중요)
		 * 2. 파일 + 디렉토리(폴더)
		 */
//		String pathName = ".\\src\\days26\\Ex01.java";
		String pathName  = "C:\\Users\\user\\git\\javaPractice-SSIT\\JavaPro\\src\\days26\\Ex01.java";
		File file = new File(pathName);
		System.out.println(File.pathSeparator); // Os에서 사용하는 경로 구분자 -> ;
		System.out.println(File.separator); // Os에서 사용하는 이름 구분자 -> \
		
		String fileName = file.getName();
		System.out.println(fileName);
		
		// 확장자만 
		// 확장자만 제외한 파일명
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0,pos));
		System.out.println(fileName.substring(pos));
		System.out.println("-".repeat(50));
		System.out.println(file.getPath()); // 파일경로 리턴타입 String
		System.out.println(file.getAbsolutePath()); // 절대파일경로 리턴타입 String
		System.out.println(file.getCanonicalPath()); // 표준파일경로 리턴타입 String
		
		System.out.println(file.getParent()); //부모의 경로를 string으로 반환하는 것
		System.out.println(file.getParentFile());  // 그 폴더를 file이라는 객체로 반환하는 것 
		
		//com.util.FileUtil
		
	}
}
