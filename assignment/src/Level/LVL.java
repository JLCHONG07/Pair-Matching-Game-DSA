/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level;

import Player.PromptPlayer;
import java.util.Scanner;

/**
 *
 * @author SAM
 */
public class LVL {

    public static int currentLvlScore;
    public static String currentLevel;
    public static int currentRounds;

    public static int noOfGameObject;
    int levelSelect;
    boolean valid = true;
    PromptPlayer player = new PromptPlayer();

    public int noOfObj() {

        Level lvl = new Level();
        ArrayQueue<Level> data = new ArrayQueue<>();

        Scanner levelSelection = new Scanner(System.in);

        do {
            if (!data.isEmpty()) {
                data.clear();
            }

            do {
                try {

                    System.out.println("Select Level\n1. Easy \n2. Normal \n3. Hard");
                    levelSelect = levelSelection.nextInt();
                    valid = false;
                } catch (Exception e) {
                    System.err.println("Please input number only!!!");
                    levelSelection.nextInt();
                }

            } while (valid = false);

            switch (levelSelect) {
                case 1: {
                    noOfGameObject = 8;
                    data.enqueue(new Level("L01", "Easy", 10, noOfGameObject, 2));
                    valid = true;
                    break;
                }
                case 2: {
                    noOfGameObject = 12;
                    data.enqueue(new Level("L02", "Normal", 15, noOfGameObject, 3));
                    valid = true;
                    break;
                }
                case 3: {
                    noOfGameObject = 16;
                    data.enqueue(new Level("L03", "Hard", 20, noOfGameObject, 4));
                    valid = true;
                    break;
                }
                default: {
                    System.out.println("Invalid Input!!! Please Enter Again.");
                    valid = false;
                    break;
                }
            }
        } while (valid != true);

        currentLevel = data.getFront().getLevelId();
        currentRounds = data.getFront().getRound();
        currentLvlScore = data.getFront().getPairScore();
        // }
        return noOfGameObject;
    }
}
