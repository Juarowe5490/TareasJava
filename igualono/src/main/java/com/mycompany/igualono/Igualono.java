
package com.mycompany.igualono;
import java.util.Scanner;
public class Igualono 
{


        public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            Scanner ac = new Scanner(System.in);
            System.out.println("Ingrese primer numero a comparar");
            int primer = sc.nextInt();
            System.out.println("Ingrese segundo numero a comparar");
            int segundo = ac.nextInt();
            
                    if (primer == segundo)
                        System.out.println("El numero "+primer+" es igual al numero "+segundo);
            
                    
                    else
                        System.out.println("El numero "+primer+" no es igual al numero "+segundo);
                    
            
        
        
    }
}
