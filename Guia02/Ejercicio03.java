/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y 
 * la muestre 
 * toda en mayúsculas y después toda en minúsculas. 
 * @author User
 */
public class Ejercicio03 {
     public static void main(String[] args){
         System.out.println("Ingresa Una Frase");
         Scanner leer = new Scanner (System.in);
         String Frase= leer.nextLine();
          
         System.out.println(Frase.toUpperCase()+ "-" + Frase.toLowerCase() );
     }
}
