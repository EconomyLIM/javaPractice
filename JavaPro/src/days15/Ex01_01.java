package days15;

import java.util.Arrays;

public class Ex01_01 {
	public static void main(String[] args) {
		String n = "ipipo";
		String m= "pipio";

		//		n = n.toUpperCase();
		//		m = m.toUpperCase();
		//		
		//		char[] nArr = n.toCharArray();
		//		Arrays.sort(nArr);
		//		System.out.println(nArr);
		//		
		//		char[] mArr = m.toCharArray();
		//		Arrays.sort(mArr);
		//		System.out.println(mArr);
		//		
		//		n = String.valueOf(nArr);
		//		m = String.valueOf(mArr);
		//		
		//		System.out.println(n.equals(m));
		char [] nArr= n.toUpperCase().toCharArray();
		Arrays.sort(nArr);
		n=	String.valueOf(nArr );
		char [] mArr= m.toUpperCase().toCharArray();
		Arrays.sort(mArr);
		m=	String.valueOf(mArr );
		System.out.println(n.equals(m));
		//		System.out.println(One(n, m));

	} // main

	private static boolean One(String n, String m) {
		char [] c = n.toCharArray();
		char [] b= m.toCharArray();
		if (c.length != b.length ) {System.out.println("갯수 같지 않음"); return false;}

		for (int i = 0; i < b.length;) {
			if(Character.toLowerCase(n.charAt(i)) ==Character.toLowerCase(m.charAt(i))) {
				i++;
				return true;
			}//if
			System.out.println("갯수는 같으나 알파벳이 다름");
			return false;
		} //for

		return false;
	} //One

}
