package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex01_02 {
	/* DataInputStream DataOuputStream
	 * 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
	 */
	public static void main(String[] args)  {
		
	
		String name = "임경재";
		int kor = 97, eng = 100, mat = 100;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		int m [] = {1,2,3,4,5,6};
		Integer n [] = Arrays.stream(m).boxed().toArray(Integer [] :: new);
		String fileName = ".\\src\\days26\\student.txt";
		try(FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);) {
		
			String line = br.readLine();
			String pattern = "{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object datas [] = mf.parse(line);
			String [] s = Arrays.asList(datas).toArray(String [] :: new);
			System.out.println(Arrays.toString(s));
			/*
			name = (String)datas[0];
			kor = Integer.parseInt((String) datas[1]);
			eng = Integer.parseInt(datas[2].toString()); // 예외발생
			mat = Integer.parseInt(String.valueOf(datas[3])); // null 반환
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
