package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		//자바 입출력 IO
		/* 1. IO = Input Output = 입출력
		 *  [컴퓨터 프로그램]		-->	[외부장치 프로그램]
		 *  [컴퓨터 프로그램]		--<	[외부장치 프로그램]
		 *  프로그램 간에 데이터를 주고 받는 것 : 입출력
		 *  2. 두 장치를 연결해주는 객체가 필요하다. 그 객체가 스트림(Stream)
		 *  3. 스트림 : 데이터를 운반하는 통로
		 *  		1) 흐르는물
		 *  		2) 단방향
		 *  			ㄱ. 읽기(입력용) 스트림
		 *  			ㄴ. 쓰기(출력용) 스트림
		 *  4. 연속적인 데이터의 흐름
		 *  5. 자바에서 모든 입출력은 스트림이라는 개념으로 이루어진다.
		 *  
		 *  8.자바의 스트림2가지로 구분
		 *  	1) 문자(텍스트) 스트림 : 최상위 부모 클래스 Reader(입력용), Writer(출력용)
		 *  
		 *  		1 문자 == 유니코드 2바이트 ==char
		 *  		한문자 문자열 배열 
		 *  		FileReader 문자 단위로 처리하는 입력용 스트림
		 *  		FileWriter 문자 단위로 처리하는 출력용 스트림
		 *  
		 *  		BufferedReader 문자 단위로 처리하는 입력용 스트림(라인 단위 처리)
		 *  		BufferedWriter  문자 단위로 처리하는 출력용 스트림(라인 단위 처리)
		 *  
		 *  
		 *  	2) 바이트(이진) 스트림 : : 최상위 부모 클래스 InputStream(입력용), OutputStream(출력용)
		 *  
		 *  		1바이트(8비트)
		 *  		바이트, 바이트배열, 정수(int) 
		 *  9. 보조 스트림 - 어떤 입출력 스트림의 IO을 더 쉽도록 보조 역할을 하는 스트림 예)BufferedReader, BufferedWriter	
		 */

		InputStream in = System.in; //바이트 스트림
		int nextByte = System.in.read();
		
	}
}
