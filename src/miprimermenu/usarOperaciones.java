/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimermenu;

import java.util.Scanner;

/**
 *
 * @author cambrano
 */
public class usarOperaciones {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int sel=0,num1,num2;
        operaciones objeto=new operaciones();
        
        do{
         System.out.println("Que desea hacer usted?");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.- Salir");
        sel=in.nextInt();
        
        
        
        switch(sel){
            
            case 1: 
                System.out.println("Ingresa el primer valor");
                num1=in.nextInt();
                System.out.println("Ingresa el segundo valor");
                num2=in.nextInt();
                int suma=objeto.suma(num1, num2);
            System.out.println("La suma es:"+suma);
            break;
            
            case 2:
                System.out.println("Ingresa el primer valor");
                num1=in.nextInt();
                System.out.println("Ingresa el segundo valor");
                num2=in.nextInt();
                int resta=objeto.resta(num1, num2);
            System.out.println("La resta es:"+resta);
            break;
            
            case 3: System.exit(0);
            break;
        }
        
        }while(sel!=3);
        
        
        
    }
}
