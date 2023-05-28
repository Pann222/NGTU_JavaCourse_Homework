
package com.mycompany.project2;

/**
 *
 * author Komarov Daniil Al
 * 
 * Sorting
 */
public class Project2 {

    public static void main(String[] args) {
        
        int iArrTemp1;                                                          
        int iArrTemp2; 
          int array [];
        array = new int [1001];
        
        for(int i=0; i < array.length-1; i++) {
            array[i]= (int) (Math.random()*101);
            
        }
        
    boolean sortedCheck1 = false;     
      
    int temp;
    
    while(sortedCheck1==false) {
        
       sortedCheck1=true;
       
    for (int i = 0; i < array.length-1; i++){                                   
           
            iArrTemp1 = array [i];                                              
            iArrTemp2 = array [i+1];
           
        if (array[i] > array[i+1]) {
            temp = array[i];    
            array[i] = array[i+1];  
            array[i+1] = temp;
                
                
            }
        
        
        if (iArrTemp1 != array[i] & iArrTemp2 != array[i+1]){
           sortedCheck1=false; 
            
                }
        
            }
    

       
    
        }
       
        System.out.println("done");
                
    }
}

    
            
            
                 
               
        
        
        
        
        
        
        
        
            
         
        
         
        
        
        
        
        
        
        
        
        
        
    
        
   
        
        
        
        
        
        
        
        
        
            
       
    
