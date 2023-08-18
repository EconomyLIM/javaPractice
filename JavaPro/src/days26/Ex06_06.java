package days26;

import java.io.File;
import java.util.Scanner;

public class Ex06_06 {
	public static void main(String[] args) {
		String pathName = ".\\src\\days26\\temp";
		File dir = new File(pathName);
		
		if (dir.exists()) {
			//then the directory must be empty inorder to be deleted. > 비워져있어야한다.
			
			deleteFolders(dir);
		}
		
	}
	
	 private static void deleteFolders(File dir) {
	      
	      File[] childList = dir.listFiles();
	      if (childList != null) {
	         for (int i = 0; i < childList.length; i++) {
	            File child = childList[i];
	            deleteFolders(child);         
	            System.out.printf("> %s 를 삭제했습니다.\n", child);
	         }
	      }
	      dir.delete();         
	   }
	 
	 private static void deleteAll(File file) {
	      File[] files = file.listFiles();
	      for (int i = 0; i < files.length; i++) {
	         if(files[i].isDirectory()) {
	            deleteAll(files[i]);         
	         }
	         files[i].delete();
	      } // for
	   }
	 
	 private static void directoryDelete (File f) {
		 //f가 삭제되지 않았을 경우 while 반복
		 while ( !f.delete() ) {
			File [] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if (list[i].delete()) {
					System.out.printf("%s 삭제완료", list[i]);
				} else {
					directoryDelete(list[i]);
				}
			} //for
		}
	 }
}
