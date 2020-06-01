
package basicjava;

import java.util.Scanner;


public class SeriesDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sum=0,m,n;
        System.out.println("Enter initial number=");
        m=input.nextInt();
        System.out.println("Enter final number=");
        n=input.nextInt();
        for (int i = m; i <=n; i=i+1) {
            sum=sum+i;
            //System.out.println(i);
        }
        System.out.println("The result is =" +sum);
      
    }
    
}
