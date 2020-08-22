/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

import Player.PromptPlayer;
import static Player.PromptPlayer.*;

/**
 *
 * @author USER
 */
public class PromptBoard {
    String winnerName;
    int winnerScore;
    int winnerId;
    
    public void displayBoard()
    {
        //display the board with players and scores
        SortedArrayListInterface <Ranking> recordList = new SortedArrayList<Ranking>();
        
        //get user name and scores
        winnerName=currentPlayer;
        recordList.add(new Ranking(winnerName,50,2));
        
        System.out.println();
    }
}
