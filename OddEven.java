
package myjjavaproject;

import java.util.Scanner;


public class OddEven {
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num;
        System.out.println("Enter digit=");
        num=input.nextInt();
        if (num%2!=0) 
        {
            System.out.println("odd");
            
        }
        else{
            System.out.println("even");
        }
    }
    
}
