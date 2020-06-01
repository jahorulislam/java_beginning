
package javabegenner;

import java.util.Scanner;


public class TriangelArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double b,h,area;
        System.out.println("\"Enter base\"=");
        b=input.nextDouble();
        
        System.out.println("\"Enter height\"=");
        h=input.nextDouble();
        
        area=.5*b*h;
        System.out.println("Area of triangel="+area);
        
       
        
    }
   
        
   
    
}
