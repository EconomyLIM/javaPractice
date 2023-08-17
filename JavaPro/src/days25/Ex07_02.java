package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {
	public static void main(String[] args) {
		//프로그램 실행후 -> 
		/* 1. 저장할 파일명 입력
		 * 2. 저장할 문자열 data 입력
		 * 3. 계속 저장하겠냐 물어봄
		 * 4. 또 저장할 문자열 입력
		 * 
		 */
		// 파일을 저장하는 작업
		String pathName = ".\\src\\days25\\sample.txt";
		File file = new File(pathName);
		file.exists(); //파일 존재 유무
		
		try(FileWriter fw = new FileWriter(file,true)) { //true: 뒤에 계속 붙인다.  | false : 덮어쓴다. 
			fw.append('a');
			fw.write(98);
			fw.write("write String");
			
			//쓰기 + 추가 fr 출력용 스트림에 쓰기+추가...
			fw.flush(); //스트림에 있는 데이터를 비운다.
			fw.close(); //try문에 있기 떄문에 close는 안해도 된다.
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
