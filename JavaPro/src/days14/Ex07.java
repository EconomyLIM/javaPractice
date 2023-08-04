package days14;

public class Ex07 {
	public static void main(String[] args) {
		
		//static 
		/*
		 * 필드앞에
		 * 메서드 앞에
		 * 클래스 앞에
		 * 
		 */
		// 반학생 모두가 은행가서 예금한다.
		// Save 클래스 선언: 저축
		// 인스턴스 변수 = 객체명.~명
		// 클래스 변수 = 클래스명.필드명
		System.out.println(Save.getRate());
		
		
		Save s1 = new Save("주강민", 1000, 0.04);
		Save s2 = new Save("정하영", 1500, 0.04);
		Save s3 = new Save("임경재", 34500, 0.04);
		Save s4 = new Save("이지현", 5000, 0.04);
		Save s5 = new Save("이준희", 21000, 0.04);
		//Save.setRate(0.08);
		s1.setRate(0.06);
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		
		// 클래스 배열 
//		Save [] ss = new Save[5];
//		ss[0] = new Save("주강민", 1000, 0.04);
//		ss[1]= new Save("정하영", 1500, 0.04);
//		ss[2]= new Save("임경재", 34500, 0.04);
//		ss[3]= new Save("이지현", 5000, 0.04);
//		ss[4] = new Save("이준희", 21000, 0.04);
		/*
		// 클래스 배열 초기화
		Save [] ss = {
				 new Save("주강민", 1000, 0.04),
				 new Save("정하영", 1500, 0.04),
				 new Save("임경재", 34500, 0.04),
				 new Save("이지현", 5000, 0.04),
				 new Save("이준희", 21000, 0.04)
		};
		for (int i = 0; i < ss.length; i++) {
			ss[i].dispSave();
		} //for
		*/
		// [파악] 모든사람의 이자율은 동일하다.
		// Save객체가 생성될따마다 rate 필드는 필요가 없다
		// Save 클래스당 1개만 rate 필드 생성해
		// 인스턴스가 공유
		
		
		
		
	} //main
} //class
