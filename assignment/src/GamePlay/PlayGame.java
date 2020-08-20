/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

/**
 *
 * @author Santhi
 */
public class PlayGame {

int round;
int level;
int score;

    public PlayGame(int round, int level, int score) {
        this.round = round;
        this.level = level;
        this.score = score;
    }

   
    public void setRound(int round) {
        this.round = round;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

     public int getRound() {
        return round;
    }

    public int getLevel() {
        return level;
    }
    
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "PlayGame{" + "score=" + score + '}';
    }
    
    

}
