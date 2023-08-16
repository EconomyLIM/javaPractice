package days24;

public class Ex05 {
	public static void main(String[] args) {
		Button btnTouch = new Button();
		btnTouch.setListener(new CallListener());
		btnTouch.touch();
		btnTouch.setListener(new MessageListener());
		btnTouch.touch();
		
		
	}
}


class Button{
	// 필드
	OnClickListener listener;
	
	//생성자를 통해서, setter 를 통해서 의존성 주입(Di); 결합력이 낮은 코딩
	
	public OnClickListener getListener() {
		return listener;
	}

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		this.listener.onClick();
	}
	
	//중첩 인터페이스를 선언
	interface OnClickListener{ //interface에서
		//상수와 추상, default메소드 밖에 못온다.
		void onClick();
	}
}

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 한다.");
	}
	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메시지를 보낸다.");
	}
	
}