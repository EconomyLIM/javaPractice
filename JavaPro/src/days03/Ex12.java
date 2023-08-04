package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) throws IOException {
		
		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		//홍길동,90,78,99\
		//1) 기능 2) 매개변수 3) 리턴값(리턴자료형)
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("> 이름, 국어, 영어, 수학 입력: ");
//		String inputData= br.readLine();
//		String [] datas = inputData.split(",");
		
//		name = datas[0];
//		kor = Integer.parseInt(datas[1]);
//		eng = Integer.parseInt(datas[2]);
//		mat = Integer.parseInt(datas[3]);
//		
//		
//		total = kor +eng + mat;
//		avg = (double) total/3;
//		
//		System.out.printf("%s님은 국: %d, 영: %d, 수: %d 총합: %d, 평균: %.2f 이다",
//				name, kor, eng, mat, total, avg);
//		
		//regex = reqular exrpession (정규표현식)
		
		Calculate();
		
	}
	
	public static void Calculate() throws IOException{
		String name = "임경재";
		int [] score = new int [3];
		String [] object = {"국어", "영어", "수학"};
		int totalTwo = 0;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < object.length ; i++) {
			System.out.printf(object[i]+"의 점수를 입력하세요>" );
			score[i] = Integer.parseInt(br.readLine());
			totalTwo += score[i];
		}
		System.out.println(totalTwo);
		avg = (double) totalTwo/3;
		System.out.printf("%s님 국어: %d, 영어:%d, 수학: %d, 총합: %d, 평균%.2f",
				name, score[0], score[1], score[2], totalTwo, avg);
		
	}
}
