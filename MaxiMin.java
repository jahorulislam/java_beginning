
package myjjavaproject;

import java.util.Scanner;


public class MaxiMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,max,min;
        System.out.println("Enter 1st digit=");
        num1=input.nextDouble();
        System.out.println("Enter 2nd digit");
        num2=input.nextDouble();
        
        max=(num1>num2)?num1:num2;
        System.out.println("maximum="+max);
        
        min=(num1<num2)?num1:num2;
        System.out.println("minimum="+min);
        
        
        
    }
    
}
