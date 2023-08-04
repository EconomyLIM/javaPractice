package days10;

import java.util.Arrays;
import java.util.stream.IntStream;


public interface Ex08 {
	public static void main(String[] args) {
		int sum = 0;
		int [] score = new int [20];
	
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random()*101);
		} // for
		int max = score[0], min = score[0];
		for (int i = 1; i < score.length; i++) {
			max = Math.max(max, score[i]);
			min = Math.min(min, score[i]);
		}
		
		max = IntStream.of(score).max().getAsInt();
		min= IntStream.of(score).min().getAsInt();
		sum = IntStream.of(score).sum();
		double avg = IntStream.of(score).average().getAsDouble();
		System.out.println(Arrays.toString(score));
		System.out.println(max+","+min);
		System.out.println(sum+","+avg);
	}
}
