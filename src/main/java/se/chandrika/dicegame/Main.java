package se.chandrika.dicegame;

import java.util.Scanner;    //imports scanner and random pre-defined classes


public class Main {     //Main class starts

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Player player = new Player();

        String name1 = player.enterName(scanner, "Enter the name of the player1:");
        String name2 = player.enterName(scanner, "Enter the name of the player2:");

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        player1.rollMethod();
        player2.rollMethod();


        System.out.println("Winner is:::::" + player.winner(player1, player2));

        scanner.close();
    }


} //main class ends

