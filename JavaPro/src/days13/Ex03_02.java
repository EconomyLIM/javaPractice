package days13;

public class Ex03_02 {
	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException: 
//		int [] m = new int [2];
		
		//java.lang.NullPointerException
		int [] m = null;
		m[2] = 100;
		System.out.println(m[2]);
	} //main
}
