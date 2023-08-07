package days18;

public class Ex09 {
	public static void main(String[] args) {
		//					StringBuffer, String Builder 클래스
		// 멀티스레드			안전x			안전o
		// 동기화 처리			x				o	
		
		//위의 두 클래스 언제 사용하는가? -> String 변경 불가능한 클래스, 변경 가능한 클래스 (문자열 속 - 삽입, 수정, 추가)
		// 객체 생성이 라인수 만큼 생성되어 지고 있다 -> 좋은 코딩 x
		String sql = "SELECT ";
        sql += "a.ano ";
        sql += " ";
        sql += ", a.user_id as userId ";
        sql += " ";
        sql += ", b.user_name as userName ";
        sql += " ";
        sql += ", a.rno ";
        sql += " ";
        sql += ", c.rname ";
        sql += " ";
        sql += ", DATE_FORMAT(a.sd,'%Y-%m-%d') as sd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.ed,'%Y-%m-%d') as ed ";
        sql += " ";
        sql += ", DATE_FORMAT(a.rd,'%Y-%m-%d %T') as rd ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_in,'%Y-%m-%d %T') as checkIn ";
        sql += " ";
        sql += ", DATE_FORMAT(a.check_out,'%Y-%m-%d %T') as checkOut ";
        sql += " ";
        sql += "-- , a.sign_yn as signYn ";
        sql += " ";
        sql += ", d.code_name as signYn ";
        sql += " ";
        sql += "-- , a.cancel_yn as cancelYn ";
        sql += " ";
        sql += ", e.code_name as cancelYn ";
        sql += " ";
        sql += "FROM tb_reservation a left outer join tb_user b on a.user_id = b.user_id ";
        sql += " ";
        sql += "left outer join tb_rooms c on a.rno = c.rno ";
        sql += " ";
        sql += "left outer join tb_code d on a.sign_yn = d.code_cd ";
        sql += " ";
        sql += "left outer join tb_code e on a.cancel_yn = e.code_cd ";
        
        System.out.println(sql);
		
	}// main
}
