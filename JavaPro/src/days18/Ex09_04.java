package days18;

public class Ex09_04 {
	public static void main(String[] args) {
		System.out.println(waterMelon(11));
	}
	
	public static String waterMelon(int n) {
		StringBuffer sb = new StringBuffer();
		int cnt = n/2;
		int mok = n%2;
		for (int i = 0; i < cnt; i++) {
			sb.append("수박");
		} //for
		if(mok ==1)sb.append("수");
		return sb.toString();
	}
}
/*
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n   return
3   "수박수"
4   "수박수박"
*/
