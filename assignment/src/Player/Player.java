
package Player;

import collections.LinkedList;
import java.util.Objects;

public class Player extends LinkedList<Player> {
    private String playerId;
    private String playerName;
    private int playerScore;
    
    public Player() {}
    
    public Player(String playerId, String playerName, int playerScore) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerScore = playerScore;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public int getPlayerScore() {
        return playerScore;
    }

    public String getPlayerId() {
        return playerId;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
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
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }
    
    
}
