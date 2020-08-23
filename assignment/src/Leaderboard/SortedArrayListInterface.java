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
public interface SortedArrayListInterface<T extends Comparable<T>> {
   /*
    public boolean add(T aRecord);
    public boolean remove(T aRecord);
    public boolean isEmpty();
    public int length();
   */
      boolean add(T aRecord);
     boolean remove(T aRecord);
     boolean isEmpty();
     int length();
     boolean contains(T anEntry );

            
}
