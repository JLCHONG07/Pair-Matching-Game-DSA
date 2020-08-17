package GameObject;

import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHONGJL
 *   @param <T>
 */
public interface List<T> {
    
 //   Iterator<T> getIterator() ;
    void add(T gameObjectName);
    T remove();
    T getEntry(int givenPosition);
    boolean isEmpty();
    String findGameObject();
    int length();
  //  int length();

   
    
}
