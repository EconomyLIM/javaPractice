package days04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//중첩 if문
		
		try ( Scanner sc = new Scanner(System.in);){
			int kor = sc.nextInt();
			String grade = "가";
			
			if ( (90 <= kor) && (kor<=100) ) {
				grade = "수";
			}
			else if((80 <= kor)&&(kor<=89)) {
				grade = "우";
			}
			else if((70 <= kor)&&(kor<=79)) {
				grade = "미";
			}
			else if((60 <= kor)&&(kor<=69)) {
				grade = "양";
			}
			else {
				System.out.println("잘못입력");
			}
			System.out.println(grade);
			
		} catch (Exception e) {
			e.printStackTrace(); //에러 메시지 출력
		}
	}
}
