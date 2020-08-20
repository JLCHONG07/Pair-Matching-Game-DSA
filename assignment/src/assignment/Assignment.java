/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import GameObject.ArrayList;
import GameObject.GameObj;
import java.util.Comparator;

import GameObject.GameObject;
import static GameObject.GameObject.again;
import static GameObject.GameObject.countingPair;
import static GameObject.GameObject.rounds;
import static GamePlay.GamePlay.totalRounds;
import collections.LinkedList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    static int noOfGameObject = 4;// change base on level

    public static void main(String[] args) {
        // Display main menu
        // With three selections: Start , Leaderboard, Quit

        // Start Module
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
                Again();
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

    public static void Again() {
        GameObject obj = new GameObject();

        ArrayList<GameObj> go = new ArrayList<GameObj>();
        if (countingPair == 2 || rounds > totalRounds) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Game Over\n");
            System.out.println("Play Again? (Y/N) : ");
            char choice = scan.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                go.clear();
                //    again = true;
                   rounds = 0;
                obj.randomObj(noOfGameObject);
                //  countingPair=0;

            }

        }

    }
}
