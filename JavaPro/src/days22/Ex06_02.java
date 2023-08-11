package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06_02 {
	public static void main(String[] args) {
		// ArrayList> STring[]
		
		ArrayList list = new ArrayList(3);
		list.add("신종혁");
		list.add("고경림");
		list.add("이재영");
		
		//[2] Object
		//String [] nameArr= (String[]) list.toArray(new String[list.size()]);
		
//		System.out.println(Arrays.toString(nameArr));
	}//main
}
