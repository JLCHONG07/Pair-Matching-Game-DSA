/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author CHONGJL
 */
public class GameObj {

    private String name;
    private String description;
    private String displayName;
    private int temDisplayName = 0;
    private String zero = "0";
    //  int objectDisplayName=0;

    public GameObj() {

    }

    public GameObj(String name, String desc, int objName) {
        this.name = name;
        this.description = desc;
        this.temDisplayName = objName;
        // objectDisplayName++;
        if (objName < 10) {
            this.displayName = zero + Integer.toString(objName);

        } else {
            this.displayName = Integer.toString(objName);
        }
    }

    public void setDIsplayName(int displayNamePass) {
        if (displayNamePass < 10) {
            this.displayName = zero + Integer.toString(displayNamePass);

        } else {
            this.displayName = Integer.toString(displayNamePass);
        }
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String setDescription(){
        return this.description;
    }

    /*  
    public String getDescObj(){
        return description;
    }
     */
    public String toString() {
    
    return name +description+getDisplayName()+"\n";
    }

    // return name+description+"\n";
  
}
