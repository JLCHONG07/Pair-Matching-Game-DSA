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
 * @param <T>
 */
public interface ArrListInterface<T> {

    //   Iterator<T> getIterator() ;
    void add(T gameObjectName);

    T remove(int givenPosition);

    T getEntry(int givenPosition);

    boolean isEmpty();

    int length();
    
    void clear();
    //  int length();

}
