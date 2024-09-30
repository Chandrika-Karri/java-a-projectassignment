package se.chandrika.dicegame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    void player1Winner() {
        Player player1 = new Player();
        player1.setName("Chandrika");
        player1.setScore(10);
        Player player2 = new Player();
        player2.setName("Ratna");
        player2.setScore(8);
        Player player = new Player();
        String result = player.winner(player1, player2);
        assertEquals("Chandrika", result, "Player1 is the winner");

    }

    @Test
    void player2Winner() {
        Player player1 = new Player();
        player1.setName("Chandrika");
        player1.setScore(8);
        Player player2 = new Player();
        player2.setName("Ratna");
        player2.setScore(12);
        Player player = new Player();
        String result = player.winner(player1, player2);
        assertEquals("Ratna", result, "Player2 is the winner");

    }

    @Test
    void BothWinners() {
        Player player1 = new Player();
        player1.setName("Chandrika");
        player1.setScore(10);
        Player player2 = new Player();
        player2.setName("Ratna");
        player2.setScore(10);
        Player player = new Player();
        String result = player.winner(player1, player2);
        assertEquals("Both got same score", result, "Both got same score");

    }

}