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
public class GameObj {

    private String id;
    private String description;
    private String objName;
    private int temDisplayName = 0;
    private String zero = "0";
    private boolean isPair=true;
    //  int objectDisplayName=0;

    public GameObj() {
                
    }

    public GameObj(String id, String desc, int objName, boolean isPair) {
        this.id = id;
        this.description = desc;
        this.temDisplayName = objName;
        this.isPair=isPair;
        // objectDisplayName++;
        if (objName < 10) {
            this.objName = zero + Integer.toString(objName);

        } else {
            this.objName = Integer.toString(objName);
        }
    }

    public void setDIsplayName(int displayNamePass) {
        if (displayNamePass < 10) {
            this.objName = zero + Integer.toString(displayNamePass);

        } else {
            this.objName = Integer.toString(displayNamePass);
        }
    }

    public String getDisplayName() {
        return this.objName;
    }
    public String getDescription(){
        return this.description;
    }
    public String getObjID(){
        return this.id;
    }
    public void setIsPairs(boolean isPairs){
        this.isPair=isPairs;
    }
    public boolean getIsPairs(){
        return this.isPair;
    }
    /*  
    public String getDescObj(){
        return description;
    }
     */
    public String toString() {
    
    return id +description+getDisplayName()+getIsPairs()+"\n";
    }

    // return name+description+"\n";
  
}
