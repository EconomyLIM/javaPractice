package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Random rnd = new Random(10000L); //long seed-> Random이라는 클래스에 필드 초기화
		
		Scanner scanner = new Scanner(System.in);
		
		int year = 2023;
		int month = 10;
		int day = 25;
		
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		
		System.out.println(d.getDay()); //3 ->요일
		
	}//main
}
