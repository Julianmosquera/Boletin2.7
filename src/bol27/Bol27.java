
package bol27;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol27 {

    
    public static void main(String[] args) {
        float n,i,t;
        System.out.println("Introduce el nominal");
        Scanner dato=new Scanner (System.in);
        n=dato.nextFloat();
        System.out.println("Introduce el interes");
        i=dato.nextFloat();
        System.out.println("Inserte el tiempo");
        t=dato.nextFloat();
        
        t=n*i*t/1200;
        
        System.out.println("Renta mensual="+t);
        
        
        //prabando pull
    }
    
}
