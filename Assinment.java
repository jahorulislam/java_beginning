
package javabegenner;

import java.util.Scanner;


public class Assinment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("enter 1st digit=");
        x=input.nextInt();
        System.out.println("enter 2nd digit");
        y=input.nextInt();
        
        x+=y;
        System.out.println("x="+x);
        x-=y;
        System.out.println("x="+x);
        y+=x;
        System.out.println("y="+y);
        x/=y;
        System.out.println("x="+x);
        x+=y;
        System.out.println("x="+x);
        y/=x;
        System.out.println("y="+y);
        
    }
    
}
