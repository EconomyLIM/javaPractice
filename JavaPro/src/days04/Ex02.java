package days04;

public class Ex02 {
	public static void main(String[] args) {
		String skor = "  90    ";
		int kor = Integer.parseInt(skor.trim()); //trim > 앞뒤 공백 제거, 매개변수 필요 없다, String 반환
		System.out.println(kor);
	}

}
