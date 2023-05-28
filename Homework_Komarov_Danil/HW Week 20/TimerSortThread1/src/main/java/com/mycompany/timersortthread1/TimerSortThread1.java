/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.timersortthread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dan20
 */
public class TimerSortThread1 {
    //methods
    public static void bubbleSortArray(int arrayToSort[]){
        boolean sorted = false;
        int iTemp;
        
        while(sorted == false){
            sorted = true;
        for (int i=0;i< arrayToSort.length-1;i++){
            if(arrayToSort[i]>arrayToSort[i+1]){
                
                iTemp=arrayToSort[i];
                arrayToSort[i]=arrayToSort[i+1];
                arrayToSort[i+1]=iTemp;
                
                sorted = false;
            }   
        }
    }
}
    public static void arrayCopy(int arrayToCopy[],int arrayToPast[]){
        for (int i = 0; i<arrayToPast.length;i++){
            arrayToPast[i]=arrayToCopy[i];
        }
    }
    
    public static void arrayFiller(int arrayToFill[],int range){
        for (int i = 0; i<arrayToFill.length;i++){
            arrayToFill[i]= (int)(Math.random()*range);
        }
    }
    // arrays 
    public static int separArr1[] = new int [10000];
    public static int separArr2[] = new int [10000];
    public static int paralArr1[] = new int [10000];
    public static int paralArr2[] = new int [10000];
    
    public static void main(String[] args) { 
       
        //Sorting in main 
        
       arrayFiller(separArr1,10000);
       arrayFiller(separArr2,10000);
      
       arrayCopy(separArr1, paralArr1);
       arrayCopy(separArr2, paralArr2);
       
       long time1 = System.currentTimeMillis(); 
       
       bubbleSortArray(separArr1);
       bubbleSortArray(separArr2);
       
       long time2 = System.currentTimeMillis();
       
       System.out.println("sorting time separately: " + (time2-time1));
       
       //Sorting in main and side thread 
       
       time1 = System.currentTimeMillis(); 
       
       SideThread mySideThread = new SideThread();
       mySideThread.start();
       
       bubbleSortArray(paralArr2);
       
        try { 
            mySideThread.join();         // waiting for the side thread 
        } catch (InterruptedException ex) {
            Logger.getLogger(TimerSortThread1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       time2 = System.currentTimeMillis();
       System.out.println("sorting time in parallel threads: " + (time2-time1));
    }
}

