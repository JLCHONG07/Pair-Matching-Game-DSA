/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObject;

//import java.util.Iterator;
//import java.util.NoSuchElementException;
/**
 *
 * @author CHONGJL
 * @param <T>
 *
 *
 *
 *
 */
public class ArrayList<T> implements ArrListInterface<T> {

    private int length;
    private T[] array;
    private static int DEFAULT_CAPACITY = 5;

    //ceate  the emty arrayList with Default capacity=5;
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    //create empty Arraylist of specified capacity with object types t
    public ArrayList(int initialCapacity) {
        length = 0;
        array = (T[]) new Object[initialCapacity];

    }

    //add the new object to behind  of the array
    @Override
    public void add(T newObject) {
        if (isArrayFull()) {
            addArrayLength();
        }
        array[length] = newObject;
        length++;
    }

    //return the length of current array
    @Override
    public int length() {
        return array.length;
    }

    //add elements at newPos given
    @Override
    public boolean add(int newPos, T newEntry) {
        boolean isSuccessful = true;

        if ((newPos >= 1) && (newPos <= length + 1)) {
            if (!isArrayFull()) {
                addArrayLength();
                array[newPos - 1] = newEntry;
                length++;
            }
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    //check and return true if current length is same as array length
    private boolean isArrayFull() {
        return this.length == length();
    }

    //replace the elements at givenPos 
    @Override
    public boolean replace(int givenPos, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPos >= 1) && (givenPos <= length)) {
            array[givenPos - 1] = newEntry;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }

    //get the array by following the position "givenPos"  variable that passed from driver with this method
    public T getEntry(int givenPos) {
        T object = null;

        if ((givenPos >= 1) && (givenPos <= length)) {
            object = array[givenPos - 1];
        }

        return object;
    }

    // add the array length when the current length is same as array length
    private void addArrayLength() {
        T[] oldArray = array;
        int temArrayLength = array.length;
        T[] temArray = (T[]) new Object[temArrayLength * 2];
        for (int i = 0; i < oldArray.length; i++) {
            temArray[i] = array[i];
        }
        array = temArray;
    }

    //remove the array by following the position "givenPos" variable that passed from driver with this method
    @Override
    public T remove(int givenPos) {
        T object = null;

        if ((givenPos >= 1) && (givenPos <= length)) {
            object = array[givenPos - 1];

            if (givenPos < length) {
                removeGap(givenPos);
            }

            length--;
        }

        return object;
    }

    // move each entry to next lower position starting at entry after the
    // one removed and continuing until end of array
    private void removeGap(int givenPos) {

        int removedIndex = givenPos - 1;
        int lastIndex = length - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

    //check and return the length true if the length is zero which mean empty of the array
    @Override
    public boolean isEmpty() {

        return length == 0;
    }

    //added up all the array and return the ouput of my object
    public String toString() {
        String outPutGameObject = "";
        for (int size = 0; size < length; ++size) {
            outPutGameObject += array[size];
        }
        return outPutGameObject;
    }

    //remove all the array by assigning the length to zero
    @Override
    public void clear() {
        length = 0;
    }

}
