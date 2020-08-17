/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

import GameObject.ArrayList;
import GameObject.GameObj;
import java.util.Scanner;

/**
 *
 * @author CHONGJL
 */
public class GamePlay {

    String openDot = "'";
    String closeDot = "'";
    String TisObj = "This object is ";
    String objPaired = "";
    public static int countingPair = 0;

    public void gamePlay(ArrayList<GameObj> go) {

        int decisionConvert;
        String decision1;
        String decision2;
        String obj1Choosed;
        String obj2Choosed;

        //   int temHoldObj1Pos = 0;
        //  int temHoldObj2Pos = 0;
        //   boolean firstTime = true;
        System.out.println(go.toString());//coomand if done

        System.out.print("\nObject Get Pair:" + objPaired);
        System.out.print("\nObj 1 :");
        Scanner scan = new Scanner(System.in);
        decision1 = scan.nextLine();
        decisionConvert = Integer.parseInt(decision1);
        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
        obj1Choosed = go.getEntry(decisionConvert).getObjID();
        //    temHoldObj1Pos = decisionConvert;
        System.out.print("Debug1" + obj1Choosed);
        System.out.print("\nObj 2 :");
        //     Scanner scan = new Scanner(System.in);
        decision2 = scan.nextLine();
        decisionConvert = Integer.parseInt(decision2);
        System.out.print(openDot + TisObj + go.getEntry(decisionConvert).getDescription() + closeDot + "\n");
        obj2Choosed = go.getEntry(decisionConvert).getObjID();
        // temHoldObj2Pos = decisionConvert;
        System.out.print("Debug2" + obj2Choosed);

        if (obj1Choosed.equals(obj2Choosed)) {
            System.out.print("\nResults : Both object choosed are Pair!\n");
            objPaired += decision1 + "\t" + decision2 + "\t";
            System.out.print("Debug object Added to pair" + objPaired + "\n");
            countingPair++;

        } else {
            System.out.print("Result: Both object choosed are not Pair!\n");
        }
    }
}
