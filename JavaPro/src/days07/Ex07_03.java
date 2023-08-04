package days07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07_03 {int a = 1;
	public static void main(String[] args) {
		// 주말 문제 풀기 피보나치 수열
		//  1+1+2+3+5+8+13...
		/*
		int [] p = new int [20];
		p[0] = p[1]=1;
		int index =2;
		while(true) {
			int term = p[index-1] + p[index-2];
			if (term > 100) {
				break;
			}
			p[index] = term;
			index ++;
		}
		System.out.println(Arrays.toString(p));
		
		int sum = IntStream.of(p).sum();
		System.out.println(sum);
		*/
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm = 1;
		int sum = firstTerm + secondTerm;
		// f s
		//   f s
		//     f s
		System.out.printf("%d+%d", firstTerm, secondTerm);
		//[A]
//		while (true) {
//			nextTerm = firstTerm + secondTerm;
//			if (nextTerm> 100) {
//				break;
//			} //if
//			System.out.printf("%d+",nextTerm);
//			sum +=nextTerm;
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//		}
		
		//[B]
		while ((nextTerm = firstTerm + secondTerm) <= 100) {
			
			System.out.printf("%d+",nextTerm);
			sum +=nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		
		/*
		int sumt = 0;
		int n = 0;
		for (int i = 1; i <= 100;) {

		i = n+ i;
		System.out.printf("%d+", i);
		sumt+= i;
		if (i+n >100) {
			break;
		}
		
		n = i+n;
		System.out.printf("%d+ ", n);
		sumt+= n;
		} // for
		System.out.printf("\b =%d", sumt);
		*/
		//[순서도] 검색~
	}
}
