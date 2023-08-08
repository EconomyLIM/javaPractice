package days19;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		String [] answer = Solution.solution(my_str, n);
		System.out.println(Arrays.toString(answer));
		
		/*
		 * String my_str = "abcdef123";
		 * int n =3;
		 */
		
	} // main
}
class Solution {
	public static String[] solution(String my_str, int n) {
	       int answerLength = (int) Math.ceil( (double)my_str.length() / n ); 
	       
	        String[] answer = new String[answerLength];
	        
	        /*
	        String a = my_str.substring(0, 6);
	        System.out.println( a );
	        
	        a = my_str.substring(6, 12);
	        System.out.println( a );
	        
	        a = my_str.substring(12, 16);
	        System.out.println( a );
	        */
	        int beginIndex = 0, endIndex;
	        String str = null;
	        int my_strLength = my_str.length();
	        int index = 0;
	        while (index != answerLength) {
	           endIndex = beginIndex + n;
	           
	           if( endIndex > my_strLength)  endIndex = my_strLength;
	           str = my_str.substring(beginIndex, endIndex);
	           answer[index++] = str;
	           beginIndex= endIndex;
	      } // while
	        
	        return answer;
	    }
}

/*
 * 
 * 
 * my_str	n	result
 * "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
 * "abcdef123"	3	["abc", "def", "123"]
 */

/*
int i = 0, idx = 0;
try {
   for (             ; i < my_strLength ; i+=n, idx++) {
       answer[idx] =   my_str.substring(i, i+n );
     } 
} catch (Exception e) {
   answer[idx] =   my_str.substring(i);
}
*/
