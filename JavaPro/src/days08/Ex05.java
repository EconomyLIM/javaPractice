package days08;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		int a = 1;
		// 연도를 입력 받아서 윤년/평년을 체크하는 코딩
		// 연도를 매개변수로 받아서 윤년 평년 boolean 반환하는 함수 선언
		int year = 2100;
		
		if (isLeapYear(year)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		//2000~ 올해 까지 윤년/평년 체크
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.get(1));
		int thisYear = calendar.get(Calendar.YEAR);
		for (int i = 2000; i < thisYear; i++) {
			System.out.printf("%d(%s)\n", i, isLeapYear(i)? "윤년": "평년");
		}
	}//main
	
	//윤년 true
	//평년 false
	public static boolean isLeapYear(int year){
	
		/*현재 전 세계 대부분의 나라에서 쓰는 그레고리력은 4년에 반드시 하루씩 윤날(2월 29일)을 추가하는 율리우스력을 보완한 것으로, 태양년과의 편차를 줄이기 위해 율리우스력의 400년에서 3일(세 번의 윤년)을 뺐다.

		그레고리력의 정확한 윤년 규칙은 다음과 같다.

		서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
		서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. (1700년, 1800년, 1900년, 2100년, 2200년, 2300년...)
		서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (1600년, 2000년, 2400년...)*/
		
		if(year % 4 == 0 && year %100 !=0 || year%400==0) {
			return true;
		}
		else {
			return false;
		}
		
	} //isLeapYear
}
