/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import GameObject.ArrayList;
import GameObject.GameObject;
import java.util.Comparator;

import GameObject.GameObjects;
import static GameObject.GameObjects.again;
import static GameObject.GameObjects.*;
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
        GameObjects obj = new GameObjects();
        PromptPlayer player = new PromptPlayer();
        LVL difficulty = new LVL();

        // game.randomObj(noOfGameObject);
        // Start Module
        Scanner selection = new Scanner(System.in);
        int select;
        boolean valid1 = true;
        
        do{
            System.out.println("1. Start Game \n2. Leaderboard \n3. Quit");
        
            if(selection.hasNextInt()){
            select = selection.nextInt();
                
            switch (select) {
                case 1: {
                    PromptPlayerInput();
                    difficulty.LevelDecision();
                    obj.randomObj(noOfGameObject);
                    break;
                }
                case 2: {
                    PromptLBoard();
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Input!!! Please Enter Again.");
                    valid1 = false;
                    break;
                }
                }         
            }
            else if(!selection.hasNextInt()){
                System.out.println("Please enter integer only!!!\n");
                selection.next();
                valid1 = false;
            }
        }while(valid1 != true);
        
    }



    public static void PromptPlayerInput() {
        int playerSelect;
        boolean valid2 = true;
        PromptPlayer player = new PromptPlayer();

        Scanner playerInput = new Scanner(System.in);

        do {
            System.out.println("\n+----------------+");
            System.out.println("|1. New Game     |");
            System.out.println("|2. Load Game    |");
            System.out.println("|3. Back         |");
            System.out.println("+----------------+");

            System.out.print("Please enter your choice (1 ~ 3) : ");
            
            if(playerInput.hasNextInt()){
                playerSelect = playerInput.nextInt();
                
                switch (playerSelect) {
                    case 1:{
                        player.NewPlayer();
                        break;
                    }
                        
                    case 2:{
                        player.ExistingPlayer();
                        break;
                    }
                        
                    case 3:{
                        MainMenu();
                        break;
                    }
                        
                    default: {
                        System.out.println("Invalid Input!!! Please Enter Again.");
                        valid2 = false;
                        break;
                    }
                }
            }
            else if(!playerInput.hasNextInt()){
                System.out.println("Please enter integer only!!!\n");
                playerInput.next();
                valid2 = false;
            }
        } while (valid2 != true);

        
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
