
package com.mycompany.project2;

/**
 *
 * author Komarov Daniil Al
 * 
 * Sorting
 */
public class Project2 {

    public static void main(String[] args) {
        
        
          int array [];
        array = new int [1001];
        
        for(int i=0; i < array.length-1; i++) {
            array[i]= (int) (Math.random()*101);
            
        }
        
    boolean sortedCheck1 = false;     
    int numberCheck = 0;        
    int temp;
    
    while(sortedCheck1==false) {
        
       
        int [] arrCopy = new int [array.length];
        
        for (int i = 0; i < arrCopy.length-1; i++){
        
            arrCopy[i] = array [i];
            
        }
                
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                temp = array[i];    
                array[i] = array[i+1];  
                array[i+1] = temp;
                
                
            }
        }
    
   
    for (int i = 0; i < array.length-1; i++) {
    
        
        if (arrCopy[i] == array [i]){
           numberCheck++; 
            
        }
        
    }
    
  //      System.out.println(numberCheck);
    if (numberCheck == array.length-1){
        sortedCheck1=true;
           
    } 
    
    else {
        numberCheck = 0;
    }
       
    
    }
       
        System.out.println("done");
                
    }
}

    
            
            
                 
               
        
        
        
        
        
        
        
        
            
         
        
         
        
        
        
        
        
        
        
        
        
        
    
        
   
        
        
        
        
        
        
        
        
        
            
       
    
