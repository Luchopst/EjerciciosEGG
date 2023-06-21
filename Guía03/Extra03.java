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
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        String letra = sc.next();
        
        // Convertir la letra a minúscula para hacer la comparación más sencilla
        letra = letra.toLowerCase();
        
        // Comprobar si la letra es una vocal
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
        
    }
    
}
