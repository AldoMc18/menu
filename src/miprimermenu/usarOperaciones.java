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
        
        operaciones objeto=new operaciones();
        
        
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.- Salir");
        
        int suma=objeto.suma(3, 4);
        int resta=objeto.resta(3, 4);
        
        System.out.println("La suma es:"+suma);
        System.out.println("La resta es:"+resta);
    }
}
