package days10;

import java.io.IOException;
import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) throws IOException {
		//내일 시험문제 1번
		//한 반에 30 명의 학생
		// 성적처리(이름 ,국,영,수,총,평,등수)
		// 1.학생정보입력
		// 2. 총점, 평균
		// 3. 등수
		// 4. 학생정보 출력
		// 5. 파일저장 또는 DB저장:
		Scanner scanner = new Scanner(System.in);
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
		
		
		
		
	
		rank = 1;
		do {
			System.out.printf(">이름, 국어, 영어, 수학 입력");
			names[count] = scanner.next();
			kors[count]  = scanner.nextInt();
			engs[count] = scanner.nextInt();
			maths[count]  = scanner.nextInt();
			totals[count] = kors[count] + engs[count] + maths[count];
			avgs[count] = (double) totals[count]/3;
			ranks[count] = rank;
			count++;
			
			System.out.print(">입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		//등수처리
		procRank(totals, ranks,count);
		
		printStudentInfo(names, kors, engs, maths, totals, avgs, ranks, count);
	} // main

	private static void procRank(int[] totals, int[] ranks,int count) {
		for (int i = 0; i <count; i++) {
			ranks[i] = 1;
			for (int j = 0; j < count; j++) {
//				if(i == j) continue; 
				if(totals[i] < totals[j]) {
					ranks[i]++;
				} //if
			}//for
		} // for
	} // procRank

	private static void printStudentInfo(String[] names, int[] kors, int[] engs,int[] maths, int[] totals, double[] avgs,
			int[] ranks,int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf(" %d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n",i+1, names[i], kors[i], engs[i], maths[i], totals[i], avgs[i], ranks[i] );
		} // for
	} // printStudentInfo

}
