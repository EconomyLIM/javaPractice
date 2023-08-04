package days13;

/**
 * @author kenik
 * @date 2023. 7. 28. - 오전 11:40:33
 * @subject
 * @content
 * 
 */

// 변수 : 값을 저장하는 기억공간의 이름 _ (변하는 수)
// 상수 : 값을 저장하는 기억공간 _ (final)
// 리터럴
// 참조변수 = 주소 값을 저장하는 변수
// 참조타입( 배열, 클래스, 인터페이스)
// int [] m ; 변수 참조변수 배열명
public class Ex01 {

	public static void main(String[] args) {

		int [][] m = new int [5][5];

		fillM(m);
		dispM(m);
	} // main

	private static void dispM(int[][] m) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.printf("[%02d]",m[i][j]);
				} //for j
				System.out.println();
			} //for i
	} // dispM

	private static void fillM(int[][] m) {
		for (int i = 0, n=1; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
				m[i][j] = n++;
				m[i][4] += m[i][j];
				m[4][j] += m[i][j];
				m[4][4] += m[i][j];
			} //for j
		} //for i
	} // fillM

} // class







