package days18;

public class Ex08_04 {
	public static void main(String[] args) {
		String s= "안녕하세요 .홍길동입니다 .홍길도이고 .홍길둥입니다. 홍길.입니다.";
//		s = s.replaceFirst("홍길동", "hong.gildong");
		//
//		String regex = "홍길."; //or "홍길[가-힣]"
//		s = s.replaceAll(regex, "hong.gildong"); //첫번째 매개변수에 "정규표현식"이 들어간다
//		System.out.println(s);
		
		s= s.replace("홍길도", "XYZ");
		System.out.println(s);
		
		CharSequence target = new StringBuffer("홍길동");
		
	}
}
