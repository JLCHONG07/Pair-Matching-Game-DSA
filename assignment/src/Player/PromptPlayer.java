
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
    
    public void promptPlayerInput() {
        int playerSelect;
        
        playerLinkedList.add(new Player("P001", "John", 0));
        
        do {
            System.out.println("+----------------+");
            System.out.println("|1. New Game     |");
            System.out.println("|2. Load Game    |");
            System.out.println("|3. Back         |");
            System.out.println("+----------------+");

            System.out.println("Please enter your choice (1 ~ 3)");
            playerSelect = playerInput.nextInt();
            
            if(playerSelect >= 4) {
                System.out.println("Invalid selection! Please select again.");
            } 
        }while(playerSelect >= 4);
        
        switch(playerSelect) {
            case 1:
                NewPlayer();
                break;
            case 2:
                ExistingPlayer();
                break;
            case 3:
                //back to main menu
                break;
        }
    }
    
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
        
        playerLinkedList.add(new Player(id, playerName, 0));
        
        for (int index = 0; index < playerLinkedList.length(); index++) {
            if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                currentPlayer = playerLinkedList.get(index).getPlayerName();
                currentScore = playerLinkedList.get(index).getPlayerScore();
            }
        }
        
        System.out.println("+-----------------------+");
        System.out.println("|" + "Your current id is " + currentId + "|");
        System.out.println("+-----------------------+");
        
        /*
            prompt player input on levels
        */
        
        
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
                        currentScore = playerLinkedList.get(index).getPlayerScore();
                        proceed = true;
                    } else {
                        proceed = false;
                    }
                }
            }
            if(proceed == false) {
                System.out.println("Invalid player id");
            }
        }while(proceed == false);
        
        playerLinkedList.show();
        
        addScore();
    }
    
    public void addScore() {
        currentScore += 4;
        for(int index = 0; index < playerLinkedList.length(); index++) {
            if(playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                playerLinkedList.replace(index, new Player(currentId, currentPlayer, currentScore));
            }
        }
        
        playerLinkedList.show();
    }
}
