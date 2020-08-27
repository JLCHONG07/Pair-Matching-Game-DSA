/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leaderboard;

/**
 *
 * @author GeeLoong
 * @param <T>
 */
public interface SortedArrayListInterface<T extends Comparable<T>> {

    boolean add(T aRecord);

    boolean isEmpty();

    int length();

    boolean contains(T aRecord);

    void clear();

}
