/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extras02 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Tamaño de los vectores");
        int n = input.nextInt();

        int[] primerVector = new int[n];
        int[] segundoVector = new int[n];
        int cont = 0;
        RellenarVector(primerVector, segundoVector, n);
        for (int i = 0; i < n; i++) {
            if (primerVector[i] == segundoVector[i]) {
                cont++;
            } else {
                System.out.println("No Hay Coincidencia");
                break;
            }
        }
        if (cont == n) {
            System.out.println("hay Coincidencia");
        }

    }

    //funcion para rellenar vector
    public static int RellenarVector(int primerVector[], int segundoVector[], int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            //se le asigno un random pequeño para comprovar si hay coincidencias
            primerVector[i] = rand.nextInt(1) + 1;
            System.out.print(" " + "[" + primerVector[i] + "]");
            System.out.print("");

        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            segundoVector[i] = rand.nextInt(2) + 1;

            System.out.print(" " + "[" + segundoVector[i] + "]");
            System.out.print("");

        }
        System.out.println(" ");
        return 0;
    }
}
