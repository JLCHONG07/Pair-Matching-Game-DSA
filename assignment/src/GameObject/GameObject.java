/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

import GamePlay.GamePlay;
import static GamePlay.GamePlay.countingPair;

import static assignment.Assignment.Again;
import static assignment.Assignment.noOfGameObject;
//mport static GamePlay.GamePlay.countingPair;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHONGJL
 */
public class GameObject {

    int name = 0;
    public static int max = noOfGameObject / 2;//base on level change
    static int min = 1;
    static String descObj;
    public static int objNo = 0;
    static int stopCreateObj = 0;
    public static int count1 = 1, count2 = 1, count3 = 1, count4 = 1, count5 = 1, count6 = 1, count7 = 1, count8 = 1;// easy 4 pairs, normal 6 paurs, hard 8 pairs;
    static boolean checkObj = true;
    String zero = "0";
    GamePlay gp = new GamePlay();
    public static boolean gamePlayleft = true;//round finish will change to false;
    public static boolean again = true;
  
    // ArrayList<GameObj> gameObject = new ArrayList<GameObj>(10);
    //ArrayList<GameObj> go = new ArrayList<GameObj>();
    // private int noOfGameObject;

    public void randomObj(int randTime) {
        //     while (again == true) {
        ArrayList<GameObj> go = new ArrayList<GameObj>();
        if (!go.isEmpty()) {
            go.clear();

        }
        Random rand = new Random();

        for (int i = 0; i < randTime; i++) {

            int rand_object = rand.nextInt((max - min) + 1) + min;
            //     System.out.print("\nDebug random: " + rand_object);
            objNo++;

            //createObj(rand_object, randTime);//
            //   ArrayList<GameObj> temGo = new ArrayList<GameObj>();
            descObj = "";
            if (rand_object == 1 && count1 <= 2) {

                count1++;
                descObj = "Apple";
                go.add(new GameObj("01", descObj, objNo));

            } else if (rand_object == 2 && count2 <= 2) {

                count2++;
                descObj = "Orange";
                go.add(new GameObj("02", descObj, objNo));

            } else if (rand_object == 3 && count3 <= 2) {

                count3++;
                descObj = "Strawberry";
                go.add(new GameObj("03", descObj, objNo));

            } else if (rand_object == 4 && count4 <= 2) {

                count4++;
                descObj = "Mango";
                go.add(new GameObj("04", descObj, objNo));

            } else if (rand_object == 5 && count5 <= 2) {

                count5++;
                descObj = "Durian";
                go.add(new GameObj("05", descObj, objNo));

            } else if (rand_object == 6 && count6 <= 2) {

                count6++;
                descObj = "Papaya";
                go.add(new GameObj("06", descObj, objNo));

            } else if (rand_object == 7 && count7 <= 2) {

                count7++;
                descObj = "Watermelon";
                go.add(new GameObj("07", descObj, objNo));

            } else if (rand_object == 8 && count8 <= 2) {

                count8++;
                descObj = "Blueberry";
                go.add(new GameObj("08", descObj, objNo));

            } else {

                randTime += 1;
                objNo -= 1;

            }

        }
        //    again = false;

        displayObj(go);
        //   }
        //  }

    }

    public void displayObj(ArrayList<GameObj> go) {

        while (countingPair != max) {
            if (gamePlayleft) {
                System.out.print("\n\nPlayer ID : 001 \t\t\tPlayer Name: hard Code Name\n\n");
                System.out.println("\tPair Matching Game (Here are your objects to pair)");
                System.out.println("==================================================================");
                for (int i = 1; i <= objNo; i++) {
                    if (i < 17) {

                        String convertName;
                        //convert int to string
                        if (i < 10) {
                            convertName = zero + Integer.toString(i);

                        } else {
                            convertName = Integer.toString(i);
                        }
                        //display game object in orderly
                        // switch(level){
                        if (noOfGameObject == 16) {
                            if (i == 8 || i == 16) {// change based on level 8,12,16
                                System.out.print(convertName + "\t\n");//change to \n if done
                                if (i == 16) {//changed based on level
                                    System.out.println("==================================================================");

                                    gp.gamePlay(go);
                                }
                            } else {
                                System.out.print(convertName + "\t");

                            }
                        }
                        if (noOfGameObject == 12) {
                            if (i == 6 || i == 12) {// change based on level 8,12,16
                                System.out.print("\t  " + convertName + "\n");//change to \n if done
                                if (i == 12) {//changed based on level
                                    System.out.println("==================================================================");

                                    gp.gamePlay(go);
                                }
                            } else {
                                System.out.print("\t  " + convertName);

                            }
                        }
                        if (noOfGameObject == 8) {
                            if (i == 4 || i == 8) {// change based on level 8,12,16
                                System.out.print("\t" + convertName + "\n");//change to \n if done
                                if (i == 8) {//changed based on level
                                    System.out.println("==================================================================");

                                    gp.gamePlay(go);
                                }
                            } else {
                                System.out.print("\t" + convertName + "\t");

                            }
                        }
                    }
                }

            } else {

                Again();

            }

        }
    }
}
