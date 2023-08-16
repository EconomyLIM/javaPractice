package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex01_02 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		String content = "";
		StringBuilder sb = new StringBuilder();
		String line = null;
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new HashMap<String, ArrayList<MemberVO>>();
		
		
		// FileReader , BufferedReader =보조스트림
		try (FileReader fr= new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)) {
			while ( (line= br.readLine())!= null ) {
				
				
				sb.append(line +"\r\n");
			} //while
			content = sb.toString();
			System.out.println(content);
			/*
			String pattern = "{0}\r\n{1}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			*/
			String pattern = "{0}\r\n{1}(팀장), {2}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			MessageFormat mf = new MessageFormat(pattern);
			Object[] datas =  mf.parse(content);
			System.out.println(datas[0]);
			System.out.println(datas[2]);
			System.out.println(datas[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 
}
