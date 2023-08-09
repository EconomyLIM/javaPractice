package days20;

public class Ex11 {
	public static void main(String[] args) {
		/*
		 * Date
		 * Calendar
		 * jdk 1.8~ 새로 추가된 날짜 시간 클래스
		 * (java.time 패키지)
		 * 1. java time 패키지-> 4개의 하위 패키지 : 날짜와 시간을 다루는 핵심 클래스 
		 * 		ㄴj.t.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공
		 * 		ㄴj.t.format : 형식화, 파싱 클래스 제공
		 * 		ㄴj.t.temporal : 날짜, 시간의 필드(field)와 단위(unit)클래스 제공
		 * 		ㄴj.t.zone : 시간대(time-zone) 클래스 제공2
		 * 
		 * 2. jav.time : 날짜 시간 다루는 핵심 클래스 제고1
		 * 1) 날자: LocaleDate
		 * 2) 시간:  : LocalTime
		 * 3) 날짜 + 시간; LocakDateTime
		 */ // 날짜 _+ 시간+ 음역 : ZonedDateTIme
		// ld, lt, ldt, zdt 핵심 클래스는 모두 Temporal, TemporalAdjuster 인터페이스 구현
		
		// 3]
		// new 연산자로 객체 생성 x = > now,  of() 메소드로 객체 생ㅅ어
		
		// 4)날짜와 날짜 사이의 간격 : Period
		// 시간과 시간 사이의 간격: Duration
		/*
		 *  TemporalAmount 인터페이스 구현
		 *  
		 *  5. 날짜와 시간의 단위를 정의해 놓은것이 
		 *  	ㄴ Temporal[Unit] 인터페이스 
		 *  	ㄴ ChronoUnit 클래스
		 * 
		 *  6. 년, 월, 일 등의 날짜와 시간의 필드(field)를 정의해 놓은 것이 
		 *  	ㄴ Temporal[Field] 인터페이스 
		 *  	ㄴ Chrono[Field] 인터페이스 
		 *  
		 *  7. 특정 필도 (년, 월 ,일 등등 ) 가져오기
		 *  	ㄴ getXXX()
		 *  	ㄴ get(필드)
		 *  
		 *  8. 특정 필드수정 : with(), plus(), minus()
		 *  	Date d.setYear(???);
		 *  	c.set(Calendar.year, ???) // c.add() // c.roll()
		 *  	
		 */
		  
		
		
	} //main
}
