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
    private E[] ScoreArrayStack;
    private int size;
   
   public ScoreArrayStack(){
        this(DEFAULT_CAPACITY);
    } 
    
    public ScoreArrayStack(int initialCapacity){
        ScoreArrayStack = (E[]) new Object [DEFAULT_CAPACITY];
    }
    
      
    @Override
    public void push(E value) {
    size++;

    if(size < ScoreArrayStack.length){
        ScoreArrayStack[size] = value;
    }
   
    }

    @Override
    public E pop() {
        E top = null;
        
        if(!isEmpty()){
            top = ScoreArrayStack[size];
            ScoreArrayStack[size] = null;
            size--;
        }
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
        if(!isEmpty()){
        top = ScoreArrayStack[size];
        }
        
        return top;
    }
    

    @Override
    public boolean isEmpty() {
        return size < 0;
    }

    @Override
    public void clear() {
        size = -1;
    }
    
}
