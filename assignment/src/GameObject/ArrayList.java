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

    //private int size;
    public int length;
    private T[] array;
    private static int DEFAULT_CAPACITY = 5;
    //  private String objectName;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        length = 0;
        //   size=0;
        array = (T[]) new Object[initialCapacity];

    }

    //add back
    @Override
    public void add(T newObject) {
        if (this.length == array.length) {
            addArrayLength();
        }
        array[length] = newObject;
        length++;
    }

    public int length() {
        return array.length;
    }

    public T getEntry(int givenPos) {
        T result = null;

        if ((givenPos >= 1) && (givenPos <= length)) {
            result = array[givenPos - 1];
        }

        return result;
    }

    private void addArrayLength() {
        T[] oldArray = array;
        int temArrayLength = array.length;
        T[] temArray = (T[]) new Object[temArrayLength * 2];
        for (int i = 0; i < oldArray.length; i++) {
            temArray[i] = array[i];
        }
        array = temArray;
    }

    @Override
    public T remove(int givenPos) {
        T result = null;

        if ((givenPos >= 1) && (givenPos <= length)) {
            result = array[givenPos - 1];

            if (givenPos < length) {
                removeGap(givenPos);
            }

            length--;
        }

        return result;   //To cha//To change body of generated methods, choose Tools | Templates.
    }

    private void removeGap(int givenPos) {
        // move each entry to next lower position starting at entry after the
        // one removed and continuing until end of array
        int removedIndex = givenPos - 1;
        int lastIndex = length - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

    @Override
    public boolean isEmpty() {

        return length == 0;
    }

    public String toString() {
        String outPutGameObject = "";
        for (int size = 0; size < length; ++size) {
            outPutGameObject += array[size];
        }
        return outPutGameObject;
    }
    
    @Override
    public void clear() {
    length = 0;
  }


}
