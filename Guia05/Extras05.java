/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**Realizar un programa que llene una matriz de 
 * tamaño NxM con valores aleatorios y muestre la 
 * suma de sus elementos.
 *
 * @author User
 */
public class Extras05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int[5][4];
        int suma=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
              matriz[i][j] = (int) (Math.random()*11);
                System.out.print(" " + "[ "+ matriz[i][j] +" ]"+" ");
              suma=suma+matriz[i][j]; 
            }
            System.out.println(" ");
        }
         System.out.println(" ");
        System.out.println("La suma de los elementos de la matriz es: "+suma);
    }
    
}
