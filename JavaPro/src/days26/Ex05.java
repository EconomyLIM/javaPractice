package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		/* PipedReader, writer
		 * 스레드간에 데이터를 입출력할때 쓰는 스트림
		 * RandomAccess File
		 * 	랜덤하게	접근	+ 파일 스트림
		 * 		이거 하나의 클래스로 읽기 쓰기 가능
		 * 파일의 어느 위치에나 읽기 쓰기가 가능한 장점이 있는 스트림
		 * DataOutput , DataInput 둘다 있음
		 *  seek(위치) 		getFilePointer() 파일 포인트 		readXXX			writeXXX
		 */
		String s = "I Love normal Java";
		String q = "javaBook";
		String name= ".\\src\\days26\\random.txt";
		String mode="rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			long cp = raf.getFilePointer();
			raf.writeBytes(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println( "엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			//임의의 위치로 이동 -  읽기 쓰기
			raf.seek(7);
			raf.writeBytes(q);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println( "엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			//임의의 위치로 이동 -  읽기 쓰기
			raf.seek(2);
			raf.writeBytes(q);
			String line = raf.readLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("end");
	}
}
