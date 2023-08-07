package days18;

public class Ex08_02 {
	public static void main(String[] args) {
		//암기
		String sep = System.getProperty("file.separator");
		String dir =  System.getProperty("user.dir");
		System.out.println(dir);


		String directory = "C:\\tmep\\daus09";
		String fileName = "Ex01.java";
		String path = directory+ ","+ fileName;
		System.out.println( );
		//		directory.charAt(directory.length()-1) == '\\';
		directory.substring(directory.length()-1).equals("\\");
		if (directory.endsWith(sep)) {
			path = directory +fileName;
		} else {
			path = directory +sep + fileName;
		}
	}
}
