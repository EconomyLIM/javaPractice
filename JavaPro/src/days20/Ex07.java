package days20;

import java.text.DecimalFormat;

public class Ex07 {
	public static void main(String[] args) {
		
		//형식화 클래스(4가지)
		/*
		 * 1. SimpleDateFormat
		 * 2. DecimalFormat
		 * 3. ChoiceFormat
		 * 4. MessageFormat
		 */
		
		// Decimal Format
		// 숫자 		형식화(어떤 숫자를 내가 원하는 형식으로 형식화 하는 클래스)
		
		double money = 3257600.800;
		
		// 출력형식: \3,257,600
		// [1]
		/*
		String strMoney =  String.format(" \\%,d ", money); //","라는 플래그 == 세자리마다,
		System.out.println(strMoney);
		*/
		// [2] Decimal Format
		// 패턴에 사용할 수 있는 기호
		/* 0: 10진수 -> 값이 없을 경우 0을출력
		 * #: 10진수 -> 
		 * #.##		9.1을 찍었을때 9.1
		 * 0.00		9.10
		 * -: 음수 부호
		 * ,: 단위 구분자
		 * E: 지수기호
		 * ;: 패턴 구분자
		 * %: 퍼센트
		 * ' : escape
		 * \u00a4 : 통화기호
		 * etc..
		 */
		String pattern = "\u00a4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strmoney =  df.format(money);
		System.out.println(strmoney);
		
	} //main
}
