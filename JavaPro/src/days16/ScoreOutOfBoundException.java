package days16;

//unchecked 예외
// 0~100 아니면 사용자가 정의한예외를 발생시키기 위해서
public class ScoreOutOfBoundException extends RuntimeException{
	
	private final int Error_code = 0; // final이기 땜에 setter는 안만들어지고 getter민 만들어진다.
	
	public ScoreOutOfBoundException(int Error_code, String name) {
		
		super(name);
		
		Error_code = Error_code;
	}
	
	public ScoreOutOfBoundException( String name) {
	this(1000, name);
		
	}

	public int getError_code() {
		return Error_code;
	}
}
