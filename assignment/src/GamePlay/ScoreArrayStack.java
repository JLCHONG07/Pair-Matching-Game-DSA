/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

/**
 *
 * @author SHATHIS
 */
public class ScoreArrayStack implements ScoreArrayStackInterface{
    
    private static final int DEFAULT_CAPACITY = 17;
    public int[] ScoreArrayStack;
    private int size;
   
    
    public ScoreArrayStack(){
        ScoreArrayStack = new int [DEFAULT_CAPACITY];
        size = 0;
    }
    
      
    @Override
    public int push(int value) {
    if(size == ScoreArrayStack.length){
        doubleArray();
    }
    ScoreArrayStack[size] = value;
    size++;
    return value;
    }

    @Override
    public int pop() {
        if (size == 0){
        throw new ArrayIndexOutOfBoundsException();
        
        }
        int result = ScoreArrayStack[size - 1];
        //scoreStack[size - 1] = 0; //clear out old value
        
        size--;
        return result;
    }
    

    /**
     *
     * @return
     */
    @Override
    public int peek() {
       if (size == 0){
        throw new ArrayIndexOutOfBoundsException();
        
        }
        int result = ScoreArrayStack[size - 1];
        //scoreStack[size - 1] = 0; //clear out old value
        
        return result;
    }

   

    @Override
    public int size() {
        return size;
    }
    
    
    public int capacity(){return ScoreArrayStack.length;}

    @Override
    public void clear() {
        for(int i = 0; i < ScoreArrayStack.length; i++){
            ScoreArrayStack[i] = 0;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void compressArray(){
      if(size < ScoreArrayStack.length){
       int newStack = size;
    
       int[] newArray = new int [newStack];
    
    for(int i = 0; i < ScoreArrayStack.length; i++){
        newArray[i] = ScoreArrayStack[i];
    }
    ScoreArrayStack = newArray;
       
       }
    }
    
    private void doubleArray(){
    int newStack = 2* ScoreArrayStack.length;
    
    int[] newArray = new int [newStack];
    
    for(int i = 0; i < ScoreArrayStack.length; i++){
        newArray[i] = ScoreArrayStack[i];
    }
    ScoreArrayStack = newArray;
    
    }
    
}
