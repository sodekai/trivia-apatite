
package com.adaptionsoft.games.trivia.runner;

import com.adaptionsoft.games.uglytrivia.Game;

import java.util.List;


public class GameRunner {

	public static List<String> outputs;
	private static boolean notAWinner;

	public static void main(int[] sequenceUne, int[] sequenceDeux) {
		Game aGame = new Game();
		
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");
		
		// Random rand = new Random();
		int i = 0;
		do {
			// aGame.roll(rand.nextInt(5) + 1);
			aGame.roll(sequenceDeux[i]);
			if (sequenceUne[i] == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}

			i++;
		} while (notAWinner);
		
	}
}
