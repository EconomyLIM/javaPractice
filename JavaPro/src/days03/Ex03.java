package days03;

import java.util.Scanner;


public class Ex03 {
	public static void main(String[] args) {
		String name;
		int age;
		int kor, eng, math;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름을 입력하세요 >");
		name= scanner.next();
		
		System.out.printf("나이를 입력하세요 >");
		age  = scanner.nextInt();
		
		System.out.printf("국어점수를 입력하세요 >");
		kor = scanner.nextInt();
		
		System.out.printf("영어점수를 입력하세요 >");
		eng  = scanner.nextInt();
		
		System.out.printf("수학점수를 입력하세요 >");
		math  = scanner.nextInt();
		
		double sum = (kor + eng + math);
		double avg = (sum/3.00);
		
		System.out.printf("\"%s\" %d살 %d %d %d %.2f", name, age, kor, eng, math, avg);
		
	
			}
		
	}
