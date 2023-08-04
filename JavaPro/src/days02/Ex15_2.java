package days02;

public class Ex15_2 {
	
	public static void main(String[] args) {
		
		// int -> String 형변환
		int i = 10;
		
		// 문자열 변환 1
		String si2 = i + " ";
	
		// 문자열 변환 2
		String si = String.valueOf(i);
		
		// 문자열 변환 3
		String sn = Integer.toString(i);
		
		System.out.println(Integer.toBinaryString(i)); // 2진수 변환
		System.out.println(Integer.toString(i,2)); // 2진수 변환
		
		System.out.println(Integer.toOctalString(i)); //8진수 변환
		System.out.println(Integer.toString(i,8)); // 8진수 변환

		System.out.println(Integer.toHexString(i)); //16진수 변환
		System.out.println(Integer.toString(i,16)); // 16진수 변환
				
		System.out.println(si);
	}

}
