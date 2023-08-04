package days07;

public class Ex11 {
	//days07
	public static void main(String[] args) {
		int a[] = {10,20};
		System.out.printf("> x=%d, y =%d\n", a[0], a[1]);
		
		swap(a);
		
		System.out.printf("> x=%d, y =%d\n", a[0], a[1]);

	} // main
	public static void swap(int[] a) {
		
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
	} //swap
	
} // class
