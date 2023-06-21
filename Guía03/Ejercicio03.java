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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese una palabra o frase");
        Scanner leer = new Scanner (System.in);
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        
        }
    }
    
}
