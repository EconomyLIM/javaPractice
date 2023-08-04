package days04;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		//중첩 if문
		
		try ( Scanner sc = new Scanner(System.in);){
			int kor = sc.nextInt();
			String grade = "가";
			//else if 문은 위에서 처리 안하면 밑으로 내려오기때문에 범위 지정 x
			if ( (90 <= kor) && (kor<=100) ) {
				grade = "수";
			}
			else if((80 <= kor)) {
				grade = "우";
			}
			else if((70 <= kor)) {
				grade = "미";
			}
			else if((60 <= kor)) {
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
