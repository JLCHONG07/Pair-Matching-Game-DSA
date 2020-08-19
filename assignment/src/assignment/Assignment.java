/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import collections.*;
import java.util.Comparator;

import GameObject.GameObject;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    static int noOfGameObject = 16;// change base on level

    public static void main(String[] args) {
        // Display main menu
        // With three selections: Start , Leaderboard, Quit

        // Start Module
        Scanner selection = new Scanner(System.in);
        System.out.println("1. Start Game \n2.Leaderboard \n3. Quit");
        int select = selection.nextInt();

        switch (select) {
            case 1: {
                System.out.println("In progress!!");
                break;
            }
            case 2: {
                System.out.println("In progress!!");
                break;
            }
            case 3: {
                return;
            }
            default: {
                System.out.println("Invalid Selection. The game will now exit");
                System.exit(0);

            }
        }

        // Display main menu
        // With three selections: Start , Leaderboard, Quit
        GameObject obj = new GameObject();

        // game.randomObj(noOfGameObject);
        // Start Module
        Scanner selection = new Scanner(System.in);
        System.out.println("1. Start Game \n2.Leaderboard \n3. Quit");
        int select = selection.nextInt();

        switch (select) {
            case 1: {
                obj.randomObj(noOfGameObject);

                System.out.println("In progress!");

                break;
            }
            case 2: {
                System.out.println("In progress!!");
                break;
            }
            case 3: {
                return;
            }
            default: {
                System.out.println("Invalid Selection. The game will now exit");
                System.exit(0);

            }
        }

    }

    public static void promptPlayerInput() {
        int playerNo = 1;
        Scanner playerInput = new Scanner(System.in);
        LinkedList<Player> playerLinkedList = new LinkedList<>();
        String currentPlayer = null;
        int currentScore = 0;

        playerLinkedList.add(new Player("John", 0));

        System.out.println("Player " + playerNo);
        System.out.print("Please enter your name :");
        String playerName = playerInput.next();
        playerLinkedList.add(new Player(playerName, 0));

        playerLinkedList.show();

        for (int index = 0; index < playerLinkedList.length(); index++) {
            if (playerLinkedList.get(index).getPlayerName().equals(playerName)) {
                currentPlayer = playerLinkedList.get(index).getPlayerName();
                currentScore = playerLinkedList.get(index).getPlayerScore();
            }
        }

        System.out.println(currentPlayer);
        System.out.println(currentScore);
    }
}
