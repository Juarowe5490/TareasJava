
package com.mycompany.orden_dos;
import java.util.Scanner;
public class Orden_dos 
{

    public static void main(String[] args) 
    {
    
        Scanner ab = new Scanner (System.in);
        Scanner bb = new Scanner (System.in);
                
            System.out.println("Ingresar primer numero");
                int numa = ab.nextInt();
            System.out.println("Ingresar Segundo numero");
                int numb = bb.nextInt();
        
                if (numa > numb)
                    System.out.println(numa+" , "+numb);
                else if (numb > numa)
                    System.out.println(numb+" , "+numa);
                else
                    System.out.println("Error en los numeros");
                    
                
    }
}
