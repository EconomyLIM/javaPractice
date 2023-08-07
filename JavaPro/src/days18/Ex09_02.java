package days18;

public class Ex09_02 {
	public static void main(String[] args) {

		/*
		StringBuffer sb = new StringBuffer("SELECT ");
		sb.append( "a.ano ");
		sb.append("left outer join tb_code e on a.cancel_yn = e.code_cd ");
		*/
		
		String s = "안녕하세요. 홍길동입니다. 홍길동입니다. 홍길동입니다.";
		// 두번째 "홍길동"문자열을 찾아서 "XYZ"로 수정하고싶다.
		/*
		int index = 15;
		s= s.substring(0, index) + "XYZ" + s.substring(index+3);
		System.out.println(s);
		*/
		
		StringBuffer sb = new StringBuffer(s);
//		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.toString());
		int index = sb.indexOf("홍길동",0);
		index = sb.indexOf("홍길동",index+3);
		
		System.out.println(index);
		
		sb.delete(15, 18);
		sb.insert(index, "XYZ");
		
		System.out.println(sb);
		
	}// main
}
