/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

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
    public T remove() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    boolean getDisplayName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
        
}
