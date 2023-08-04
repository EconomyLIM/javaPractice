package days04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	      // Ex04_02.java
	      // 국어점수 입력받아서
	      //    수우미양가 등급 출력
	      // ( if문 -> switch문 변경 )
	      int kor;
	      try( Scanner scanner = new Scanner(System.in) ){
	         
	         System.out.print("> 국어 점수 입력 ? ");
	         kor = scanner.nextInt(); 
	         char grade = '가';
	         
	         // 100           10
	         // 99~90          9
	         // 89~80          8
	         // 79~70          7
	         // 69~60          6 
	         // 59~0           0~5
	         switch ( kor/10 ) {  // key  변수, 수식 O
	         case 10:
	         case 9:
	            grade = '수'; break;
	         case 8:
	            grade = '우'; break; 
	         case 7:
	            grade = '미'; break; 
	         case 6:
	            grade = '양'; break; 
	         default:
	            grade = '가'; break; 
	         } // switch
	         
	         System.out.println( grade);
	          
	         
	      } catch (Exception e) { 
	         e.printStackTrace();
	      } // catch


	   } // main



}
