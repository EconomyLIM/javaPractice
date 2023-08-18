package days26;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex02 {
	public static void main(String[] args)  {
		
		
		String name = "김호영";
		int kor = 97, eng = 100, mat = 100;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//한학생 저보를 student.txt.파일에 저장
		//FileWrtier 문자 파일 스트림
		// BufferedWriter 보조스트림
		
		String fileName = ".\\src\\days26\\student.dat"; //data
		try( 	FileOutputStream out = new FileOutputStream(fileName, true);
				DataOutputStream dos= new DataOutputStream(out);		) {
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(mat);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
