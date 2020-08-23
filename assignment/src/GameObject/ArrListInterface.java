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

    //Add an obejct to the list at behind of the array
    void add(T gameObjectName);

    //Remove an object from specified position "givenPos" if valid and return the removed element
    T remove(int givenPos);

    //Return the object at specified position "givenPos" if valid
    T getEntry(int givenPosi);

    //Return a boolean whether the list is empty
    boolean isEmpty();

    //Return the number of objects in the list
    int length();

    //Remove the objects in the list
    void clear();

    //Add an obejct to the list at specified newPos, resize if needed
    boolean add(int newPos, T newEntry);

    //Replace an object from specified position "givenPos" to a new object if valid and return the boolean wheather is it sucessful
    boolean replace(int givenPos, T newEntry);

}
