package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class Ex08 {
	// 메모리 스트림
	// 주로 다른곳에 입출력하기전에 메모리 상에 데이터를 임시로 저장할 목적을 사용하는 스트림
	/* X Byte  ByteArrayInputStream / ByteArrayOutputStream
	 * X Char CharArrayReader / CharArrayWriter -> 문자 스트림
	 * String : StringReader / StringWriter -> 문자를 다루는 메모리 스트림
	 */
	public static void main(String[] args) throws IOException {
		
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int code;
		while ( (code = bais.read()) != -1) {
			System.out.println(code);
			baos.write(code);
		}
		byte [] outbuf = baos.toByteArray();
		System.out.println(Arrays.toString(outbuf));
		bais.close();
		baos.close();
	}
}
