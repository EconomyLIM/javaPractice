package days13;


public class Student {
	//클래스 구성요소 = 멤버변수(필드) + 멤버함수(메서드)
	//필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	
	//메서드
	public void printStudentInfo() {
		
			System.out.printf(" %d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d등\t\t%d등\n"
					,no, name, kor, eng, mat, tot, avg, rank, wrank);
			
	} // printStudentInfo
} // class
