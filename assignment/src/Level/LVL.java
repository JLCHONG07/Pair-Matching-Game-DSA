/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level;

import java.util.Scanner;
/**
 *
 * @author SAM
 */
public class LVL {
    
    public static int currentLvlScore;
    public static String currentLevel;
    
    int noOfObject;
    
    public int noOfObj(){
        
        Level lvl = new Level();
        ArrayQueue<Level> data = new ArrayQueue<Level>();
        
        Scanner levelSelection = new Scanner (System.in);
        System.out.println("Select Level\n1. Easy \n2. Normal \n3. Hard");
        int levelSelect = levelSelection.nextInt();

        switch (levelSelect)
        {
            case 1:
            {
                noOfObject = 8;
                data.enqueue(new Level("L01", "Easy" ,10 ,noOfObject ,2 ));
            }
            case 2:
            {
                noOfObject = 12;
                data.enqueue(new Level("L02", "Medium" ,15 ,noOfObject ,3 ));
            }
            case 3:
            {
                noOfObject = 16;
                data.enqueue(new Level("L03", "Hard" ,20 ,noOfObject ,4 ));
            }
            default:
            {
                System.out.println("Error");
            }
        }
        
        currentLevel = data.getFront().getLevelId();
        currentLvlScore = data.getFront().getPairScore();
        return noOfObject;
    }
}
