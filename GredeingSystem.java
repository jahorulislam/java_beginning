
package myjjavaproject;

import java.util.Scanner;


public class GredeingSystem {
    public static void main(String[] args){
        
        Scanner input=new Scanner (System.in);
        double num;
        
        System.out.println("Enter your number=");
        num=input.nextDouble();
        
         if (num>=80&&num<=100)
        {
            System.out.println("passed");
            System.out.println("Your grade is A+");
        }
        else if (num>=70&&num<=79.999)
        {
            System.out.println("Your grade is A");
        }
        else if (num>=60&&num<=69.999)
        {
            System.out.println("Result=Passed");
            System.out.println("your grade is=A-");
        }
        else if (num>=50&&num<=59.999)
        {
            System.out.println("Result=Passed");
            System.out.println("your grade is=B");
        }
        else if (num>=40&&num<=49.999)
        {
            System.out.println("Result=Passed");
            System.out.println("your grade is=C");
        }
        else if (num>=33&&num<=39.99)
        {
          System.out.println("Result=Passed");
            System.out.println("your grade is=D");
        }
        else if (num>100)
        {
            System.out.println("Out of grading system");
            
        }
        else if (num>=33&&num<=39.99)
        {
            System.out.println("Result=Passed");
            System.out.println("your grade is=D");
        }
        
        else 
        {
            System.out.println("Result=Failed");
            System.out.println("your grade is =F");
        }
         
    }
     
}

    
