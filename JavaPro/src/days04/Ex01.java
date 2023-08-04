package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, math, total;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("이름, 국어, 영어, 수학 점수>");
		String inPutData = br.readLine();
//		String regex = "\\s*,\\s*";//정규표현식 > 공백 유무 상관없이 된다
		String regex = "[, ]";
		String split [] = inPutData.split(regex);

		name = split[0];
		kor = Integer.parseInt(split[1].trim());
		eng = Integer.parseInt(split[2].trim());
		math = Integer.parseInt(split[3].trim());

		total = kor+eng+math;
		avg = (double) total/3;

		System.out.printf("이름 = \"%s\", 국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.2f",
				name, kor, eng, math, total, avg);

	}
	
	public static void Pracitce() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputData = br.readLine();
		String regex = "\\s, \\s";
		String split[] =inputData.split(regex); 
	}
	
}
