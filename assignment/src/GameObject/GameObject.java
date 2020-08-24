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

    private String id;
    private String description;
    private String objName;
    private String zero = "0";
    private boolean isPair = true;

    public GameObject() {

    }

    public GameObject(String id, String desc, int objName, boolean isPair) {
        this.id = id;
        this.description = desc;
        this.isPair = isPair;
        converter(objName);

    }

    public void setDIsplayName(int displayNamePass) {
        converter(displayNamePass);
    }

    public String getDisplayName() {
        return this.objName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getObjID() {
        return this.id;
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
            this.objName = zero + Integer.toString(gameObjects);

        } else {
            this.objName = Integer.toString(gameObjects);
        }

    }

  
    public String toString() {

        return id + description + getDisplayName() + getIsPairs() + "\n";
    }

}
