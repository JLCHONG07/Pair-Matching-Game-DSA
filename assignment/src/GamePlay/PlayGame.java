/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

/**
 *
 * @author SHATHIS
 */
public class PlayGame {

    private int round;
    private int score;

    public PlayGame(int round, int score) {
        this.round = round;
        this.score = score;
    }

   
    public void setRound(int round) {
        this.round = round;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

     public int getRound() {
        return round;
    }
    
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return round + " " + score;
    }
    
    

}
