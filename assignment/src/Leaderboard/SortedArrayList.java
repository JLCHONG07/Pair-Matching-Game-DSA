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
    
    private int length;
    private T[] recArr;
    private static int MAX_RECORD = 5;
    
        
    @Override
    public int length() {
        return recArr.length;
    }
    
    @Override
    public void add(int position,T aRecord)
    {
        int i = 0;
     while (i < length && aRecord.compareTo(recArr[i]) > 0) {
      i++;  
     }
    }
     
    @Override
     public boolean remove(T aRecord)
     {
         int i =0;
	if(isEmpty()){     
		return false;
	}
	while (i<length && aRecord.compareTo(recArr[i])>0){
		i++;
}
            if(recArr[i].equals(aRecord)){
		removeGap(i+1);
		length--;
            return true;
	} 
	return false;

     }
     
     private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1;
    int lastIndex = length - 1;

    for (int i = lastIndex; i >= newIndex; i--) {
      recArr[i + 1] = recArr[i];
    }
  }
     
     private boolean isRecordFull() {        //check whether max record existed
    return length == recArr.length;
  }
     
     private void removeGap(int givenPosition) {
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      recArr[index] = recArr[index + 1];
    }
  }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }
    
    

}
