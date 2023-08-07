package days18;

public class Ex09_03 {
	public static void main(String[] args) {
//		testString();			//>string 처리시간 : 3720614900ns 
		testStringBuffer(); 	//>string 처리시간 :      5968100ns 

	}//main

	private static void testString() {
		long start =  System.nanoTime();

		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s+="a";
		} //for

		long end =  System.nanoTime();

		System.out.printf(">string 처리시간 : %dns \n",(end - start));
	} //testString

	private static void testStringBuffer() {
		long start =  System.nanoTime();

		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		} //for

		long end =  System.nanoTime();

		System.out.printf(">string 처리시간 : %dns \n",(end - start));
	} // testStringBuffer
}
