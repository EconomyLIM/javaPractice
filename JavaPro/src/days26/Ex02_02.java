package days26;

import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex02_02 {
	public static void main(String[] args)  {
		
		
		String name ;
		int kor = 0 , eng = 0 , mat = 0 ;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//한학생 저보를 student.txt.파일에 저장
		//FileWrtier 문자 파일 스트림
		// BufferedWriter 보조스트림
		
		String fileName = ".\\src\\days26\\student.dat"; //data
		try(FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in)) {
			
			name = dis.readUTF();
			kor= dis.readInt();
			eng= dis.readInt();
			mat= dis.readInt();
			tot= dis.readInt();
			avg= dis.readDouble();
			gender= dis.readBoolean();
			
			System.out.printf("%s, %d, %d, %d, %d, %.2f, %b \n", name,kor,eng,mat,tot,avg,gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
