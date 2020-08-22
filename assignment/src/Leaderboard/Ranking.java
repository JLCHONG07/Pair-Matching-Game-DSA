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
public class Ranking {
    private String playerName;
    private int playerScore;
    private int levelId;

    public Ranking() {
    }

    public Ranking(String playerName, int playerScore, int levelId) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.levelId = levelId;
    }

    
    public int getLevelId() {
        return levelId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setLevelId(int levelId) {
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
        return  playerName + "\t" + playerScore + "\t" + levelId +"\n";
    }
    
    
    
    
    
}
