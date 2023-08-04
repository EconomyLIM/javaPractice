package days16;

public class Ex06 {
	public static void main(String[] args) {
		//싱글톤 패턴
		/* 1.DBCP(DataBase Connection Pool)
		 * 2. 객체 생성 제한 = 1개 객체 생성
		 * 			  첫 객체 생성 = 1개 객체 생성
		 * 		두 번째 객체 생성 = 생성x 
		 * 		세 번째 객체 생성
		 * 
		 */
		
		/*
		BoardDao dao1 = new BoardDao();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = new BoardDao();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = new BoardDao();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = new BoardDao();
		System.out.println(dao4.hashCode());
		*/
		BoardDao dao1 = BoardDao.getInstance();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = BoardDao.getInstance();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = BoardDao.getInstance();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = BoardDao.getInstance();
		System.out.println(dao4.hashCode());
	} //main
}
// 1개 객체만 생성패턴

//클래스 내부에서는 객체 생성을 할 수 있습니다.
class BoardDao{

	private BoardDao() {
		
	}
	
	//공유변수, 클래스 변수[필드]
	private static BoardDao boardDao = null;
	
	// 메소드 앞에 synchronized 키워드를 붙이면 해당 메서드는 스레드에 안전한 동기화 처리가 되어진다.
	public synchronized static BoardDao getInstance() {
		
		if (boardDao == null) {
			boardDao = new BoardDao();
		} //if
		
		return boardDao;
	} 
	
} //BoardDao
/*
 * 
 * 
 * 
 */
