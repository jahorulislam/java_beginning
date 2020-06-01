
package myjjavaproject;

import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char let;
        System.out.println("Enter letter=");
        let=input.next().charAt(0);
        if (let>='a'&&let<='z') 
        {
            System.out.println("small letter");
            
        }
        else if (let>='A'&&let<='Z')
        {
            System.out.println("capital letter");
        }
        
        else{
            System.out.println("this is not letter something else");
        }
    }
    
}
