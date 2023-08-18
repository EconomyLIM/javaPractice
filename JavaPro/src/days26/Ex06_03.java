package days26;

import java.io.File;
import java.io.FilenameFilter;

import com.util.FileUtil;

public class Ex06_03 {
	public static void main(String[] args) {
		//days26 폴더 안에 java파일 골라서 조회
		String pathName = ".\\src\\days26";
		File dir = new File(pathName);
		/*
		//[1]
		File [] list = dir.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
//				if (fileName.endsWith("java")) {
//					System.out.println(fileName);
//				}
				if (FileUtil.getExtension(fileName).equals(".java")) {
					System.out.println(fileName);	
				}

			} //if
		} //for
		 */

		/* [2]
		File [] list = dir.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
//				System.out.println(dir +"***" +name);
				return name.endsWith("java");
			}
		});
		for (File file : list) {
			System.out.println(file.getName());
		}
		 */

		File [] list = dir.listFiles((d, n) -> n.endsWith("java"));
		for (File file : list) {
			System.out.println(file.getName());
		}

	} //main
}
