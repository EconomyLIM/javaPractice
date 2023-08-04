package days06;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex01_03 {

	public static void main(String[] args) {
		// 1.jdk 1.5 제네릭
		// 2. jdk 1.8람다식 과 스트림
		
		int [] m = new Random().ints(5, 16).limit(10).toArray(); //10개 정수 5~16 깂 배열 m 에 저장
		System.out.println(Arrays. toString(m)); //배열 m 출력
		
		int maxTwo = new Random().ints(5, 16).limit(10).max().getAsInt(); // 랜덤 (5~16)값 10개 가장 큰수 
		System.out.println(maxTwo);
		
		int a= 5, b =3, c= 7;
		int max = IntStream.of(a,b,c).max().getAsInt();
		System.out.println(max);
		
		IntStream.of(a,b,c).max().ifPresent(System.out::println);
	}

}
