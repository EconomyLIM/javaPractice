package Tennis;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable{

	private static final long serialVersionUID = 1L;

	// ==============멤버 변수===========
	private String name;
	private String gender;
	int score;
	int point;
	int game;
	private int set;
	ArrayList<String> list;

	// ==============생성자=============
	public Player() {
		super();
	}

	public Player(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		//		this.score = score;
	}

	// ==============Getter, Setter=============
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	// ==============toString==================
	@Override
	public String toString() {
		return "Player [name=" + name + ", gender=" + gender + "]";
	}
	// ==============메서드===================

	public void plusScore() {
		this.score++;
	}



}
