
package javabegenner;

import java.util.Scanner;


public class CircelArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double r,area;
        System.out.println("\"Enter radius\"=");
        r = input.nextDouble();
        
        area=3.1416*r*r;
        System.out.println("The area of circel="+area);
        
    }
}
