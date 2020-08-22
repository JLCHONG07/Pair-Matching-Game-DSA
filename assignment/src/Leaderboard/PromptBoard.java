/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

import static Level.LVL.currentLevel;
import static Player.PromptPlayer.*;

/**
 *
 * @author USER
 */
public class PromptBoard {
    String winnerName;
    int winnerScore;
    String levelType;
    
    public void displayBoard()
    {
        //display the board with players and scores
         SortedArrayListInterface <Ranking> recordList = new SortedArrayList<Ranking>();
        SortedArrayListInterface <Ranking> easyBoard = new SortedArrayList<Ranking>();
         SortedArrayListInterface <Ranking> mediumBoard = new SortedArrayList<Ranking>();
          SortedArrayListInterface <Ranking> hardBoard = new SortedArrayList<Ranking>();
          

          
        //get user name and scores
        switch(currentLevel)
        {
            case "L01":
            {
                    levelType="Easy";
                    break;
            }
            case "L02":
            {
                levelType="Medium";
                break;
            }
            case "L03":
            {
                levelType="Hard";
                break;
            }
        }
  for(int i=0;i<5;i++)
        {            
           recordList.add(i,new Ranking(currentPlayer,highestScore,levelType));
        }
        
        for(int i=0;i<5;i++)
        { 
            
                 System.out.println((i+1)+"\t"+currentPlayer+"\t\t"+highestScore+"\t"+levelType);
        }
    }
}
