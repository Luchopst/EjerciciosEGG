/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio05 {

    /**Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de
     * los números introducidos supere el límite inicial.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int valPos=0;
       int val=0;
       int suma=0;
       
          System.out.println("Ingrese un Valor Limite Positivo");
          valPos = input.nextInt();
         do{
          System.out.println("Ingrese un Valor a sumar");
          val = input.nextInt();
          suma+=val;
       }while(suma <=valPos);
        System.out.println("El Valor ingresado es superor al Valor Limite Ingresado");
        System.out.println("["+"Intente Nuevamente"+"]");
       
       }
     
        
    
    
}
