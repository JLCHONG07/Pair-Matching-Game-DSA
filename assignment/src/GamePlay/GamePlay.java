/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

import GameObject.ArrayList;
import GameObject.GameObject;
import GameObject.GameObjects;
import static GameObject.GameObjects.*;
import Level.LVL;
import static Level.LVL.*;
import Player.PromptPlayer;
import static Player.PromptPlayer.currentPlayer;
import static Player.PromptPlayer.highestScore;
import Leaderboard.PromptBoard;

import static assignment.Assignment.MainMenu;

import java.util.Scanner;

/**
 *
 * @author SHATHIS
 *
 */
public class GamePlay {

    String openDot = "'";
    String closeDot = "'";
    String TisObj = "This object is ";
    String objPaired = "";
    public static int totalRounds = 0;// changed base on level getRounds();
    int sum = 0;
    // int highestScore = 0;
    int currentScore = 0;
    int previousScore;
    public static int finalScore;
    public static int rounds = 1;
    public static int countingPair = 0;
    public static int totalScoresEarn = 0;
    public static int firstScore;
    public static int gameAmount = 1;
    PromptPlayer player = new PromptPlayer();
    PromptBoard pb = new PromptBoard();
    Scanner scan = new Scanner(System.in);

    public void gamePlay(ArrayList<GameObject> go) {

        int decisionConvert1 = 0;
        int decisionConvert2 = 0;
        String decision1;
        String decision2 = null;
        String obj1Choosed;
        String obj2Choosed;
        int totalScoresEarn = 0;
        boolean isChecked = true;

        System.out.println(go.toString());

        ScoreArrayStack<GamePlayy> score = new ScoreArrayStack<>();

        totalRounds = currentRounds;
        
        if (!score.isEmpty()) {
            score.clear();
        }

        score.push(new GamePlayy(currentRounds, currentLvlScore));

        highestScore = player.highestScore();
        System.out.println("Your Highest Scores : " + highestScore + "\n");
        System.out.println("Your Current Scores : " + currentScore + "\n");
        System.out.print("Round :" + rounds + "/" + score.pop().getRound());

        System.out.print("\n\nObjects You Have Paired : " + objPaired);

        System.out.print("\n\nObj 1 :");

        do {
            if (isChecked == false) {
                System.out.print("\n\nEnter Obj 1 Again :");
            }
            decision1 = scan.nextLine();
            isChecked = inputCheck(decision1);
        } while (isChecked == false);

        decisionConvert1 = Integer.parseInt(decision1);
        while (go.getEntry(decisionConvert1).getIsPairs() == true) {
            System.out.print("\n\nThis object has been added before! :");
            System.out.print("\n\nPlease Enter Obj 1 Again :");
            decision1 = scan.nextLine();

            decisionConvert1 = Integer.parseInt(decision1);
        }
        System.out.print(openDot + TisObj + go.getEntry(decisionConvert1).getDescription() + closeDot + "\n");
        obj1Choosed = go.getEntry(decisionConvert1).getObjID();

        System.out.print("\n\nObj 2 :");

        do {
            if (isChecked == false) {
                System.out.print("\n\nEnter Obj 2 Again :");
            }
            decision2 = scan.nextLine();
            isChecked = inputCheck(decision2);
        } while (isChecked == false);

        decisionConvert2 = Integer.parseInt(decision2);

        while (go.getEntry(decisionConvert2).getIsPairs() == true || decision2.equals(decision1)) {
            if (go.getEntry(decisionConvert2).getIsPairs() == true) {
                System.out.print("\n\nThis object has been added before! :");
                System.out.print("\n\nPlease Enter Obj 2 Again :");
                do {
                    if (isChecked == false) {
                        System.out.print("\n\nEnter Obj 2 Again :");
                    }
                    decision2 = scan.nextLine();
                    isChecked = inputCheck(decision2);
                    
                } while (isChecked == false);
                  decisionConvert2 = Integer.parseInt(decision2);
            } else {
                System.out.print("\n\nThis object is choosed in obj1 ! :");

                do {

                    if (isChecked == false) {
                        System.out.print("\n\nEnter Obj 2 Again :");
                    }
                    System.out.print("\n\nPlease Enter Obj 2 Again :");
                    decision2 = scan.nextLine();
                    isChecked = inputCheck(decision2);

                } while (isChecked == false);
            }
              decisionConvert2 = Integer.parseInt(decision2);

        }
      

        System.out.print(openDot + TisObj + go.getEntry(decisionConvert2).getDescription() + closeDot + "\n\n");
        obj2Choosed = go.getEntry(decisionConvert2).getObjID();
        rounds++;
        if (obj1Choosed.equals(obj2Choosed)) {

            System.out.print("\nResults : Both object choosed are Pair!\n\n");

            objPaired += go.getEntry(decisionConvert1).getDisplayName() + "\t"
                    + go.getEntry(decisionConvert2).getDisplayName() + "\t";

            countingPair++;

            go.getEntry(decisionConvert1).setIsPairs(true);
            go.getEntry(decisionConvert2).setIsPairs(true);

            score.push(new GamePlayy(currentRounds, currentLvlScore));
            while (!score.isEmpty()) {
                sum += score.pop().getScore();
                currentScore = sum;
            }
            System.out.println("Current Score Updated : " + currentScore);

            if (currentScore > highestScore) {
                highestScore = currentScore;
                player.saveTotalResults(highestScore);
                System.out.println("Highest Score Updated : " + highestScore);
            }

        } else {
            System.out.print("Result: Both object choosed are not Pair!\n\n");

            System.out.println("\nCurrent Score Remainded : " + sum + "\n\n");

        }
        if (rounds > totalRounds) {
            totalScoresEarn = currentScore;
            System.out.print("You have found " + countingPair + " pairs of objects\n");
            System.out.print("Current Scores is:" + currentScore + "\n");
            System.out.print("Your Bonus is :  0" + "\n");
            System.out.print("Your Total Scores earned : " + totalScoresEarn + "\n");
            gamePlayleft = false;
            sum = 0;
            if (totalScoresEarn > highestScore) {
                pb.levelTracker(totalScoresEarn);
            }
            Again(totalScoresEarn);

        } else if (countingPair == max) {
            int bonus = 0;
            bonus = (totalRounds - (rounds - 1)) * 10;
            totalScoresEarn = bonus + currentScore;// or highestScore
            System.out.print("Congratulation you have found all the pairs!\n");
            System.out.print("Current Scores is : " + currentScore + "\n");
            System.out.print("Your Bonus is :  " + bonus + "\n");
            System.out.print("Your Total Scores earned : " + totalScoresEarn + "\n");
            gamePlayleft = false;
            sum = 0;
            if (totalScoresEarn > highestScore) {
                pb.levelTracker(totalScoresEarn);
            }
            Again(totalScoresEarn);

        }
        pressAnyKeyToContinue();

    }

    private void pressAnyKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            scan.nextLine();

        } catch (Exception e) {
        }
    }

    public void Again(int score) {
        GameObjects obj = new GameObjects();
        LVL difficulty = new LVL();
        Scanner scan = new Scanner(System.in);
        PromptPlayer player = new PromptPlayer();

        rounds = 1;
        countingPair = 0;
        gamePlayleft = true;
        totalScoresEarn = 0;
        player.saveTotalResults(score);
        System.out.print("GAME OVER !\n");
        System.out.println("Play Again? (Y/N) : ");
        char choice = scan.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            difficulty.LevelDecision();
            obj.randomObj(noOfGameObject);
        } 
        do{
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Invalid input! Enter again : ");
        char choice2 = scan2.next().charAt(0);   
        if ((choice2 == 'N' || choice2 == 'n')) {
            MainMenu();
        }
        }while(choice != 'N' || choice != 'n');
    }

    public boolean inputCheck(String decision) {
        boolean isBool = true;
        int tempDecision;
        if (decision.isEmpty()) {
            System.out.print("\nPlease enter a valid input ! ");
            isBool = false;
        } else {
            if ((decision.matches("^[a-zA-Z]*$"))) {
                System.out.println("\nPlease enter number !");
                isBool = false;
            } else {
                tempDecision = Integer.parseInt(decision);
                if (tempDecision < 1) {
                    System.out.print("\nPlease enter valid choice !");
                    isBool = false;
                    return isBool;
                }
                switch (currentLevel) {
                    case "L01":
                        if (tempDecision >= 9) {
                            System.out.print("\nPlease enter valid choice !");
                            isBool = false;
                        }
                        break;
                    case "L02":
                        if (tempDecision >= 13) {
                            System.out.print("\nPlease enter valid choice !");
                            isBool = false;
                        }
                        break;
                    case "L03":
                        if (tempDecision >= 17) {
                            System.out.print("\nPlease enter valid choice !");
                            isBool = false;
                        }
                        break;
                    default:
                        isBool = true;
                        break;
                }
            }
        }
        return isBool;
    }
}

