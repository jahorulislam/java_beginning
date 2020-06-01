
package myjjavaproject;

import java.util.Scanner;


public class VowelConsonent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        char x;
        System.out.println("Enter any letter=");
        x=input.next().charAt(8);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
        {
            System.out.println("Vowel");
        }
        
        else{
            System.out.println("Consonant");
        }
    
    }
}

