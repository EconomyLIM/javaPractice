package days25;

public class Ex02 {
	
	enum Direction{EAST, SOUTH, WEST,NORH}
	
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		System.out.println(d1.name());
		System.out.println(d1.ordinal());
		Direction d2 = Direction.valueOf(d1.name());
		System.out.println(d2);
		switch (d2) {
		case EAST:
			break;
		case NORH:
			break;
		case SOUTH:
			break;
		case WEST:
			break;
		default:
			break;
		}
	}
}
