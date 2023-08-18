package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex01 {
	/* DataInputStream DataOuputStream
	 * 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
	 */
	public static void main(String[] args)  {
		
	
		String name = "김호영";
		int kor = 97, eng = 100, mat = 100;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//한학생 저보를 student.txt.파일에 저장
		//FileWrtier 문자 파일 스트림
		// BufferedWriter 보조스트림
		
		String fileName = ".\\src\\days26\\student.txt";
		try(FileWriter out = new FileWriter(fileName,true);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			String data =  String.format("%s, %d, %d, %d, %d, %.2f, %b \n", name,kor,eng,mat,tot,avg,gender);
			
			bw.append(data);
			bw.flush();
			
			System.out.println(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
