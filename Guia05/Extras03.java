/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 * @author User
 */
public class Extras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del Vector");
        int tam = input.nextInt();
        int[] vector = new int[tam];
        rellenar(vector, tam);
        mostrar(vector, tam);
    }

    public static void rellenar(int vector[], int tam) {
        Random ran = new Random();
        for (int i = 0; i < tam; i++) {
            vector[i] = ran.nextInt(100);

        }
    }

    public static void mostrar(int vector[], int tam) {
        
        for (int i = 0; i < tam; i++) {
            System.out.print(" " +"[" +vector[i]+ "]");
        }
        
    }
}
