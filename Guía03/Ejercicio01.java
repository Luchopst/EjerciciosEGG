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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
         System.out.println("Ingrese un Numero");
        int Num = leer.nextInt();
        if (Num % 2!= 0){
            System.out.println("El Numero es Impar");
        }else{
            System.out.println("El Numero es Par");
        }
    }
    
}
