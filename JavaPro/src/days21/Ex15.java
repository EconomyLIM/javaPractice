package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/**
 * @author kenik
 * @date 2023. 8. 10. - 오후 4:41:10
 * @subject
 * @content
 */
public class Ex15 {

	public static void main(String[] args) throws IOException {
		// 한 반에 30명 학생   이,국,영,수,총,평,등 
		// 1차원 배열 처리
		// 2차원 배열 처리
		// 3차원 배열 처리
		// Student 클래스 배열 처리  
		// [ Student 클래스 + ArrayList 처리 ]  
		//  days10.Ex06.java
		
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
		int wrank;
		
		final int STUDENT_COUNT = 30;
		
		ArrayList list = new ArrayList();
		// 5:02 수업 시작~
		Scanner scanner = new Scanner(System.in);
		
		char con = 'y';
		int no = 1;
		
		do {
			System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
			 
			name = getName();   
			kor = getScore();
			eng = getScore();
			mat = getScore();	
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			rank = 1;
			wrank = 1; 
			
			Student s = new Student(no++, name, kor, eng, mat, tot, avg, rank, rank);  
			
			list.add(s);
			// 입력 계속 ? y 
			System.out.print("> 학생 입력 계속 ?");
			con = (char)System.in.read(); // checked 예외
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		// [문제]
				// 1. 등수처리
		Student s1 ,s2;
	      for (int i = 0; i < list.size(); i++) {
	         s1 = (Student)list.get(i);
	         for (int j = 0; j < list.size(); j++) {
	            s2 = (Student)list.get(j);
	            if(s1.getTot() < s2.getTot()) {
	               s1.setRank(s1.getRank() + 1);
	            }
	         } // for
	      } // for
	      
	      list.sort(new Comparator<Student>() {

	         @Override
	         public int compare(Student o1, Student o2) {
	            
	            return o1.getRank() - o2.getRank();
	         }
	      });
				// 2. 성적순으로 오름차순 정렬
		
		// 모든 학생 출력
		System.out.println("> 입력받은 학생수 : " + list.size());
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		} // while
		

	} // main

	public static String getName() {

		Random rnd = new Random();		
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가' +1) + '가');
		} // for
 
		String name = String.valueOf(nameArr);  
		return name;
	}

	public static int getScore() {		 
		return (int)(Math.random()*101);
	}

} // class










