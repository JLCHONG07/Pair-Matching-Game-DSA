/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

/*import static GamePlay.GamePlay.easyRecord;
import static GamePlay.GamePlay.hardRecord;
import static GamePlay.GamePlay.mediumRecord;*/
import static Level.LVL.currentLevel;
import static Player.PromptPlayer.currentId;
import static Player.PromptPlayer.currentPlayer;
import static Player.PromptPlayer.highestScore;
import static Player.PromptPlayer.playerLinkedList;

/**
 *
 * @author GeeLoong
 */
public class PromptBoard {

    public static SortedArrayListInterface<LeaderBoard> easyRecord = new SortedArrayList<LeaderBoard>();
    public static SortedArrayListInterface<LeaderBoard> mediumRecord = new SortedArrayList<LeaderBoard>();
    public static SortedArrayListInterface<LeaderBoard> hardRecord = new SortedArrayList<LeaderBoard>();

    public void levelTracker() {
        int totalScoreEarn = 0;
        String playerName;
        switch (currentLevel) {
            case "L01": {

                if (!easyRecord.isEmpty()) {

                    mediumRecord.clear();

                }
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {

                        totalScoreEarn = playerLinkedList.get(index).getEasylvlScore();
                        playerName = playerLinkedList.get(index).getPlayerName();
                        easyRecord.add(new LeaderBoard(playerName, totalScoreEarn, currentLevel));
                    }

                }

                break;
            }
            case "L02": {

                if (!mediumRecord.isEmpty()) {

                    mediumRecord.clear();

                }
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {

                        totalScoreEarn = playerLinkedList.get(index).getEasylvlScore();
                        playerName = playerLinkedList.get(index).getPlayerName();
                        mediumRecord.add(new LeaderBoard(playerName, totalScoreEarn, currentLevel));
                    }

                }

                break;
            }
            case "L03": {

                if (!hardRecord.isEmpty()) {

                    hardRecord.clear();

                }
                for (int index = 0; index < playerLinkedList.length(); index++) {
                    if (playerLinkedList.get(index).getPlayerId().equals(currentId)) {

                        totalScoreEarn = playerLinkedList.get(index).getEasylvlScore();
                        playerName = playerLinkedList.get(index).getPlayerName();
                        hardRecord.add(new LeaderBoard(currentPlayer, highestScore, currentLevel));
                    }

                }

                break;
            }
        }
    }

    public void displayBoard(int level) {

        //get user name and scores
        System.out.println("+-----------------------------------------+");
        System.out.println("\t\tLeaderBoard");
        System.out.println("+-----------------------------------------+");
        System.out.println("Rank\tName\t\t\tScore");

        levelTracker();
        switch (level) {
            case 1: {

                easyBoard();
                break;
            }
            case 2: {
                mediumBoard();
                break;
            }
            case 3: {
                hardBoard();
                break;
            }
        }
    }

    public void easyBoard() {
        System.out.println("==========================================");
        if (!easyRecord.isEmpty()) {
            System.out.println(easyRecord.toString());
            System.out.println("==========================================");
        } else {
            System.out.println("No record yet......\n");
            System.out.println("==========================================");
        }
    }

    public void mediumBoard() {
        System.out.println("==========================================");
        if (!mediumRecord.isEmpty()) {
            System.out.println(mediumRecord.toString());
            System.out.println("==========================================");
        } else {
            System.out.println("No record yet......");
            System.out.println("==========================================");
        }
    }

    public void hardBoard() {
        System.out.println("==========================================");
        if (!hardRecord.isEmpty()) {
            System.out.println(hardRecord.toString());
            System.out.println("==========================================");
        } else {
            System.out.println("No record yet......");
            System.out.println("==========================================");
        }
    }
}
