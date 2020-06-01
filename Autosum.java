
package basicjava;

import java.util.Scanner;


public class Autosum {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
      int sum=0,x,y;
        System.out.println("Enter 1st number=");
        x=input.nextInt();
        System.out.println("Enter 2nd number");
        y=input.nextInt();
        
        for (int i = x; i <=y; i++) 
        {
            sum=sum+i;
                System.out.println(i);
        }
        System.out.println("this sum is="+sum);
        
       }
    
}
