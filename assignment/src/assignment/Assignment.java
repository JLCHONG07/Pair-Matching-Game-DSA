/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import GameObject.GameObjects;

import Level.LVL;

import Leaderboard.PromptBoard;
import static Level.LVL.noOfGameObject;
import Player.PromptPlayer;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Display main menu
        // With three selections: Start , Leaderboard, Quit
        MainDisplay();
        MainMenu();
    }

    public static void MainMenu() {
        // Start Module
        // Display main menu
        // With three selections: Start , Leaderboard, Quit
        GameObjects obj = new GameObjects();
        PromptPlayer player = new PromptPlayer();
        LVL difficulty = new LVL();

        // Start Module
        Scanner selection = new Scanner(System.in);
        int select;
        boolean valid1 = true;
        
        do{
            System.out.println("1. Start Game \n2. Leaderboard \n3. Quit");
            System.out.print("Please enter your choice (1 ~ 3) : ");
        
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
                
                valid2 = true;
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
            } else {
                System.out.println("Please enter integer only!!!\n");
                playerInput.next();
                valid2 = false;
            }
        } while (valid2 == false);

        
    }
    public static void PromptLBoard(){
        PromptBoard board= new PromptBoard();
        int selection;
        int boardSelect;
        boolean validSelection=true;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("+----------------+");
            System.out.println("1.Easy\n2.Medium\n3.Hard\n4.Back");
            System.out.println("+----------------+");
            System.out.print("Please enter your choice (1 ~ 4) : ");

            if (scan.hasNextInt())
            {
                 boardSelect=scan.nextInt();
                 switch(boardSelect)
                {
                    case 1:
                    {
                        board.displayBoard(1);
                        break;
                    }
                    case 2:
                    {
                        board.displayBoard(2);
                        break;
                    }
                    case 3:
                    {
                        board.displayBoard(3);
                        break;
                    }
                    case 4:
                    {
                        MainMenu();
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid selection. Please reenter.\n");
                        validSelection=false;
                        break;
                    }
                }
            }
            else if(!scan.hasNextInt()){
                System.out.println("Please enter integer only.\n");
                scan.next();
                validSelection = false;
            }     
        }while(validSelection!=true);       //validation
        
        validSelection=true;
        do
        {
            System.out.println("Press 1 to return to main menu.\nPress 2 to exit.");
            System.out.print("Selection : ");

            if (scan.hasNextInt())
            {
                selection=scan.nextInt();
                switch (selection)
                {
                    case 1:
                    {
                           MainMenu();
                           break;
                    }
                    case 2:
                    {
                        System.exit(0);
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid selection. Please Reenter.\n");
                        validSelection=false;
                    }
                }
            }
            else if (!scan.hasNextInt())
            {
                    System.out.println("Please enter integer only.\n");
                    scan.next();
                    validSelection=false;
            }
        }while(validSelection!=true);      
    }
    
    public static void MainDisplay()
    {
        System.out.println("+---------------------------------------------+");
        System.out.println("\t\tP  A  I  R ");
        System.out.println("\t  M  A  T  C  H  I  N  G");
        System.out.println("+---------------------------------------------+");
        System.out.println("\t\t  Welcome!\n");
    }
}
