/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.worker;

/**
 *
 * @author Dan20
 */
public class Worker extends Person implements AbleToTalk {
    static int countOfWood;
    private Chainsaw chainsaw;
        public Worker(String name, int age, float height, float weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
  
        {
            chainsaw = new Chainsaw();
            System.out.println("Chainsaw was recived");
        }
        
    @Override
        public void talk(){
            byte speach = (byte)(Math.random()*3+1);
            switch(speach){
                
                case 1 -> System.out.println("Greetings, my name is "+ name);
                case 2 -> System.out.println("*yawning*");
                case 3 -> System.out.println("Buy a watch");
            }
        }
        
        private class Chainsaw {
           private int durability = 100;
           
           public int getDurability(){
               return this.durability;
           }
           public void setDurability(int x){
               this.durability = x;
           }
           
           public void startChainsaw (){
               
               System.out.println("Chainsaw is turned on..." + " "+ "Starting");
           }
         
        }
        
    public void sawATree(){
               
               chainsaw.startChainsaw();
               System.out.println("The tree was sawn by "+ this.name);
               chainsaw.setDurability(chainsaw.getDurability()-1);
               System.out.println(this.name + "'s" + " chainsaw durability is " + chainsaw.getDurability());
               countOfWood = countOfWood + (int)(Math.random()*11+5);
               System.out.println("The amount of wood is " + countOfWood);
           }
    
    public double simpleMath(double number1, double number2, char operType){
    
        switch(operType){
            
            case '/': if (number2>0){
                return (number1/number2);
            } else { 
           
                System.out.println("Error");
            }
            case '+':  return (number1+number2);
            case '-':  return (number1-number2);
            case '*':  return (number1*number2);
            default: System.out.println("You have chosen wrong operation type, operation type by default is '+' "); 
            return (number1+number2);
        }
        
    
}
    public int simpleMath(int number1, int number2, char operType){
    
        switch(operType){
            
            case '/': if (number2>0){
                return (number1/number2);
            } else { 
           
                System.out.println("Error");
            }
            case '+':  return (number1+number2);
            
            case '-':  return (number1-number2);
            case '*':  return (number1*number2);
            default: System.out.println("You have chosen wrong operation type,"
                    + " operation type by default is '+' "); 
            return (number1+number2);
        }
    
}
    
    
        
    
    public static void main(String[] args) {
       Worker Bob = new Worker("Bob",24,180,87);
      //  System.out.println("Bob's body mass index is " + Bob.bodyMassIndex());
      // Bob.sawATree();
        
        //Worker Jeff = new Worker("Jeff",34,170,67);
       // System.out.println("Jeff's body mass index is " + Jeff.bodyMassIndex());
       // Jeff.sawATree();
       // Jeff.sawATree();
       // Jeff.sawATree();
       // Bob.sawATree();
     //   System.out.println(Bob.simpleMath(3.3, 5.3,'/' ));
        Bob.talk();
    }
}
