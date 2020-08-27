/**
 *
 * @author GAHSENG
 */

package Player;

import static Level.LVL.*;
import java.util.Scanner;
import static assignment.Assignment.*;

public class PromptPlayer {
    public static int playerNo = 1;
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

        if (playerNo > 99) {
            id = "P" + playerNo;
            playerNo++;
        } else if (playerNo > 9) {
            id = "P0" + playerNo;
            playerNo++;
        } else {
            id = "P00" + playerNo;
            playerNo++;
        }

        highestScore = 0;
        currentId = id;

        playerLinkedList.add(new Player(id, playerName, 0, 0, 0));
        
        currentPlayer = playerName;

        System.out.println("+-----------------------+");
        System.out.println("|" + "Your current id is " + currentId + "|");
        System.out.println("+-----------------------+");
    }

    public void ExistingPlayer() {
        boolean proceed = false;
        System.out.println("Load Game");
        System.out.println("=========\n");
        do {
            if (!playerLinkedList.isEmpty()) {
                System.out.print("Please enter your id : ");
                String playerId = playerInput.next();

                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(playerId)) {
                        currentId = playerLinkedList.get(index).getPlayerId();
                        currentPlayer = playerLinkedList.get(index).getPlayerName();
                        proceed = true;
                    }
                }
                
                if (proceed == false) {
                    System.out.println("Invalid player id");
                    proceed = true;
                    PromptPlayerInput();
                } else {
                    System.out.println("Valid player id");
                }
            } else {
                System.out.println("No player found !");
                System.out.println("Return to main menu\n");
                proceed = true;
                MainMenu();
            }
        } while (proceed == false);
        assignHighestScore();
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
        switch (currentLevel) {
            case "L01":
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getEasylvlScore();
                    }

                }
                break;
            case "L02":
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getMediumlvlScore();
                    }
                }
                break;
            case "L03":
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                        highestScore = playerLinkedList.get(index).getHardlvlScore();
                    }
                }
                break;
        }
    }

    public void saveTotalResults(int score) {
        if (currentLevel != null) {
            switch (currentLevel) {
                case "L01":
                    for (int index = 0; index < playerLinkedList.length(); index++) {
                        if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                            if (playerLinkedList.get(index).getEasylvlScore() <= score) {
                                playerLinkedList.get(index).setEasylvlScore(score);
                            } else {
                                System.out.println("The previous score " + highestScore
                                        + " is higher than current score " + score);
                            }
                        }
                    }

                    break;
                case "L02":
                    for (int index = 0; index < playerLinkedList.length(); index++) {
                        if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                            if (playerLinkedList.get(index).getMediumlvlScore() <= score) {
                                playerLinkedList.get(index).setMediumlvlScore(score);
                            } else {
                                System.out.println("The previous score " + highestScore
                                        + " is higher than current score " + score);
                            }
                        }
                    }
                    break;
                case "L03":
                    for (int index = 0; index < playerLinkedList.length(); index++) {
                        if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {
                            if (playerLinkedList.get(index).getHardlvlScore() <= score) {
                                playerLinkedList.get(index).setHardlvlScore(score);
                            } else {
                                System.out.println(
                                        "The previous score " + highestScore + " is higher than current " + score);
                            }
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
