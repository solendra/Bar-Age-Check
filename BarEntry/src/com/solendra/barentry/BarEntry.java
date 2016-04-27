/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.barentry;

import java.util.Scanner;

/**
 *
 * @author solendra
 */
public class BarEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("Enter your age:");
        int age=input.nextInt();
     
        if (age>=18){
            System.out.println("Do you have a pass [Y/N]");
            if(input.next().equalsIgnoreCase("Y")){
                System.out.println("You can enjoy the private party too");
        }
            else {System.out.println("Your are welcome to the party");}
            }
            else{
                System.out.println("You are under age");}
           
            System.out.println("Do you want to continue[y/n]");
            if(input.next().equalsIgnoreCase("n")){
            System.exit(0);}
            
        
    }
    }
    
    
    
}
