/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.worker;

/**
 *
 * @author Dan20
 */
public class Person extends HumanBeing implements AbleToTalk {
    String name;
        
    
    
    @Override
    public void talk(){
        System.out.println("Hello, my name is " + name);
    }
        
    @Override
    public float bodyMassIndex(){
        if (height<3.0){
        return (weight/(height*height));
                } else {
            return((weight/(height*height))*10000);
        }
        
    }
    

    
    @Override
    public void eat(){
        System.out.println("I am eating...");
    }
    
    
    public byte simpleMath(byte number1, byte number2){
         return (byte)(number1+number2);
     }
     
     
     
     
}
