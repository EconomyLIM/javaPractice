package days10;

import java.util.Arrays;
import java.util.Random;


public interface Ex08_02 {
	public static void main(String[] args) {
		//람다식과 스트림
		int [] score = new Random()
				.ints(20, 0, 101)
				.toArray();
		
		System.out.println(Arrays.toString(score));
		
	}
}
