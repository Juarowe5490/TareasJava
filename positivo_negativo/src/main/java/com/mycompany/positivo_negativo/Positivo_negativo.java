
package com.mycompany.positivo_negativo;
import java.util.Scanner;
public class Positivo_negativo 
{

        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = sc.nextInt();
        
        if (num > 0)
            System.out.println("El numero es Positivo");
        else if (num < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("Numero neutro");
           
            
        
        
    }
}
