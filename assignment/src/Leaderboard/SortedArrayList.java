/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

/**
 *
 * @author USER
 * @param <T>
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedArrayListInterface<T> {

  private T[] array;
  private int length;
  private int rank;
  private static final int DEFAULT_CAPACITY = 25;

  public SortedArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public SortedArrayList(int initialCapacity) {
    length = 0;
    array = (T[]) new Comparable[initialCapacity];
  }
@Override
  public boolean add(T newEntry) {
    int i = 0;
    while (i < length && newEntry.compareTo(array[i]) > 0) {
      i++;
    }
    makeRoom(i + 1);
    array[i] = newEntry;
    length++;
    return true;
  }
@Override
  public boolean remove(T anEntry) {
    throw new UnsupportedOperationException();
  }

  public void clear() {
    length = 0;
  }
@Override
  public boolean contains(T anEntry) {
    boolean found = false;
    for (int index = 0; !found && (index < length); index++) {
      if (anEntry.equals(array[index])) {
        found = true;
      }
    }
    return found;
  }
@Override
  public int length() {
    return length;
  }
@Override
  public boolean isEmpty() {
    return length == 0;
  }

     @Override
  public String toString() {
    String outputStr = "";
    for (int index = 0; index < length; ++index) {
        rank=index+1;
      outputStr +=rank+"\t"+ array[index] + "\n";
    }
    
    return outputStr;
  }

  private boolean isArrayFull() {
    return length == array.length;
  }

  private void doubleArray() {
    T[] oldList = array;
    int oldSize = oldList.length;

    array = (T[]) new Object[2 * oldSize];

    for (int index = 0; index < oldSize; index++) {
      array[index] = oldList[index];
    }
  }

  private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1;
    int lastIndex = length - 1;

    for (int index = lastIndex; index >= newIndex; index--) {
      array[index + 1] = array[index];
    }
  }

  private void removeGap(int givenPosition) {
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      array[index] = array[index + 1];
    }
  }

   
    

}
