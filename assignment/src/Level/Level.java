/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level;

/**
 *
 * @author SAM
 */
public class Level {
    public String levelId;
    public String levelDescription;
    public int round;
    public static int numofobj;
    public int pairScore;
    

    public Level() {
    }

    public Level(String levelId, String levelDescription, int round, int numofobj, int pairScore) {
        this.levelId = levelId;
        this.levelDescription = levelDescription;
        this.round = round;
        this.numofobj = numofobj;
        this.pairScore = pairScore;
    }

    public String getLevelId() {
        return levelId;
    }

    public String getLevelDescription() {
        return levelDescription;
    }

    public int getRound() {
        return round;
    }

    public int getNumofobj() {
        return numofobj;
    }

    public int getPairScore() {
        return pairScore;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public void setLevelDescription(String levelDescription) {
        this.levelDescription = levelDescription;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void setNumofobj(int numofobj) {
        this.numofobj = numofobj;
    }

    public void setPairScore(int pairScore) {
        this.pairScore = pairScore;
    }

    @Override
    public String toString() {
        return "Level{" + "levelId=" + levelId + ", levelDescription=" + levelDescription + ", round=" + round + ", numofobj=" + numofobj + ", pairScore=" + pairScore + '}';
    }
    
}
