package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {
	public static void main(String[] args) throws ParseException {
		String strMoney = "1,234,567";
		int money = 1234567;
		
		// [2]
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		Number num = df.parse(strMoney);
		money = num.intValue();
		System.out.println(money);
	}
}
