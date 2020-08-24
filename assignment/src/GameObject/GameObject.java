/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;



/**
 *
 * @author CHONGJL
 */
public class GameObject {

    private String gameObjId;
    private String description;
    private String gameObjName;
    private String zero = "0";
    private boolean isPair = true;

    public GameObject() {

    }

    public GameObject(String gameObjId, String desc, int objName, boolean isPair) {
        this.gameObjId = gameObjId;
        this.description = desc;
        this.isPair = isPair;
        converter(objName);

    }

    public void setDIsplayName(int displayNamePass) {
        converter(displayNamePass);
    }

    public String getDisplayName() {
        return this.gameObjName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getObjID() {
        return this.gameObjId;
    }

    public void setIsPairs(boolean isPairs) {
        this.isPair = isPairs;
    }

    public boolean getIsPairs() {
        return this.isPair;
    }

    public void converter(int gameObjects) {

        // convert int to string
        if (gameObjects < 10) {
            this.gameObjName = zero + Integer.toString(gameObjects);

        } else {
            this.gameObjName = Integer.toString(gameObjects);
        }

    }

  
    public String toString() {

        return gameObjId + description + getDisplayName() + getIsPairs() + "\n";
    }

}
