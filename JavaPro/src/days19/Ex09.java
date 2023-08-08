package days19;

import java.io.FileReader;

public class Ex09 {
	public static void main(String[] args) {
		// days19.Ex01.java 파일읽어와서 알파벳 대소문자를 구분하지 않고 배열에 저장 후 ### 막대 그래프 작성.

		// 상대경로라고 한다. -> .현재 디렉토리
		//						-> .. 상위 디렉토리

		String path = ".\\src\\days19\\Ex01.java"; //"."현재 디렉토리라는 뜻
		int counts [] = new int [26];
		// counts[0] = 'A';
		try(FileReader fr = new FileReader(path)) {

			int code;
			char one;


			while ( (code = fr.read()) != -1 ) {

				one = (char)code;
				one = Character.toUpperCase(one);
				
				if ( Character.isUpperCase(one) ) counts[one- 'A']++; // 'A'<=one&& one<='Z' ->Character.isUpperCase(one)이 더 나은 코딩
				else continue;
				
			} //while

			// 막대 그래프 
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%d) : %s \n",i+'A', counts[i], "#".repeat(counts[i]));
			} //for
		} catch (Exception e) {
			e.printStackTrace();
		}


	} //main
}
