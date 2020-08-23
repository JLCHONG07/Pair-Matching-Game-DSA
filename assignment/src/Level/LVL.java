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
    int checkInt = 0;
    PromptPlayer player = new PromptPlayer();

    public void LevelDecision() {

        Level lvl = new Level();
        ArrayQueue<Level> data = new ArrayQueue<>();

        Scanner levelSelection = new Scanner(System.in);

        do {
            if (!data.isEmpty()) {
                data.clear();
            }
            
            System.out.println("Select Level\n1. Easy \n2. Normal \n3. Hard");
            
            if(levelSelection.hasNextInt()){
                levelSelect = levelSelection.nextInt();
                
                switch (levelSelect) {
                    case 1: {
                        data.enqueue(new Level("L01", "Easy", 10, 8, 2));
                        valid = true;
                        break;
                    }
                    case 2: {
                        data.enqueue(new Level("L02", "Normal", 15, 12, 3));
                        valid = true;
                        break;
                    }
                    case 3: {
                        data.enqueue(new Level("L03", "Hard", 20, 16, 4));
                        valid = true;
                        break;
                    }
                    default: {
                        System.out.println("Invalid Input!!! Please Enter Again.");
                        valid = false;
                        break;
                    }
                }
            }
            else if(!levelSelection.hasNextInt()){
                System.out.println("Please enter integer only!!!\n");
                levelSelection.next();
                valid = false;
            }

            
        } while (valid != true);

        currentLevel = data.getFront().getLevelId();
        currentRounds = data.getFront().getRound();
        currentLvlScore = data.getFront().getPairScore();
        noOfGameObject=data.getFront().getNumofobj();
    }
}
