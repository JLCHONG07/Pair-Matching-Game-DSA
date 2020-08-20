
package Player;

import collections.LinkedList;
import java.util.Scanner;

public class PromptPlayer {
    int playerNo = 1;
    Scanner playerInput = new Scanner(System.in);
    LinkedList<Player> playerLinkedList = new LinkedList<>();
    String currentPlayer = null;
    String currentId = null;
    int currentScore = 0;
    String id;
    
    public void NewPlayer() {
        System.out.println("New Game");
        System.out.println("========");
        System.out.print("Please enetr your username : ");
        String playerName = playerInput.next();
        
        if(playerNo > 99) {
            id = "P" + playerNo;
        } else if (playerNo > 9) {
            id = "P0" + playerNo;
        } else {
            id = "P00" + playerNo;
        }
        
        currentId = id;
        
        playerLinkedList.add(new Player(id, playerName, 0, 0, 0));
        
        for (int index = 0; index < playerLinkedList.length(); index++) {
            if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                currentPlayer = playerLinkedList.get(index).getPlayerName();
                currentScore = playerLinkedList.get(index).getEasylvlScore();
            }
        }
        
        System.out.println("+-----------------------+");
        System.out.println("|" + "Your current id is " + currentId + "|");
        System.out.println("+-----------------------+");
        
        /*
            prompt player input on levels
        */
        
        addScore();
    }
    
    public void ExistingPlayer() {
        boolean proceed = false;
        System.out.println("Load Game");
        System.out.println("=========");
        do {
            System.out.print("Please enter your id : ");
            String playerId = playerInput.next();

            if(playerId.length() > 4) {
                proceed = false;
            } else {
                for(int index = 0; index < playerLinkedList.length(); index++) {
                    if(playerLinkedList.get(index).getPlayerId().equals(playerId)) {
                        currentId = playerLinkedList.get(index).getPlayerId();
                        currentPlayer = playerLinkedList.get(index).getPlayerName();
                        currentScore = playerLinkedList.get(index).getEasylvlScore();
                        proceed = true;
                    } else {
                        proceed = false;
                    }
                }
            }
            if(proceed == false) {
                System.out.println("Invalid player id");
            } else {
                System.out.println("Valid player id");
            }
        }while(proceed == false);
        
        playerLinkedList.show();
        
        addScore();
    }
    
    public void addScore() {
        currentScore += 4;
        for(int index = 0; index < playerLinkedList.length(); index++) {
            if(playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                playerLinkedList.replace(index, new Player(currentId, currentPlayer, currentScore,0 ,0));
            }
        }
        
        playerLinkedList.show();
    }
}
