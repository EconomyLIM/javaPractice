package days08;

public class Ex10_2 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";
		
		String [] rrnArrStrings = rrn.split("-");
		
		
		
		System.out.printf("%s-*******\n",rrnArrStrings[0]);
		System.out.printf("%s-%c******\n",rrnArrStrings[0],rrn.charAt(7));
		System.out.printf("%s-%c******\n",rrnArrStrings[0], rrnArrStrings[1].charAt(0));
		System.out.println(rrn.substring(0,8)+"******");
	}

}
