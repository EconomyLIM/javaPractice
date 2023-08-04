package days04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex05 {
	public static void main(String[] args) {
		int sum = 0 ;
		
		for(int i = 0 ; i <= 10 ; i++) {
			sum+=i;
		}//for
		System.out.println(sum); //  합 출력
		
		Cass12();
	}
	
	public static void Cass12() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			System.out.printf("정수 입력>");
			int num =Integer.parseInt( br.readLine());
			
			bw.write(String.valueOf(num));
			bw.flush();
			System.out.println();
			
			for(int i = 0  ; i <= num ; i++) {
				for(int j = 0 ; j <= 9 ; j++) {
					System.out.printf("%d X %d = %d , " , i, j , i*j);
				}
				System.out.println();
			}//for
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
