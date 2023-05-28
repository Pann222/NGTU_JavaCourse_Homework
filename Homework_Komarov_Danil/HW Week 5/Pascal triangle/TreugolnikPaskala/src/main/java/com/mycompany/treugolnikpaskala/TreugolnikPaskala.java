
package com.mycompany.treugolnikpaskala;

/**
 *
 * author Komarov Daniil Al 
 */
public class TreugolnikPaskala {

    public static void main(String[] args) {
      
int arrLength = 11;    
int [][] array = new int[arrLength][];
int i = 0;
int j = 0;
      
        for (i = 0; i < array.length; i++) {
            array[i] = new int [i+1];
            array[i][0]= 1;
                 
            for (j = 0; j < array[i].length; j++) {
                
                array[i][j]= j+1;
                array[i][i] = 1;               
               
                if (array[i][j]>1){
                   array[i][j]= array[i-1][j]+array[i-1][j-1];
                }
                
                 System.out.print(array[i][j]+ " ");
                
                        if (i==j) {
                    System.out.println(" ");
                    
            }
                }        
                    }
        
        System.out.println("done");   
        
        
    }
}