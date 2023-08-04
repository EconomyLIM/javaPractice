package days03;

public class Ex04 {
	public static void main(String[] args) {
		int n = 10;
		String s = Integer.toBinaryString(n);
		Byte value = 30;
		String test3 = Integer.toBinaryString(value);
		
		
		
//		System.out.printf("%s \n", Integer.toString(n,2));
//		System.out.printf("%s \n", Integer.toBinaryString(n));
//		String.format("%8d", Integer.parseInt(value));
		System.out.printf("%08d", Integer.parseInt(s));
		//전공자 00000000 00000000 00000000 00001010
	}

}
