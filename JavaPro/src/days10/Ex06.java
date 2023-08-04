package days10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//내일 시험문제 1번
		//한 반에 30 명의 학생
		// 성적처리(이름 ,국,영,수,총,평,등수)
		// 1.학생정보입력
		// 2. 총점, 평균
		// 3. 등수
		// 4. 학생정보 출력
		// 5. 파일저장 또는 DB저장:
		final int STUDENT_COUNT = 30; // 상수선언
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs= new int[STUDENT_COUNT];
		int [] maths = new int[STUDENT_COUNT];
		int [] totals = new int[STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		int[] ranks= new int[STUDENT_COUNT];
		
		
		int count = 0; //입력받은 학생수를 저장할 변수
		char con = 'y';//입력 요구를 받을 변수
		String name;
		int kor, eng, math, rank, total =0;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf(">이름, 국어, 영어, 수학 입력");
		name = scanner.next();
		kor  = scanner.nextInt();
		eng = scanner.nextInt();
		math  = scanner.nextInt();
		
		total = kor +eng+math;
		avg = (double) total/3;
		rank = 1;
	} // main

}
