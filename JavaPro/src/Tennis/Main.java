package Tennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Permissions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


import Tennis.*;
public class Main {
	// point를 구할 상수
	static int pointPlusA = 0;
	static int pointPlusB = 0;
	static int cha = 0;
	static int cntPoint = 0; // for문을 멈추기 위한 cnt 

	//game숫자를 구할 상수
	static int gamePlusA = 0;
	static int gamePlusB = 0;
	static int gameCha = 0;
	static int cntGame=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintTennisCounter.printFirst();

		String [] playerList = {"임경재", "고경림", "김정주", "김호영", "박민석", "유희진", "김호영"};
		ArrayList<String> listA = new ArrayList<String>();
		ArrayList<String> listB = new ArrayList<String>();

		Team teamA = null;
		Team teamB = null;;

		// =====================세트수 지정====================
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("(5세트)[1] / (3세트)[2] > "); //여기서 범위 지정 해주어야 함
		int selectsetCount = Integer.parseInt(br.readLine());
		int setCountNumber = setCount(selectsetCount);

		// =====================단식 복식 설정, 팀원 선택==================

		boolean isSingle = false;
		if(!isSingle) { // 단식이 아닐시 =복식일시
			listA.add(playerList[1]);
			listA.add(playerList[2]);
			teamA = new Team(listA);
			listB.add(playerList[3]);
			listB.add(playerList[4]);
			teamB = new Team(listB);
		}else { // 단식일시 
			listA.add(playerList[2]);
			teamA = new Team(listA);
			listB.add(playerList[4]);
			teamB = new Team(listB);
		}

		System.out.println(teamA);
		System.out.println(teamB);
		// =====================게임 시작 ======================

		for (int j = 0; ; j++) {
			for (int i = 0; ; i++) {
				int p = (int) (Math.random()*2 +1); // point = 1 or 2 // 1나오면 A팀승리
				System.out.println(p);
				if (p ==2) {
					PointWinner(teamA, p);
				}else {
					PointWinner(teamB, p);
				}

				System.out.println( "엔터치면 진행");
				System.in.read();
				System.in.skip(System.in.available());
				if (gamePlusA == 6 || gamePlusB == 6) {
					break;
				}
				
			} //for
			
			
		} //for
	}  //main

	private static void PointWinner(Team team, int p) throws IOException {
		//		final String[] points = {"0","15", "30", "40", "40A", "60"};
		//		String []pointA = Arrays.copyOf(points, points.length);
		//		String[] pointB = Arrays.copyOf(points, points.length);

		do {

			if (p == 1) {
				++pointPlusA;
				System.out.println("A팀 승리\t" + pointPlusA);
			}else {
				++pointPlusB;
				System.out.println("B팀 승리\t" + pointPlusB);
			}
			cha =Math.abs(pointPlusA - pointPlusB); // 절대값을 구하기 위한 함수
			if ( (( cha>=2 ) && (pointPlusA>4)) || ((pointPlusA == 4) && (cha>=2))) {
				System.out.println("A팀 승리 게임승리수 1증가");
				++cntPoint; // for문을 멈추기 위한 cnt 
				gameWinner("A");
				pointPlusA = pointPlusB = 0;
			}
			else if ( (( cha>=2 ) && (pointPlusB>4)) || (pointPlusB == 4 && (cha>=2)) ) {
				System.out.println("B팀 승리 게임승리수 1증가");
				++cntPoint;// for문을 멈추기 위한 cnt 
				gameWinner("B");
				pointPlusA = pointPlusB = 0;
			}

		} while (((( cha>=2 ) && (pointPlusB>4)) || (pointPlusB == 4) && (cha>=2) ) || ( (( cha>=2 ) && (pointPlusA>4)) || (pointPlusA == 4)  && (cha>=2)));

	} // PointWinner

	private static void gameWinner(String team) {
		do {
			if (team.equals("A")) {
				++gamePlusA;
				System.out.printf("%s : %d \n" ,"A팀의 게임 점수는", gamePlusA);
				System.out.printf("%s : %d \n" ,"B팀의 게임 점수는", gamePlusB);
			}else {
				++gamePlusB;
				System.out.printf("%s : %d \n" ,"A팀의 게임 점수는", gamePlusA);
				System.out.printf("%s : %d \n" ,"B팀의 게임 점수는", gamePlusB);
			}
		} while (gamePlusA==6 || gamePlusB==6);
		
		cntGame =1;
	}// gameWinner

	private static int setCount(int selectsetCount) {
		int m = selectsetCount==1 ? (m=5) : (m=3); // 세트수
		return m;
	} // playGame

} //Main

class Team{
	ArrayList<String> player;
	int score;

	public Team(ArrayList<String> player) {
		super();
		this.player = player;
	}

	public ArrayList<String> getPlayer() {
		return player;
	}

	public void setPlayer(ArrayList<String> player) {
		this.player = player;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void plusScore(ArrayList<String> player) {
		this.score++;
	}
	@Override
	public String toString() {
		return "Team [player=" + player + "]";
	}



} //Team