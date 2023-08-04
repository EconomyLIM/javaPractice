package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {
	public static void main(String[] args) throws IOException {
	String name;
	byte kor, eng, math;
	short sum;
	double avg; // 변수 선언
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받기위한 bufferReader 선언
	
	System.out.printf("이름을 입력하세요 > "); // 이름 입력 받기
	name = br.readLine();
	
	System.out.printf("국어점수를 입력하세요 > "); // 국어 점수 입력 받기
	kor = Byte.parseByte(br.readLine());
	
	System.out.printf("영어점수를 입력하세요 > "); // 영어 점수 입력 받기
	eng = Byte.parseByte(br.readLine());
	
	System.out.printf("수학점수를 입력하세요 > "); // 수학 점수 입력 받기
	math = Byte.parseByte(br.readLine());
	
	sum = (short) (kor + eng + math); //총합 구하기
	avg = (sum/3.00); // 평균 구하기
	
	System.out.printf("%s 님은 국: %d 영:%d 수:%d 총점: %d 평균: %.2f 이다.", name, kor, eng, math, sum, avg); // 출력
	}
}
