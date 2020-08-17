/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHONGJL
 */
public class GameObject {

    public static int noOfGameObject = 16;
    int name = 0;
    static int max = 8;//base on level change
    static int min = 1;
    static String descObj;
    static int objNo = 0;
    static int stopCreateObj = 0;
    static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0;// easy 4 pairs, normal 6 paurs, hard 8 pairs;
    static boolean checkObj = true;
    private String zero = "0";
    GameObj object = new GameObj();
   
//

    public void randomObj(int randTime) {
        Random rand = new Random();

        for (int i = 0; i < randTime; i++) {

            int rand_object = rand.nextInt((max - min) + 1) + min;

            if (objNo == 16) {
                objNo += 1;

            } else {
                objNo++;
            }

            if (objNo <= 16) {
                checkObj = true;
                createObj(rand_object, objNo, randTime);//
            } else {
                checkObj = false;
            }

        }

    }

    public void createObj(int randObject, int objName, int reRandTime) {
        descObj = "";
        if (checkObj == true) {
            if (randObject == 1) {

                count1++;
                descObj = "Apple";
                if (count1 <= 2) {
                    addObjAndDisplay("1", descObj, objName);
                } else {

                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);
                }

            } else if (randObject == 2) {
                count2++;
                descObj = "Orange";
                if (count2 <= 2) {
                    addObjAndDisplay("2", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            } else if (randObject == 3) {
                count3++;
                descObj = "Durian";
                if (count3 <= 2) {
                    addObjAndDisplay("3", descObj, objName);
                } else {

                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);
                }

            } else if (randObject == 4) {
                count4++;
                descObj = "Mango";
                if (count4 <= 2) {
                    addObjAndDisplay("4", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            } else if (randObject == 5) {
                count5++;
                descObj = "Papaya";
                if (count5 <= 2) {
                    addObjAndDisplay("5", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            } else if (randObject == 6) {
                count6++;
                descObj = "Watermelon";
                if (count6 <= 2) {
                    addObjAndDisplay("6", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            } else if (randObject == 7) {
                count7++;
                descObj = "Blueberry";
                if (count7 <= 2) {
                    addObjAndDisplay("7", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            } else if (randObject == 8) {
                count8++;
                descObj = "Strawberry";
                if (count8 <= 2) {
                    addObjAndDisplay("8", descObj, objName);
                } else {
                    reRandTime -= 1;
                    objNo -= 1;
                    randomObj(reRandTime);

                }

            }
        } else {
            gamePlay();
        }

    }

    //
    public void addObjAndDisplay(String objNo, String name, int objName) {
         ArrayList<GameObj> gameObject = new ArrayList<GameObj>(10);
        gameObject.add(new GameObj(objNo, name, objName));
           String convertName;
           //convert int to string
          if (objName < 10) {
       convertName = zero + Integer.toString(objName);

        } else {
           convertName= Integer.toString(objName);
        }
          //display game object in orderly
        if (objName == 8 || objName == 16) {
            System.out.print(convertName + "\n");
       //      System.out.print(gameObject.toString());

        } else {
            System.out.print(convertName + "\t");
       //     System.out.print(gameObject.toString());
        }


    }

    //shathis part
    public void gamePlay() {
        int decision;
        System.out.print("Enter test :");
        Scanner scan = new Scanner(System.in);
        decision = scan.nextInt();
        //  gameObject[decision];
//  System.out.print("debug choice:"+    gameObject[decision]);

    }
}
