
package com.mycompany.orden_tres;
import java.util.Scanner;
public class Orden_tres 
{
        
        public static void main(String[] args) 
    {
    
        Scanner ab = new Scanner (System.in);
        Scanner bb = new Scanner (System.in);
        Scanner cb = new Scanner (System.in);
                
            System.out.println("Ingresar primer numero");
                int a = ab.nextInt();
            System.out.println("Ingresar Segundo numero");
                int b = bb.nextInt();
            System.out.println("Ingresar tercer numero");
                int c = cb.nextInt();
        
                if (a > b)
                    if (a > c)
                        if (b > c)
                            System.out.println(a+" , "+b+" , "+c);
                        else
                            System.out.println(b+" , "+c+" , "+a);
                    else
                        System.out.println(c+" , "+a+" , "+b);
                else
                    if (b > c)
                        if (a > c)
                            System.out.println(b+" , "+a+" , "+c);
                        else
                            System.out.println(b+" , "+c+" , "+a);
                    else
                        System.out.println(c+" , "+b+" , "+a);
                
    }
}
