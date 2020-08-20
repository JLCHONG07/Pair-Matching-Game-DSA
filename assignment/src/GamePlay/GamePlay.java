/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

import GameObject.ArrayList;
import GameObject.GameObj;
import GameObject.GameObject;
import static GameObject.GameObject.again;
import static GameObject.GameObject.*;

import java.util.Scanner;

/**
 *
 * @author Santhi
 *
 */
public class GamePlay {

    String openDot = "'";
    String closeDot = "'";
    String TisObj = "This object is ";
    String objPaired = "";
    public static int totalRounds = 2;//changed base on level getRounds();
    int sum = 0;
    int highestScore = 0;
    int currentScore = 0;
    public static int rounds = 1;
    public static int countingPair = 0;
//   GameObject gameObject1=new GameObject();

    public void gamePlay(ArrayList<GameObj> go) {

        int decisionConvert;
        String decision1;
        String decision2;
        String obj1Choosed;
        String obj2Choosed;
        char choice;
        int level;

        //  int rounds=1;
        System.out.println(go.toString());

        ScoreArrayStack score = new ScoreArrayStack();

        //  do{
        //     Scanner input = new Scanner(System.in);
        // System.out.println("Select Level Difficulty (1(Easy = 8 Rounds), 2(Normal = 6 Rounds), 3(Hard = 4 Rounds): ");
        //    level = input.nextInt();
        /*
            switch (level) {
                case 1:
                    for(int i = 1; i <= 8; i++){
         */
        if (!score.isEmpty()) {
            score.clear();
        }
        /*
                        System.out.println("\tPair Matching Game (Here are your objects to pair)");
                        System.out.println("==================================================================");
                        System.out.println("01 02 03 04 05 06 07 08\n");
                        
         */
        System.out.print("Your Highest Scores : " + highestScore + "\n\n");
        System.out.print("Current Scores:" + currentScore + "\n\n");;
        System.out.print("Round :" + rounds + "/" + totalRounds);
        System.out.print("\n\nObjects You Have Paired : " + objPaired);
        System.out.print("\n\nObj 1 :");

        //1st choice validation
        do{
        Scanner scan = new Scanner(System.in);
        decision1 = scan.nextLine();
        
        if(!"01".equals(decision1)&&!"02".equals(decision1)&&!"03".equals(decision1)&&!"04".equals(decision1)&&!"05".equals(decision1)&&!"06".equals(decision1)&&!"07".equals(decision1)&&!"08".equals(decision1)){
           System.out.print("Invalid Choice! Please enter again\n\n");
        }
        System.out.print("\nObj 1 : ");
        
        }while(!"01".equals(decision1)&&!"02".equals(decision1)&&!"03".equals(decision1)&&!"04".equals(decision1)&&!"05".equals(decision1)&&!"06".equals(decision1)&&!"07".equals(decision1)&&!"08".equals(decision1));
        decisionConvert = Integer.parseInt(decision1);

        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
        obj1Choosed = go.getEntry(decisionConvert).getObjID();
        
        System.out.print("\nObj 2 :");
        
        //2nd choice validation
        do{
        Scanner scan = new Scanner(System.in);
        decision2 = scan.nextLine();
        
        if(!"01".equals(decision2)&&!"02".equals(decision2)&&!"03".equals(decision2)&&!"04".equals(decision2)&&!"05".equals(decision2)&&!"06".equals(decision2)&&!"07".equals(decision2)&&!"08".equals(decision2)){
           System.out.print("Invalid Choice! Please enter again\n\n");
        }
        System.out.print("\nObj 2 : ");
        
        }while(!"01".equals(decision2)&&!"02".equals(decision2)&&!"03".equals(decision2)&&!"04".equals(decision2)&&!"05".equals(decision2)&&!"06".equals(decision2)&&!"07".equals(decision2)&&!"08".equals(decision2));
        
        decisionConvert = Integer.parseInt(decision2);

        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n\n");
        obj2Choosed = go.getEntry(decisionConvert).getObjID();
        rounds++;
        if (obj1Choosed.equals(obj2Choosed)) {

            System.out.print("\nResults : Both object choosed are Pair!\n\n");

            objPaired += decision1 + "\t" + decision2 + "\t";

            //       System.out.print("Objects That you have paired : " + objPaired + "\n");//debug use oni
            countingPair++;

            score.push(10);
            while (score.size() > 0) {
                sum += score.pop();
                currentScore = sum;
            }
            System.out.println("Current Score Updated : " + currentScore);
            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
            System.out.println("Highest Score Updated : " + highestScore);

        } else {
            System.out.print("Result: Both object choosed are not Pair!\n\n");

            score.push(0);
            while (score.size() > 0) {
                sum += score.pop();
                currentScore = sum;
            }
            System.out.println("\nCurrent Score Remainded : " + sum + "\n\n");

        }
        if (rounds > totalRounds) {
            gamePlayleft = false;
            sum = 0;

        }

        //       }            break;
        /*
                case 2:
                    for(int i = 1; i <= 6; i++){
                        score.clear();
                        System.out.println("\tPair Matching Game (Here are your objects to pair)");
                        System.out.println("==================================================================");
                        System.out.println("01 02 03 04 05 06 07 08\n");
                        System.out.println("\t09 10 11 12\n");
                        
                        System.out.print("\nObjects You Have Paired : " + objPaired);
                        System.out.print("\nObj 1 :");
                        
                        Scanner scan = new Scanner(System.in);
                        decision1 = scan.nextLine();
                        decisionConvert = Integer.parseInt(decision1);
                        
                        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
                        obj1Choosed = go.getEntry(decisionConvert).getObjID();
                        
                        
                        System.out.print("\nObj 2 :");
                        decision2 = scan.nextLine();
                        decisionConvert = Integer.parseInt(decision2);
                        
                        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
                        obj2Choosed = go.getEntry(decisionConvert).getObjID();
                        
                        
                        if (obj1Choosed.equals(obj2Choosed)) {
                            
                            System.out.print("\nResults : Both object choosed are Pair!\n");
                            
                            objPaired += decision1 + "\t" + decision2 + "\t";
                            
                            System.out.print("Objects That you have paired : " + objPaired + "\n");
                            countingPair++;
                            
                            score.push(10);
                            while(score.size() > 0) sum += score.pop();
                            System.out.println("Score Updated : " + sum);
                            
                        } else if(!obj1Choosed.equals(obj2Choosed)) {
                            System.out.print("Result: Both object choosed are not Pair!\n");
                            
                            score.push(0);
                            while(score.size() > 0) sum += score.pop();
                            System.out.println("Score Updated : " + sum);
                        }
                        
                    }            break;
                case 3:
                    for(int i = 1; i <= 4; i++){
                        if(score.isEmpty()){
                            score.clear();
                        }
                        System.out.println("\tPair Matching Game (Here are your objects to pair)");
                        System.out.println("==================================================================");
                        System.out.println("01 02 03 04 05 06 07 08\n");
                        System.out.println("09 10 11 12 13 14 15 16\n");
                        
                        System.out.print("\nObjects You Have Paired : " + objPaired);
                        System.out.print("\nObj 1 :");
                        
                        Scanner scan = new Scanner(System.in);
                        decision1 = scan.nextLine();
                        decisionConvert = Integer.parseInt(decision1);
                        
                        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
                        obj1Choosed = go.getEntry(decisionConvert).getObjID();
                        
                        
                        System.out.print("\nObj 2 :");
                        decision2 = scan.nextLine();
                        decisionConvert = Integer.parseInt(decision2);
                        
                        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
                        obj2Choosed = go.getEntry(decisionConvert).getObjID();
                        
                        
                        if (obj1Choosed.equals(obj2Choosed)) {
                            
                            System.out.print("\nResults : Both object choosed are Pair!\n");
                            
                            objPaired += decision1 + "\t" + decision2 + "\t";
                            
                            System.out.print("Objects That you have paired : " + objPaired + "\n");
                            countingPair++;
                            
                            score.push(10);
                            while(score.size() > 0) sum += score.pop();
                            System.out.println("Score Updated : " + sum);
                            
                        } else if(!obj1Choosed.equals(obj2Choosed)) {
                            System.out.print("Result: Both object choosed are not Pair!\n");
                            
                            score.push(0);
                            while(score.size() > 0) sum += score.pop();
                            System.out.println("Score Updated : " + sum);
                        }
                        
                    }            break;
                default:
                    break;
            }
         */
 /*
        if (countingPair == 2 || rounds > totalRounds) {
            //  Scanner scan = new Scanner(System.in);
            System.out.println("Game Over\n");
            System.out.println("Play Again? (Y/N) : ");
            choice = scan.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                go.clear();
                again = true;
                rounds = 0;
                count1 = 1;
                count2 = 1;
                count3 = 1;
                count4 = 1;
                count5 = 1;
                count6 = 1;
                count7 = 1;
                count8 = 1;
                //      gameObject1. randomObj(countingPair);
                //  countingPair=0;

            }

            //   }
            //   }while(choice == 'Y' || choice == 'y');
        }
         */
    }
}
