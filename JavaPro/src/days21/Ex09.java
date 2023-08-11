package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

import java.time.DayOfWeek;

public class Ex09 {
	public static void main(String[] args) {
		//TemporalAdjusters 클래스
		// 날찌 시간 수정
		//자주 사용되는 날짜, 시간 변경하는 메서드들을 미리 구현을 해놓은 클래스
		
		/* 예)다음 년도의 첫날
		 * 		다음 달의 첫 날
		 * 		올해의 첫날
		 * 		이번달의 첫날
		 * 		올해의 마지막 날
		 * 		** 이번 달의 마지막 날짜**
		 * 		다음 ?요일이 언제인지
		 *		지난 ? 요일
		 *		이번 달 n번째 ?요일
		 *등등
		 */
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		// 다음달의 첫날
		System.out.println(ld.with(firstDayOfNextMonth()));
		
		// 이번달의 첫날
		System.out.println(ld.with(firstDayOfMonth()));
		
		// 이번달의 첫번째 월요일
		System.out.println(ld.with( TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY) ));
		
		// 지난주 화요일
		System.out.println(ld.with( previous(DayOfWeek.TUESDAY) ));
		// OrSame 오늘 포함
		System.out.println(ld.with( previousOrSame(DayOfWeek.TUESDAY) ));
		
		// 다음주 금요일 
		System.out.println( ld.with(next(DayOfWeek.FRIDAY)) );
		System.out.println( ld.with(nextOrSame(DayOfWeek.FRIDAY)) );
		
		// 이번 달의 네번째 화요일
		System.out.println( ld.with( dayOfWeekInMonth(4, TUESDAY)) );
		
		// 3일뒤에 만나자 약속
		ld = ld.with( new DayAfter3());
		
		
		
		
		
		
		
		
		
		
	}//main
}

class DayAfter3 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(3, ChronoUnit.DAYS);
	} // adjustInto
}










