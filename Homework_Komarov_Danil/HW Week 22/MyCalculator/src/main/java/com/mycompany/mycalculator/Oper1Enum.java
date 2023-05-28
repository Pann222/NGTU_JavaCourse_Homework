/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mycalculator;

/**
 *
 * @author Dan20
 */
public enum Oper1Enum {
    PLUS { 
        int actM(int arg1, int arg2){
            return arg1+arg2;
        }  
    }, MIN {
        int actM(int arg1, int arg2){
            return arg1-arg2;
        }
    }, MULT {
        int actM(int arg1, int arg2){
            return arg1*arg2;
        }
    }, DIVIS {
        int actM(int arg1, int arg2)throws DevideByZeroException{
            if (arg2==0){
                throw new DevideByZeroException();
            } else {
            return arg1/arg2;
            }
        }
    };
      
    abstract int actM(int arg1, int arg2) throws DevideByZeroException;
    
}
