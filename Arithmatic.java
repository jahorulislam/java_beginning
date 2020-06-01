
package javabegenner;

import java.util.Scanner;


public class Arithmatic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("enter 1st number=");
        num1=input.nextInt();
        System.out.println("enter 2nd number=");
        num2=input.nextInt();
         result=num1+num2;
        System.out.println("sum="+result);
        result=num1-num2;
        System.out.println("sub="+result);
        result=num1*num2;
        System.out.println("mul="+result);
        double result1=(double)num1/num2;
        System.out.println("div="+result1);
      }
}
    

