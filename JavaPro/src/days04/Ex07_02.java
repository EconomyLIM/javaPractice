package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		int A, B;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i = 1 ; i <=10 ; i++) {
			A= Integer.parseInt(br.readLine());
			B = A%42;
			h.add(B);
		}

		System.out.println(h.size());
	}
}

