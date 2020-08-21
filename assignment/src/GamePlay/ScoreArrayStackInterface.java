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
public interface ScoreArrayStackInterface<E> {

     void push(E value);
    
     E pop();
    
    /**
     *
     * @return
     */
     E peek();
    
    
     int size();
   
      void clear();
    
      boolean isEmpty();
     
}
