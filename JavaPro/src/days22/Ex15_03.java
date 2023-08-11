package days22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Ex15_03 {
	public static void main(String[] args) throws IOException {
		//시험
		Scanner scanner= new Scanner(System.in);
		
		int m = scanner.nextInt();
		LinkedHashSet hs = new LinkedHashSet(6);
		LinkedHashSet hs2 = new LinkedHashSet(m);
		
		
		
		for (int i = 0; i < m; i++) {
			fillLotto(m,hs, hs2);
			System.out.println(hs2);
		} //for
	}

	private static void fillLotto(int m, LinkedHashSet hs, LinkedHashSet hs2) {
		int num ;
		for (int i = 0; i<m; i++) {
			for (int j = 0; hs.size() < 6; j++) {
				num = (int) (Math.random()*45+1);
				hs.add(num);
			} //for
			hs2.add(hs);
		} //for
		
	}
}

class FillLotto{
	int gameNumber;
	HashSet hs;
}
