package days19;

import java.io.FileReader;

public class Ex09_03 {
	public static void main(String[] args) {


		String path = ".\\src\\days19\\Ex01.java"; //"."현재 디렉토리라는 뜻
		// 가변 배열 선언
		int counts [] [] = new int [3][];
		counts[0] = new int [26];
		counts[1] = new int [26];
		counts[2] = new int [10];
		
		try(FileReader fr = new FileReader(path)) {

			int code;
			char one;


			while ( (code = fr.read()) != -1 ) {

				one = (char)code;
				
				if ( Character.isUpperCase(one) ) counts[0][one- 'A']++; 
				else if ( Character.isLowerCase(one) ) counts[1][one- 'a']++; 
				else if(Character.isDigit(one)) counts[2][one - '0']++;
				else continue;
			} //while

			// 막대 그래프 System.out.printf("%c(%d) : %s \n",i+'A', counts[i], "#".repeat(counts[i]));
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자 \n",  i ==0 ? '대' : i==1? '소' :'숫');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d) : %s \n", i ==0 ? j+'A': i==1? j+'a' : j+'0'
							, counts[i][j]
									, "#".repeat(counts[i][j]));	
				} //for
			} //for
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	} //main
}
