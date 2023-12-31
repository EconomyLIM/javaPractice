package days26;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
	/*
	 * Seqeunce(InputStream)
	 * 순차적인 바이트 입력용 스트림
	 * 하나의 파일용량이 너무커서 여러개의 파일로 분리했다고 가정하면 그 분리된 파일을 읽어와야 할때 사용한다.
	 * 여러개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로 데이터를 처리할 수 있는 바이트 스트림
	 */
	public static void main(String[] args) throws IOException {
		byte [] a = {1,2,3};
		byte [] b = {4,5,6};
		byte [] c = {7,8,9};
		
		ByteArrayInputStream bais1 = new ByteArrayInputStream(a);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(b);
		ByteArrayInputStream bais3 = new ByteArrayInputStream(c);
		
		//bais1~3 바이트 스트림 -> 순차적으로 처리
		/*
		SequenceInputStream sis = new SequenceInputStream(bais1, bais2);
		SequenceInputStream sis2 = new SequenceInputStream(sis, bais3);
		*/
		// [2] 순서 있는 컬렉션 클래스 bais1, 2, 3
		// List : ArrayList  X,  Vector
		Vector<ByteArrayInputStream> list = new Vector<>();
		list.add(bais1);
		list.add(bais2);
		list.add(bais3);
		Enumeration<ByteArrayInputStream> en = list.elements(); 
		SequenceInputStream sis = new SequenceInputStream(en);
		int code;
		while ( (code = sis.read()) != -1) {
			System.out.println(code);
		}
	}
}
