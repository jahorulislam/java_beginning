
package javabegenner;

import java.util.Scanner;


public class Temparature {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double celcius,farenheight;
        System.out.println("Enter temperature of celcius=");
        celcius=input.nextDouble();
        
        farenheight=1.8*celcius+32;
        System.out.println("Temperature of farenheight="+farenheight);
    }
    
}
