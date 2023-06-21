/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio05 {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
        System.out.println("Ingrese un Numero");
        int Num = leer.nextInt();
        /*se declara la variable num como entero y se le asigna el valos ingresado por pantalla*/
        System.out.println( Num*2 );
        System.out.println( Num *3 );
        System.out.println(Math.sqrt(Num));
        /*Math.sqrt() sirve para la raiz cuadrada de un numero*/
    }
}
