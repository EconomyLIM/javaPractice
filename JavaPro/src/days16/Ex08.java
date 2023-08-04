package days16;

public class Ex08 {
	public static void main(String[] args) {

	} // main
} //class Ex08

interface Movable{

	void move(int x, int y); // publcic abstract
	/*
	 * 1. 상수
	 * 2. 추상메소드
	 * 3. static
	 * 4. default
	 */
} // Movable

interface Attackable{
	void attack(Unit unit);
} // Attackable
//인터페이스 끼리 상속도 가능하고 다중상속도 가능
interface Fightable extends Attackable, Movable{

} //Fightable

abstract class Unit{
	int currentHp;
	int x;
	int y;
} //class Unit

class AirUnit extends Unit{

} // class AirUnit

class GroundUnit extends Unit{

} // class GroundUnit

class Fighter implements Fightable{
	@Override
	public void attack(Unit unit) {}
	@Override
	public void move(int x, int y) {}
} //Fighter


// 수리가 가능한 유닛
// 상수x 추상메서드x
interface Repairable{} // Repairable

class Tank extends GroundUnit implements Fightable, Repairable{
	@Override
	public void attack(Unit unit) {}
	@Override
	public void move(int x, int y) {}
} //GroundUnit


// 수리 가능 : Repairable 인터페이스를 구현한 클래스 : Tank, SCV
// 수리 불가 : Repairable 인터페이스를 구현안한 클래스 : FIGHTER


class SCV extends GroundUnit implements Repairable{
	SCV(){}
	//건물 짓기 메서드
	// 다른 유닛 수리하는 메서드
	
	void repair(Repairable unit) { 
		if (unit instanceof Tank) {
			// 탱크 수리
		}
		else if (unit instanceof SCV){
			// scv 수리 코딩
		} 
		else if (unit instanceof DropShip){
			// DropShip 수리 코딩
		}// else if
	} //repair
} // class SCV

class DropShip extends AirUnit implements Fightable{
	@Override
	public void attack(Unit unit) {}
	@Override
	public void move(int x, int y) {}
	
} //DropShip

















