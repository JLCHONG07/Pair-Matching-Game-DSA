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

import static GameObject.GameObject.*;
import static GamePlay.GamePlay.countingPair;
import static GamePlay.GamePlay.rounds;

import Level.LVL;

import static GamePlay.GamePlay.totalRounds;
import Leaderboard.PromptBoard;
import static Level.LVL.noOfGameObject;
import Level.Level;
import Player.Player;
import Player.PromptPlayer;
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
 //   public static int noOfGameObject = 0;// change base on level

    public static void main(String[] args) {
        // Display main menu
        // With three selections: Start , Leaderboard, Quit
        MainMenu();
    }

    public static void MainMenu() {
        // Start Module
        // Display main menu
        // With three selections: Start , Leaderboard, Quit
        GameObject obj = new GameObject();
        PromptPlayer player = new PromptPlayer();
        LVL difficulty = new LVL();

        // game.randomObj(noOfGameObject);
        // Start Module
        Scanner selection = new Scanner(System.in);
        int select;
        do{
            System.out.println("1. Start Game \n2. Leaderboard \n3. Quit");
            System.out.print("Select your choice : ");
            select = selection.nextInt();
            if(select >= 4 || select == 0) {
                System.out.println("Invalid selection ! Please select again.\n");
            }
        }while(select >=4 || select == 0);

        switch (select) {
            case 1: {
                PromptPlayerInput();
                    difficulty.noOfObj();
                obj.randomObj(noOfGameObject);
                break;
            }
            case 2: {
                System.out.println("In progress!!");
                break;
            }
            case 3: {
                System.exit(0);
            }
        }
    }

    public static void Again(int score) {
        GameObject obj = new GameObject();
        LVL difficulty = new LVL();
        Scanner scan = new Scanner(System.in);
        PromptPlayer player = new PromptPlayer();
        
        objNo = 0;
        rounds = 1;
        countingPair = 0;
        gamePlayleft = true;
        
        player.saveTotalResults(score);
        System.out.print("GAME OVER !\n");
        System.out.println("Play Again? (Y/N) : ");
        char choice = scan.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            // go.clear();
            // again = true;
            
                 difficulty.noOfObj();
               obj.randomObj(noOfGameObject);
            // countingPair=0;
        } else {
            MainMenu();
        }

    }

    public static void PromptPlayerInput() {
        int playerSelect;
        PromptPlayer player = new PromptPlayer();

        Scanner playerInput = new Scanner(System.in);

        do {
            System.out.println("\n+----------------+");
            System.out.println("|1. New Game     |");
            System.out.println("|2. Load Game    |");
            System.out.println("|3. Back         |");
            System.out.println("+----------------+");

            System.out.println("Please enter your choice (1 ~ 3)");
            playerSelect = playerInput.nextInt();

            if (playerSelect >= 4 || playerSelect == 0) {
                System.out.println("Invalid selection! Please select again.");
            }
        } while (playerSelect >= 4 || playerSelect == 0);

        switch (playerSelect) {
            case 1:
                player.NewPlayer();
                break;
            case 2:
                player.ExistingPlayer();
                break;
            case 3:
                MainMenu();
                break;
        }
    }
    public static void PromptLBoard(){
        PromptBoard board= new PromptBoard();
        int selection;
        
        System.out.println("+-----------------------------------+\n");
        System.out.println("\tLeaderBoard\n");
        System.out.println("+-----------------------------------+\n");
        System.out.println("Rank\tName\t\tScore\tLevel");
        board.displayBoard();
        System.out.println("Press 1 to return to main menu.\n");
        Scanner scan=new Scanner(System.in);
        selection=scan.nextInt();
        
        if (selection==1)
        {      
            MainMenu();
        } 
    }
}
