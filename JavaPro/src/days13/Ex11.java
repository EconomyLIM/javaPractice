package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex11 {
	public static void main(String[] args) throws IOException {
		// 한 학생의 성적 관리 Student 클래스 선언
		Scanner scanner = new Scanner(System.in);
		final int STUDENT_COUNT = 30; // 상수선언
		//클래스 배열
		Student [] students = new Student[STUDENT_COUNT];
		// students 배열명
		// [][][][][][] -> []s
		// s[0]

		int count = 0; //입력받은 학생수를 저장할 변수
		char con = 'y';//입력 요구를 받을 변수
//		for (int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//		} //for
		int no  = 1;
		do {
			System.out.printf(">이름, 국어, 영어, 수학 입력");
			students[count] = new Student();
			students[count].no = no++;
			students[count].name= getName();
			students[count].kor  = getScore();
			students[count].eng = getScore();
			students[count].mat = getScore();
			students[count].tot = students[count].kor+students[count].eng +students[count].mat;
			students[count].avg = (double)students[count].tot/3;
			
//			students[count].rank = rank;
			count++;

			System.out.print(">입력 계속?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');
		for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
		} //for
	} // main

	public static String getName() {
		Random rnd = new Random();
		char [] nameArr = new char[3];

		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣' - '가' + 1) +'가');
		} // for

		String name = String.valueOf(nameArr);
		return name;
	} //getName

	public static int getScore() {

		return (int)(Math.random()*101);
	} //getScore

}
