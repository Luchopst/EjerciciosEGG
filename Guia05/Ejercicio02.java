/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 *
 * @author User
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del Vector");
        int n = input.nextInt();
        int[] Vector = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            Vector[i] = random.nextInt(10);
        }
        MostrarVector(Vector, n);
        System.out.println("Ingrese que Numero desea Buscar?");
        int num = input.nextInt();
        int pos = -1;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (num == Vector[i]) {

                pos = i;
                cont++;
                System.out.println("La Pocision es: " + pos + " y las cantidades son: " + cont);
            }

        }
        if (cont == 0) {
            System.out.println("El Numero No se Encontro en el Vector");
        }
        System.out.print("Vector generado: ");
        
    }

    public static void MostrarVector(int Vector[], int n) {
        
        System.out.print("Vector generado: ");

        for (int i = 0; i < n; i++) {
            System.out.print(Vector[i] + " ");
        }
        System.out.println();
    }
}

