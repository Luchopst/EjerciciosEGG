/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extras01 {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
     * vector de tamaño N, con los valores ingresados por el usuario.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del vector");
        int tam = input.nextInt();

        int[] vector = new int[tam];
        int suma = 0;
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingresar Numero");
            vector[i] = input.nextInt();
           

        }
        for (int i = 0; i < tam; i++) {
             suma+= vector[i];
            suma++;
        }
        System.out.println("El resultado de la suma es: " + suma);
    }

}
