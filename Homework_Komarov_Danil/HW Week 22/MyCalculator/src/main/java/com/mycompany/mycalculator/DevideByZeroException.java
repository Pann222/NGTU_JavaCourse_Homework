/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycalculator;

/**
 *
 * @author Dan20
 */
public class DevideByZeroException extends Exception {
    @Override
    public String getMessage(){
        return "You cannot devide by zero.";
    }
}
