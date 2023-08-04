package days13;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex11_02 {
	/*public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT =30;
		final int CLASS_COUNT = 3;

		//3반의 30명 학생의 성적처리 -> Student 클래스 사용 수정

		//클래스 2차원 배열
		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];


		char con = 'y';
		int counts [] = new int [CLASS_COUNT];
		String name;
		int kor, eng, math, tot, rank, wrank;
		double avg;
		int ban;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.printf(">반 입력 >>> ");
			ban =  scanner.nextInt();

			System.out.printf(">%d반의 [%d] 번 학생의 이름,국어,영어 수학 입력\n"
					,ban, counts[ban-1] +1);

			name = days10.Ex06_04.getName();
			kor =days10.Ex06_04.getScore();
			eng =days10.Ex06_04.getScore();
			math =days10.Ex06_04.getScore();

			tot = kor +eng+ math;
			avg = (double)tot/3;
			wrank = rank = 1;
			
			// 객체 생성
			// 클래스 복사
			Student s = students[ban-1][counts[ban-1]] = new Student();

//			students[ban-1][counts[ban-1]] = new Student();
			s .no= counts[ban-1]+1;
			s .name = name;
			s .kor  = kor;
			s .eng = eng;
			s .mat  = math;
			s .tot  = tot;
			s .rank  = rank;
			s .wrank  = wrank;
			s .avg = avg;

			counts[ban-1]++;


			System.out.print("> 입력 계속 ?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');


		//둥수처리
		Student s1, s2;
        for (int i = 0; i < counts.length; i++) {
           for (int j = 0; j < counts[i]; j++) {
              // infos[i][j][3]  총점
              s1 = students[i][j];
              s1.rank = 1; // 반등수
              s1.wrank = 1; //전교등수
              
              for (int i2 = 0; i2 < counts.length; i2++) {
                 for (int j2 = 0; j2 < counts[i2]; j2++) {
                    s2 = students[i2][j2];
                    
                    if( s1.tot < s2.tot ) {
                       s1.wrank++;
                       if( i == i2 ) { // 같은 반
                          s1.rank++;
                       } // if
                    } // if
                 } // for j2
              } // for i2
              
           } // for j
        } // for i

		// 학생정보 출력
		int allStudent = IntStream.of(counts).sum();

		System.out.printf("\t\t총 학생수");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%d반 학생 %d명\n", i+1,counts[i]);
			for (int j = 0; j < counts[i]; j++) {

				students[i][j].printStudentInfo();
			} //for
		} //for

	} // main*/
} //class
