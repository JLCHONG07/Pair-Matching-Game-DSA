/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

import static GamePlay.GamePlay.easyRecord;
import static GamePlay.GamePlay.mediumRecord;
import static GamePlay.GamePlay.hardRecord;

/**
 *
 * @author GeeLoong
 */
public class PromptBoard {

    String winnerName;
    int winnerScore;
    String levelType;

    public void displayBoard(int level) {

        //get user name and scores
        System.out.println("+-----------------------------------------+");
        System.out.println("\t\tLeaderBoard");
        System.out.println("+-----------------------------------------+");
        System.out.println("Rank\tName\t\t\tScore");
        
        switch(level)
        {
            case 1:
            {
                easyBoard();
                break;
            }
            case 2:
            {
                mediumBoard();
                break;
            }
            case 3:
            {
                hardBoard();
                break;
            }
        }
       // recordList.add(new Ranking(currentPlayer, totalScoresEarn, levelType));
    //    System.out.print(recordList.length());
    }
    public void easyBoard()
    {
        System.out.println("==========================================");
        if(!easyRecord.isEmpty())
        {
             System.out.println(easyRecord.toString());
             System.out.println("==========================================");
        }
        else
        {
            System.out.println("No record yet......\n");
            System.out.println("==========================================");
        }
    }
    public void mediumBoard()
    {
        System.out.println("==========================================");
        if(!mediumRecord.isEmpty())
        {
             System.out.println(mediumRecord.toString());
             System.out.println("==========================================");
        }
        else
        {
            System.out.println("No record yet......");
            System.out.println("==========================================");
        }
    }
    public void hardBoard()
    {
        System.out.println("==========================================");
        if(!hardRecord.isEmpty())
        {
             System.out.println(hardRecord.toString());
             System.out.println("==========================================");
        }
        else
        {
            System.out.println("No record yet......");
            System.out.println("==========================================");
        }
    }
}
