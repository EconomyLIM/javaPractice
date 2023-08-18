package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ex05_02 {
	public static void main(String[] args) throws IOException {
		int [] score =  {
			1, 100,90,90,
			2, 70,60,90,
			3, 100,100,90,
			4, 70,90,80,
			5, 70,90,40,
		};
		//성적정보를 RandomAccess로 읽기 쓰기
		String fileName = ".\\\\src\\\\days26\\\\score.dat";
		String mode = "rw";
		
		try (RandomAccessFile raf = new RandomAccessFile(fileName, mode);){
			for (int i = 0; i < score.length; i++) {
				long fp = raf.getFilePointer();
				System.out.printf("현재 파일 포인터: = %d - [%d]\n",fp, score[i]);
				raf.writeInt(score[i]);
			} //for
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //try catch
		
		System.out.println( "엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		int no, kor, eng, mat;
		int tot;
		double avg;
		try (RandomAccessFile raf = new RandomAccessFile(fileName, mode);){
			//현재 fp: 0
//			no = raf.readInt();
//			kor = raf.readInt();
//			eng = raf.readInt();
//			mat = raf.readInt();
			
			int 학생수 = score.length/4;
			for (int i = 0; i < 학생수; i++) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng+ mat;
				avg = (double) tot/3;
				System.out.printf("번호: %d %d %d %d %d %.2f\n", no,kor,eng,mat,tot,avg);
			} //for
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //try catch
		
		System.out.println( "엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(fileName, mode);){
			
				Scanner scanner = new Scanner(System.in);
				System.out.printf("몇번 학생의 국(1) 영(2) 수(3)를 수정할건지 입력하세요");
				int student = scanner.nextInt();
				int obj = scanner.nextInt();
				long pos = ((student-1)*4 + obj)*4;
				raf.seek(pos);
				System.out.printf("점수 수정: ");
				int score2 = scanner.nextInt();
				raf.writeInt(score2);
			
				pos = ((student-1)*4)*4;
				raf.seek(pos);
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng+ mat;
				avg = (double) tot/3;
				System.out.printf("번호: %d %d %d %d %d %.2f\n", no,kor,eng,mat,tot,avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //try catch
		
		try (RandomAccessFile raf = new RandomAccessFile(fileName, mode);){

			int 학생수 = score.length/4;
			for (int i = 0; i < 학생수; i++) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng+ mat;
				avg = (double) tot/3;
				System.out.printf("번호: %d %d %d %d %d %.2f\n", no,kor,eng,mat,tot,avg);
			} //for
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //try catch
		
		System.out.println("end");
		
	}
}
