/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

/**
 *
 * @author SHATHIS
 * @param <E>
 */
public class ScoreArrayStack<E> implements ScoreArrayStackInterface<E> {
    
    private static final int DEFAULT_CAPACITY = 17;
    public E[] ScoreArrayStack;
    private int size;
   
   public ScoreArrayStack(){
        this(DEFAULT_CAPACITY);
    } 
    
    public ScoreArrayStack(int initialCapacity){
        ScoreArrayStack = (E[]) new Object [DEFAULT_CAPACITY];
        size = 0;
    }
    
      
    @Override
    public void push(E value) {
    size++;
    //if(size == ScoreArrayStack.length){
      //  doubleArray();
    //}
    if(size < ScoreArrayStack.length){
       // doubleArray();
        //ScoreArrayStack[size] = value;
        ScoreArrayStack[size] = value;
    }
   // ScoreArrayStack[size] = value;
   
    }

    @Override
    public E pop() {
        E top = null;
        if (size == 0){
        throw new ArrayIndexOutOfBoundsException();
        
        }
        
        if(!isEmpty()){
        top = ScoreArrayStack[size];
        ScoreArrayStack[size - 1] = null;
        }
        //size--;
       // int result = ScoreArrayStack[size - 1];
       //scoreStack[size - 1] = 0; //clear out old value
        
        return top;
    }
    

    /**
     *
     * @return
     */
    @Override
    public E peek() {
       E top = null;
       if (size == 0){
        throw new ArrayIndexOutOfBoundsException();
        
        }
        //int result = ScoreArrayStack[size - 1];
        //scoreStack[size - 1] = 0; //clear out old value
        if(!isEmpty()){
        top = ScoreArrayStack[size];
        }
        
        return top;
    }

   

    @Override
    public int size() {
        return size;
    }
    
    
    

    @Override
    public void clear() {
        
        size = -1;
    }

    @Override
    public boolean isEmpty() {
        return size < 0;
    }
    
    private void doubleArray(){
    E[] oldArray = ScoreArrayStack;
        int temArrayLength = ScoreArrayStack.length;
        E[] temArray = (E[]) new Object[temArrayLength * 2];
        for (int i = 0; i < oldArray.length; i++) {
            temArray[i] = ScoreArrayStack[i];
        }
        ScoreArrayStack = temArray;
    
    }
    
    /*private void doubleArray(){
    int newStack = 2* ScoreArrayStack.length;
    
    int[] newArray = new int [newStack];
    
    for(int i = 0; i < ScoreArrayStack.length; i++){
        newArray[i] = ScoreArrayStack[i];
    }
    ScoreArrayStack = newArray;
    
    }*/
    
}
