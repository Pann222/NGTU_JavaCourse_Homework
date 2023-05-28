/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timersortthread1;

/**
 *
 * @author Dan20
 */
public class SideThread extends Thread {
    
    public void run(){
        
    TimerSortThread1.bubbleSortArray(TimerSortThread1.paralArr2);
        
    }
    
}
