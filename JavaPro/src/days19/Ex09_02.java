package days19;

import java.io.FileReader;

public class Ex09_02 {
	public static void main(String[] args) {


		String path = ".\\src\\days19\\Ex01.java"; //"."현재 디렉토리라는 뜻
		int counts [] [] = new int [2][26];
		
		try(FileReader fr = new FileReader(path)) {

			int code;
			char one;


			while ( (code = fr.read()) != -1 ) {

				one = (char)code;
				
				if ( Character.isUpperCase(one) ) counts[0][one- 'A']++; 
				else if ( Character.isLowerCase(one) ) counts[1][one- 'a']++; 
				else continue;
			} //while

			// 막대 그래프 System.out.printf("%c(%d) : %s \n",i+'A', counts[i], "#".repeat(counts[i]));
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자 \n", i ==0 ? '대' : '소');
				for (int j = 0; j < counts[0].length; j++) {
					System.out.printf("%c(%d) : %s \n",i+'A', i ==0 ? j+'A': j+'a', counts[i][j], "#".repeat(counts[i][j]));	
				} //for
			} //for
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	} //main
}
