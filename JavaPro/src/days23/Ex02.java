package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days10.Ex06_04;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		// 1반 30명
		ArrayList<Student> class1 = new ArrayList<>();
		ArrayList<Student> class2 = new ArrayList<>();
		ArrayList<Student> class3 = new ArrayList<>();
		
		ArrayList<ArrayList<Student>> sistList = new ArrayList<>();
		sistList.add(class3);
		sistList.add(class2);
		sistList.add(class1);
		
		char con = 'y';
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		int ban;
		int no;
		int cnt = 0;
		
		//------------------------------------학생정보 입력부분
		
		do {
			// 1. 반 입력?
			System.out.printf("> 반 입력 ? ");
			ban = scanner.nextInt(); // 1 or 2 or [3]
			ArrayList<Student> classList = sistList.get(ban-1);
			
			// 2. 그 반의 학생 정보 입력 ? 
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban , classList.size()+1);
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			wrank = rank = 1;
			
			cnt ++;
			no= classList.size()+1; 
			Student s = new Student(no, name, kor, eng, mat, tot, avg, rank, wrank);
			
			classList.add(s);
			// 입력 계속 
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
		// =============출력==================
//		System.out.printf("총학생수 : %d 명\n", cnt);
		System.out.println("-".repeat(40));
		//sistList.stream().mapToInt(classList ->classList.size()).forEach(학생수 -> System.out.println(학생수));
//		sistList.stream().mapToInt(ArrayList::size).forEach(System.out::println);
		int totalCount = sistList.stream().mapToInt(ArrayList::size).sum();
		System.out.println("-".repeat(40));
		Iterator<ArrayList<Student>> it =  sistList.iterator();
		ban= 1;
		while (it.hasNext()) {
			ArrayList<Student> classList =it.next();
			System.out.printf("[%d반 학생 : %d명 ]\n", ban++, classList.size());
			Iterator<Student> it2= classList.iterator();
			while (it2.hasNext()) {
				Student s = it2.next();
				System.out.println(s);
				
			}//while
		} //while
		
	}
}
