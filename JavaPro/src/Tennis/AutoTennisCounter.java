package Tennis;

import java.util.Random;

public class AutoTennisCounter {
	public static void main(String[] args) {
		int player1Score = 0;
		int player2Score = 0;

		Player p1 = new Player("임경재", "남자");
		Player p2 = new Player("고경림", "여자");

		Random random = new Random();

		while (true) {
			// Simulate a point being won by a random player
			int winningPlayer = random.nextInt(2) + 1; // 1 or 2
			
			if (winningPlayer == 1) {
				player1Score++;
			} else {
				player2Score++;
			}
			
			// Display current score
			System.out.println("Player 1: " + getScoreString(player1Score));
			System.out.println("Player 2: " + getScoreString(player2Score));

			if (getScoreString(player1Score) == "Advantage" || getScoreString(player2Score) == "Advantage") break;
			try {
				Thread.sleep(1000); // Adjust for desired update rate
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getScoreString(int score) {
		switch (score) {
		case 0:
			return "0";
		case 1:
			return "15";
		case 2:
			return "30";
		case 3:
			return "40";
		default:
			return "Advantage";
		}
	}
}