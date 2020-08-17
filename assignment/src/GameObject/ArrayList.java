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
 


 */
public class ArrayList<T> implements List<T>{

   //private int size;
    public int length;
    private T[] array;
    private static int DEFAULT_CAPACITY=5;
  //  private String objectName;
    
    
    public ArrayList(){
    this(DEFAULT_CAPACITY);
    }
    public ArrayList(int initialCapacity){
        length=0;
    //   size=0;
        array=(T[]) new Object[initialCapacity];
    
    }
    

    //add back
        @Override
    public void add(T newObject){
        if(this.length== array.length){
            addArrayLength();
        }
        array[length]=newObject;
        length++;
    }
    
    public int length(){
        return array.length;
    }
    /*
   public void addFirst(T newObject){
   
   }
   public void addMiddle(int position, T newObject){
   
   }
*/
     public T getEntry(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length)) {
      result = array[givenPosition - 1];
    }

    return result;
  }
    private void addArrayLength(){
        T[] oldArray=array;
        int temArrayLength= array.length;
        T[] temArray=(T[]) new Object[temArrayLength * 2];
            for(int i=0; i< oldArray.length;i++){
                temArray[i]=array[i];
            }
    array=temArray;
    }


    //remove behide object

  private void removeGap(int givenPosition) {
    // move each entry to next lower position starting at entry after the
    // one removed and continuing until end of array
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      array[index] = array[index + 1];
    }
  }
    /*
    public T remove(int position){
    
    }
    public void remove(T data){
    
    }
    
    public void replace(int position){
    
    }
*/
    

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String findGameObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public  String toString(){
        String outPutGameObject="";
        for(int size=0; size<length;++size){
        outPutGameObject+=array[size];
        }
        return outPutGameObject;
    }



/*
    @Override
    public Iterator<T> getIterator() {
        return new IteratorForArrayList();
    }
    */
    /*
    private class IteratorForArrayList implements Iterator<T> {

    private int nextIndex;
    private boolean wasNextCalled; // needed by remove

    private IteratorForArrayList() {
      nextIndex = 0;
      wasNextCalled = false;
    }


    public boolean hasNext() {
      return nextIndex < length;
    }


    public T next() {
      if (hasNext()) {
        wasNextCalled = true;
        T nextEntry = array[nextIndex];
        nextIndex++; // advance iterator

        return nextEntry;
      } else {
        throw new NoSuchElementException("Illegal call to next();"
                + "iterator is after end of list.");
      }
    }
/*
    public void remove() {
      if (wasNextCalled) {
        // nextIndex was incremented by the call to next, so it 
        // is the position number of the entry to be removed
        GameObjectList.this.remove(nextIndex);
        nextIndex--;           // index of next entry in iteration
        wasNextCalled = false; // reset flag
      } else {
        throw new IllegalStateException("Illegal call to remove(); "
                + "next() was not called.");
      }
    }
    */
   // }
/*
    @Override
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/


    public T remove(int givenPosition) {
   T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length)) {
      result = array[givenPosition - 1];

      if (givenPosition < length) {
        removeGap(givenPosition);
      }

      length--;
    }

    return result;   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



  
        
}
