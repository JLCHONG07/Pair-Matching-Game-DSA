/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

import static GamePlay.GamePlay.easyRecord;
import static GamePlay.GamePlay.mediumRecord;
import static GamePlay.GamePlay.hardRecord;
import static GamePlay.GamePlay.recordList;
import static Level.LVL.currentLevel;
import static Player.PromptPlayer.*;

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
        System.out.println("+-----------------------------------+\n");
        System.out.println("\tLeaderBoard\n");
        System.out.println("+-----------------------------------+\n");
        System.out.println("Rank\tName\t\tScore\tLevel");
        
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
        System.out.println("=========================");
        System.out.println(easyRecord.toString());
        System.out.println("=========================");
    }
    public void mediumBoard()
    {
        System.out.println("=========================");
        System.out.println(mediumRecord.toString());
        System.out.println("=========================");
    }
    public void hardBoard()
    {
        System.out.println("=========================\n");
        System.out.println(hardRecord.toString());
        System.out.println("=========================");
    }
}
