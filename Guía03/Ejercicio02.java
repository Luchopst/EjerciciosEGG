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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la frase Eureka");
        Scanner leer = new Scanner(System.in);
        String mate = leer.nextLine();
        //mate = mate.toLowerCase();
        
        if (mate.equalsIgnoreCase("eureka")) {
            System.out.println("Frase correcta :)");
                    }
                    
        else {
            System.out.println("Frase incorrecta :(");
    }
    
}
