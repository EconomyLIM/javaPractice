package days08;

public class Ex08 {
	public static void main(String[] args) {
//		double result = pow(2,3);
		double result = recursivePow(2,-3);
		System.out.println(result);
	} // main
	
	// 거듭제곱 재귀함수
	private static double recursivePow(int n, int m) {
//		double result = 1;
//		int exp = m;
//		exp = Math.abs(m);
//		
//		for (int i = 1; i <= exp; i++) {
//			result = n *recursivePow(n,exp-1);
//		}
//		
//		if(m<0) {return (double) 1/result;}
//		else {return result;}
		
		if(m > 1) return n*recursivePow(n, m-1);
		else if (m == 1)return n;
		else if (m == 0)return 1;
		else return 1/ recursivePow(n, -1* m);
	}
	 //pow

	private static double pow(int n, int m) {
		double result = 1;
		int exp = m;
		//	if (m<0) exp =-1*m; // 양수변환
		exp = Math.abs(m);

		for (int i = 1; i <= exp; i++) {
			result *=n;
		}
		if(m<0) return (double) 1/result;
		else return result;

	} //pow
}
