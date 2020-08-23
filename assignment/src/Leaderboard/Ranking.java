/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;


/**
 *
 * @author USER
 */
public class Ranking implements Comparable<Ranking> {
    private String playerName;
    private int playerScore;
    private String levelId;
    private int count=0;
    private int rank=0;
    public Ranking() {
    }

    public Ranking(String playerName, int playerScore, String levelId) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.levelId = levelId;
        count++;
        setRank(count);
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
    public void setRank(int rank){
        this.rank=rank;
    
    }
    public int getRank(){
        return this.rank;
    
    }

  
    public String toString() {
       
            return  getRank()+"\t"+playerName + "\t\t" + playerScore + "\t" + levelId +"\n";
        
    }
        

    @Override
   public int compareTo(Ranking r) {
		//0 = same
            //not 0 = not same
		return playerScore-r.playerScore;
	}
   
}
