
package Player;

import collections.LinkedList;
import java.util.Objects;

public class Player extends LinkedList<Player> {
    private String playerId;
    private String playerName;
    private int easylvlScore;
    private int mediumlvlScore;
    private int hardlvlScore;
    
    public Player() {}
    
    public Player(String playerId, String playerName, int easylvlScore, int mediumlvlScore, int hardlvlScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.easylvlScore = easylvlScore;
        this.mediumlvlScore = mediumlvlScore;
        this.hardlvlScore = hardlvlScore;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getEasylvlScore() {
        return easylvlScore;
    }

    public int getMediumlvlScore() {
        return mediumlvlScore;
    }

    public int getHardlvlScore() {
        return hardlvlScore;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setEasylvlScore(int easylvlScore) {
        this.easylvlScore = easylvlScore;
    }

    public void setMediumlvlScore(int mediumlvlScore) {
        this.mediumlvlScore = mediumlvlScore;
    }

    public void setHardlvlScore(int hardlvlScore) {
        this.hardlvlScore = hardlvlScore;
    }
    
    @Override
    public String toString() {
        return playerId + " " + playerName + " " + playerScore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerId, other.playerId)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }
}
