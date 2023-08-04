package days02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 형변환
// int i = Integer.parseInt;
// short i = Short.parseShort;
// byte = Byte.parseByte;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		String s ;
		byte age = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		System.out.printf("나이 입력 > ");
//		age = Byte.parseByte(br.readLine());
		System.out.printf("이름 입력 >");
		s = br.readLine();
//		System.out.println(age);
//		System.out.println(s);
//		bw.write(age);
//		bw.flush();
//		bw.close();
		
		StringTokenizer st = new StringTokenizer(s);
		bw.write(s);
		bw.flush();
		bw.close();
	}
}
