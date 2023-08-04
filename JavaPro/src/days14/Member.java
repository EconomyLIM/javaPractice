package days14;

public class Member {
	
	   // [필드]
	   // 1. 인스턴스 변수
	   String name = "익명"; // 명시적 초기화   
	   int age = 20; // 명시적 초기화 
	   int count;     //  명시적 초기화 X
	   int serialNo;  //  명시적 초기화 X 
	   // 2. 클래스 변수
	   static double rate = 0.05;  // 명시적 초기화
	   
	   // [클래스 초기화 블럭]
	   // 프로그램시작할 때 1번 호출된다.
	    static {
	      // 일괄적으로 static 변수가 있다면 초기화하는 데 사용.
	       rate = 0.08;
	       System.out.println("> static 초기화 블럭 호출됨..");
	    }
	    
	    // 인스턴스 초기화 블럭
	    {   
	       count++;
	       serialNo = count;
	    }
	    
	    // 4:05 수업시작~
	    public Member() {
//	       count++;
//	       serialNo = count;
	       
	       name = "무명";
	       System.out.println("> Member 디폴트 생성자 호출됨.");
	    }
	    
	    public Member(String name) {
//	       count++;
//	       serialNo = count;
	       
	       this.name = name;
	       System.out.println("> Member 1 생성자 호출됨.");
	    }
	    
	   

	}