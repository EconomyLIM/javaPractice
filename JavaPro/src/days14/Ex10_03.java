package days14;

public class Ex10_03 {

	public static void main(String[] args) {
		Member member = new Member();
		System.out.println(member.name);
		System.out.println(member.count);
		Member member2 = new Member();
	} //main
	/*
	 * 초기화 순서
	 * 1) 명시적 초기화
	 * 2) 클래스 초기화 (객체 생성될때 1번 초기화)
	 * 3) 인스턴스 초기화 (객체 생성돌떄 마다 초기화)
	 * 		ㄴ 생성자 중복 코딩 초기화 블럭...
	 * 4) 생성자 초기화 *( 객체 생성될떄 마다 초기화)
	 */

}
