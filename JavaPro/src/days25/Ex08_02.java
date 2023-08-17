package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex08_02 {
	public static void main(String[] args) throws IOException {
		
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "public class Ex03 {\r\n"
				+ "	//						  0			1			2			3 순서\r\n"
				+ "//	enum Direction{EAST, SOUTH, WEST,NORH}\r\n"
				+ "//	enum Direction{EAST=100, SOUTH, WEST,NORH} // 문법에러\r\n"
				+ "	enum Direction{\r\n"
				+ "		EAST(100,\"▶\"), SOUTH(200,\"◀\"), WEST(300,\"▼\"),NORH(400,\"▲\");\r\n"
				+ "\r\n"
				+ "		private final int  value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		/*\r\n"
				+ "		Direction(int value) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			}\r\n"
				+ "		*/\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "			}\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "		// 추상메서드도 가능하다.\r\n"
				+ "	}\r\n"
				+ "// 왜생성자 필요?\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		//[열거형에 멤버 추가]\r\n"
				+ "		// 열거형 구조 이해\r\n"
				+ "		/* 1. enum Direction{EAST, SOUTH, WEST,NORH}\r\n"
				+ "		 * 2. 컴파일러가 클래스 변환\r\n"
				+ "		 * 		class Direction extends Enum { \r\n"
				+ "		 * 		static final Direction EAST = new Driection(\"EAST\");\r\n"
				+ "		 * 		static final Direction EAST = new Driection(\"SOUTH\");\r\n"
				+ "		 * 		static final Direction EAST = new Driection(\"WEST\");\r\n"
				+ "		 * 		static final Direction EAST = new Driection(\"NORTH\");\r\n"
				+ "		 * \r\n"
				+ "		 * 		private String name;\r\n"
				+ "		 * 		private Direction (String name){\r\n"
				+ "		 * 		this.name = name;\r\n"
				+ "		 * 		}\r\n"
				+ "		 * 	}\r\n"
				+ "		 *  열거형 orinal()은 메서드에 의해서 열거형 상수를 사용하는데\r\n"
				+ "		 *  내가 원하는 정수값을 설정해서 사용할 수 있다.\r\n"
				+ "		 * \r\n"
				+ "		 */\r\n"
				+ "		\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(dir.value);\r\n"
				+ "			System.out.println(dir.ordinal());\r\n"
				+ "			System.out.println(dir.getSymbol());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"\");\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "";
		/*
		StringReader sr = new StringReader(source);
		BufferedReader br= new BufferedReader(sr);
		ArrayList<String> list = new ArrayList<String>();
		String line = null;
		int cnt =1;
//			br.skip(15); // 문자를 15개 스킵
			while (cnt++ <16) {
				line = br.readLine();	
				list.add(line);
			}
		System.out.println( line);
		*/
		String lineString21= Stream.of(source.split("\r\n")).skip(14).findFirst().get();
		System.out.println(lineString21);
	}
}
