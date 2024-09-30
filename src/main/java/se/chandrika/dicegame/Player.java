package se.chandrika.dicegame;

import java.util.Random;  //Import random pre-defined class
import java.util.Scanner;

public class Player {     //players class starts


    private String name;
    private int score;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        //Constructor

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String enterName(Scanner scanner, String display) {
        System.out.println(display);
        return scanner.next();

    }

    public void rollMethod() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        int roll1 = random.nextInt(6) + 1;
        System.out.println(name + " " + "kastade: " + roll + " " + roll1);
        score = roll + roll1;
        System.out.println(name + " " + "Final Score: " + " " + score);
    }

    public String winner(Player player1, Player player2) {
        if (player1.getScore() > player2.getScore()) {
            return player1.getName();
        } else if (player1.getScore() < player2.getScore()) {
            return player2.getName();
        } else {
            return "Both got same score";
        }
    }
}  //players class ends
