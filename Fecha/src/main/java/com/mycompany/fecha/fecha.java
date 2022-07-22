package com.mycompany.fecha;
import java.util.Scanner;
public class fecha 
{
    public static void main(String[] args) 
    {
       Scanner aa = new Scanner(System.in);
       Scanner ba = new Scanner(System.in); 
       Scanner ca = new Scanner(System.in);
       
            System.out.print("Ingresar dia");
                int dia = aa.nextInt();
            System.out.print("Ingresar mes");
                int mes = ba.nextInt();
            System.out.print("Ingresar año");
                int ao = ca.nextInt();
        
        if (ao != 0)
            if (mes >= 1 || mes <= 12)
                if (mes == 2)
                    if (dia >= 1 && dia <= 28) 
                        if (mes == 4 ||mes ==6 ||mes == 9 ||mes == 11)
                            if (dia >= 1 && dia <= 30)
                                if (dia >= 1 && dia <= 31) 
                                System.out.print("fecha ingresada es "+dia+"/"+mes+"/"+ao); 
                                else 
                                System.out.print("fecha invalida");
                        
    }
                        
}
                        
                        
                             
                    
                    
                    
            
        
            
        
    


