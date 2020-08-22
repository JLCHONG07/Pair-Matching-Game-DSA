/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

/**
 *
 * @author USER
 */
public interface SortedListInterface<T extends Comparable<T>> {
    public boolean add(T anEntry);
    public boolean remove(T anEntry);
    public boolean isEmpty();
            
}
