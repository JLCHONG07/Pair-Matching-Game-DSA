/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;


/**
 *
 * @author GeeLoong
 * 
 */
public class LeaderBoard implements Comparable<LeaderBoard> {
    private String playerName;
    private int playerScore;
    private String levelId;
    public LeaderBoard() {
    }

    public LeaderBoard(String playerName, int playerScore, String levelId) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.levelId = levelId;
    }



    
    public String getLevelId() {
        return levelId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

  
    @Override
    public String toString() {
       
            return  playerName + "\t\t\t" + playerScore +"\n";
        
    }

    @Override
   public int compareTo(LeaderBoard r) {
       
       int compareScore=((LeaderBoard)r).getPlayerScore();
		//0 = same
            //not 0 = not same
		return compareScore-this.playerScore;//descending record score
	}
   
}
