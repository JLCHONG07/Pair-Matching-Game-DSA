/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePlay;

/**
 *
 * @author Santhi
 */
public interface ScoreArrayStackInterface {
    int push(int value);
    int pop();
    
    int peek();
    
    
    int size();
    void clear();
    
    boolean isEmpty();
     
}
