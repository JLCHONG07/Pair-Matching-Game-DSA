
package Player;

import static Level.LVL.currentLevel;
import static Level.LVL.currentLvlScore;
import collections.LinkedList;
import java.util.Scanner;

public class PromptPlayer {
    int playerNo = 1;
    Scanner playerInput = new Scanner(System.in);
    public static LinkedList<Player> playerLinkedList = new LinkedList<>();
    public static String currentPlayer;
    public static String currentId;
    public static int highestScore = 0;
    String id;
    
    public void NewPlayer() {
        System.out.println("New Game");
        System.out.println("========");
        System.out.print("Please enter your username : ");
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
            }
        }
        
        System.out.println(currentPlayer);
        
        System.out.println("+-----------------------+");
        System.out.println("|" + "Your current id is " + currentId + "|");
        System.out.println("+-----------------------+");
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
    }
    
    public String displayName() {
        return currentPlayer;
    }
    
    public String displayCurrentID() {
        return currentId;
    }
    
    public int highestScore() {
        return highestScore;
    }
    
    public void assignHighestScore() {
        switch(currentLevel) {
            case "L01":
                for(int index = 0; index < playerLinkedList.length(); index++) {
                    if(playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getEasylvlScore();
                    }
                }
                break;
            case "L02":
                for(int index = 0; index < playerLinkedList.length(); index++) {
                    if(playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getMediumlvlScore();
                    }
                }
                break;
            case "L03":
                for(int index = 0; index < playerLinkedList.length(); index++) {
                    if(playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getHardlvlScore();
                    }
                }
                break;
        }
    }
    
    public void saveTotalResults(int score) {
        if(currentLevel != null) {
            switch(currentLevel) {
                case "L01":
                    for(int index = 0; index < playerLinkedList.length(); index++) {
                        if(playerLinkedList.get(index).getPlayerId().equals(currentId)){
                            if(playerLinkedList.get(index).getEasylvlScore() < score) {
                                playerLinkedList.get(index).setEasylvlScore(score);
                                System.out.println(playerLinkedList.get(0).getEasylvlScore());
                            } else {
                                System.out.println("The previous score " + highestScore + " is higher than current score " + score);
                            }
                        } else {
                            System.out.println("Invalid ID !");
                        }
                    }
                    
                    break;
                case "L02":
                    for(int index = 0; index < playerLinkedList.length(); index++) {
                        if(playerLinkedList.get(index).getPlayerId().equals(currentId)){
                            if(playerLinkedList.get(index).getEasylvlScore() < score) {
                                playerLinkedList.get(index).setMediumlvlScore(score);
                            } else {
                                System.out.println("The previous score " + highestScore + " is higher than current score " + score);
                            }
                        } else {
                            System.out.println("Invalid ID !");
                        }
                    }
                    break;
                case "L03":
                    for(int index = 0; index < playerLinkedList.length(); index++) {
                        if(playerLinkedList.get(index).getPlayerId().equals(currentId)){
                            if(playerLinkedList.get(index).getEasylvlScore() < score) {
                                playerLinkedList.get(index).setHardlvlScore(score);
                            } else {
                                System.out.println("The previous score " + highestScore + " is higher than current " + score);
                            }
                        } else {
                            System.out.println("Invalid ID !");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid level");
                    break;
            }
        }
    }
}
