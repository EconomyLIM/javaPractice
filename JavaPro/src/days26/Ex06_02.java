package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_02 {
	public static void main(String[] args) {
		/* javaPro 모든 하위 폴더, 파일 목록 정보 조회
		 * 
		 */
		
		String currentDirecttory = System.getProperty("user.dir");
		File parent = new File(currentDirecttory);
//		System.out.println(parent.isDirectory()); //true
		String [] list = parent.list(); // 문자열 배열 반환
		
		
		/*
		for (int i = 0; i < list.length; i++) {
			File  f = new File(parent,list[i]);
			System.out.printf("%s [%s] - %d\n", f.isDirectory()? "폴더" : "파일", f.getName(),f.length());
		} //for
		*/
		String pattern = "yyyy-MM-dd a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		File [] flist = parent.listFiles(); // 파일 배열 반환
		for (int i = 0; i < flist.length; i++) {
			Date date = new Date(flist[i].lastModified());
			String modTime = sdf.format(date);
			System.out.printf("%s\t[\t%s\t]\t\t%dbyte\t\t수정날짜: %s \n", flist[i].isDirectory()? "폴더" : "파일", flist[i].getName(),flist[i].length(), modTime);
		} //for
	}
}
