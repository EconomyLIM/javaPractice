package days20;

import java.text.ChoiceFormat;

public class Ex09 {
	public static void main(String[] args) {
		// 형식화 클래스 - ChoiceFromat
		// 1. 특정 범위에 속하는 값을 문자열로 변환해준다.
		// 2. 불연속적인 범위의 값을 처리하는데 if switch문을 대신해서 사용할 수 있다.
		// 		-> 복잡한 처리를 간단한 코딩으로 처리할 수 있다.
		// 예) 국어점수 -> 수, 우, 미, 양, 가 출력
		
		String newPattern = "0#가|60#양|70#리|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		/*
		double[] limits = {0,60,70,80,90};
		String[] formats = {"가", "양", "미", "우", "수" };
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		int []kors = {100,67, 23, 99};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d -> %s등급\n", kors[i], cf.format(kors[i]));
		} //for
		*/
		
		
	}
}
