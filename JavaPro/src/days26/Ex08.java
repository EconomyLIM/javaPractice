package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.util.FileUtil;

public class Ex08 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		File file = new File(dir);
		String keyWord = "fileName";
		searchKeyWord(file,keyWord);
		
	}

	private static void searchKeyWord(File f, String keyWord) {
		File [] list = f.listFiles();
		String fileName = "";
		String line = null;
		int lineNumber = 1;
		File file = null;
		
		for (int i = 0; i < list.length; i++) {
			lineNumber = 1;
			file = list[i];
			if (list[i].isDirectory()) {
				searchKeyWord(list[i], keyWord);
			}
			fileName = file.getName();
			if ( file.isFile() &&FileUtil.getExtension(fileName).equals(".java")) {
				sb.setLength(0);
				try(BufferedReader br = new BufferedReader(new FileReader(file))) {
					
					while ( (line = br.readLine())!= null ) {
						if (line.contains(keyWord)) {
							sb.append(String.format("%d : %s\r\n", lineNumber++, line ));
						}
					}
					
					if (sb.length() >0) {
						System.out.printf("=====%s.%s=====\n",file.getParentFile().getName(), fileName);
						System.out.println(sb.toString());
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} //for
	}
}
