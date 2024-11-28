package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeTest {

    @Test
    public void true_is_true() throws Exception {

        // Arrange
        int[] sequenceUne = {
                6, 6, 6, 1, 3, 1, 6, 4, 1, 2, 4, 6, 1, 2, 3, 4, 2, 3, 1, 1, 6, 1, 6, 6,
                3, 4, 6, 4, 4, 2, 6, 4, 2, 5, 5, 4, 6, 4, 1, 6, 5, 5, 5, 5, 1, 2, 3, 3,
                4, 4
        };
        int[] sequenceDeux = {
                6, 9, 2, 4, 7, 0, 5, 1, 0, 2, 8, 4, 2, 3, 8, 1, 2, 5, 1, 7, 8, 4, 5, 7,
                8, 1, 3, 1, 9, 2, 9, 6, 2, 2, 1, 0, 2, 6, 1, 2, 8, 9, 7, 1, 3, 5, 2, 5,
                1, 3
        };

        String[] result = {
                "Chet was added",
                "They are player number 1",
                "Pat was added",
                "They are player number 2",
                "Sue was added",
                "They are player number 3",
                "Chet is the current player",
                "They have rolled a 6",
                "Chet's new location is 6",
                "The category is Sports",
                "Sports Question 0",
                "Answer was correct!!!!",
                "Chet now has 1 Gold Coins.",
                "Pat is the current player",
                "They have rolled a 6",
                "Pat's new location is 6",
                "The category is Sports",
                "Sports Question 1",
                "Answer was correct!!!!",
                "Pat now has 1 Gold Coins.",
                "Sue is the current player",
                "They have rolled a 6",
                "Sue's new location is 6",
                "The category is Sports",
                "Sports Question 2",
                "Answer was correct!!!!",
                "Sue now has 1 Gold Coins.",
                "Chet is the current player",
                "They have rolled a 1",
                "Chet's new location is 7",
                "The category is Rock",
                "Rock Question 0",
                "Answer was correct!!!!",
                "Chet now has 2 Gold Coins.",
                "Pat is the current player",
                "They have rolled a 3",
                "Pat's new location is 9",
                "The category is Science",
                "Science Question 0",
                "Question was incorrectly answered",
                "Pat was sent to the penalty box",
                "Sue is the current player",
                "They have rolled a 1",
                "Sue's new location is 7",
                "The category is Rock",
                "Rock Question 1",
                "Answer was correct!!!!",
                "Sue now has 2 Gold Coins.",
                "Chet is the current player",
                "They have rolled a 6",
                "Chet's new location is 1",
                "The category is Science",
                "Science Question 1",
                "Answer was correct!!!!",
                "Chet now has 3 Gold Coins.",
                "Pat is the current player",
                "They have rolled a 4",
                "Pat is not getting out of the penalty box",
                "Sue is the current player",
                "They have rolled a 1",
                "Sue's new location is 8",
                "The category is Pop",
                "Pop Question 0",
                "Answer was correct!!!!",
                "Sue now has 3 Gold Coins.",
                "Chet is the current player",
                "They have rolled a 2",
                "Chet's new location is 3",
                "The category is Rock",
                "Rock Question 2",
                "Answer was correct!!!!",
                "Chet now has 4 Gold Coins.",
                "Pat is the current player",
                "They have rolled a 4",
                "Pat is not getting out of the penalty box",
                "Sue is the current player",
                "They have rolled a 6",
                "Sue's new location is 2",
                "The category is Sports",
                "Sports Question 3",
                "Answer was correct!!!!",
                "Sue now has 4 Gold Coins.",
                "Chet is the current player",
                "They have rolled a 1",
                "Chet's new location is 4",
                "The category is Pop",
                "Pop Question 1",
                "Answer was correct!!!!",
                "Chet now has 5 Gold Coins.",
                "Pat is the current player",
                "They have rolled a 2",
                "Pat is not getting out of the penalty box",
                "Sue is the current player",
                "They have rolled a 3",
                "Sue's new location is 5",
                "The category is Science",
                "Science Question 2",
                "Answer was correct!!!!",
                "Sue now has 5 Gold Coins.",
                "Chet is the current player",
                "They have rolled a 4",
                "Chet's new location is 8",
                "The category is Pop",
                "Pop Question 2",
                "Answer was correct!!!!",
                "Chet now has 6 Gold Coins."
        };

        // Act
        GameRunner.main(sequenceUne, sequenceDeux);

        // Assert
        List<String> actualResult = GameRunner.outputs;

        // Vérifie chaque élément
        for (int i = 0; i < result.length; i++) {
            assertEquals("Mismatch at line " + i, result[i], actualResult.get(i));
        }
    }
}
