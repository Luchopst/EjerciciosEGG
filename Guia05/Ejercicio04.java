/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;

/**
 *
 * @author User
 */
public class Ejercicio04 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] Matriz = new int[4][4];
        int[][] MatrizT = new int[4][4];
        int i;
        int j;

        //rellenar Matriz
        Random rand = new Random();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                Matriz[i][j] = rand.nextInt(9) + 1;
                System.out.print(" " + "[" + Matriz[i][j] + "]");
                System.out.print("");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (j = 0; j < 4; j++) {
            for (i = 0; i < 4; i++) {
                MatrizT[j][i] = Matriz[i][j];
                System.out.print(" " + "[" + MatrizT[j][i] + "]");
                System.out.print("");
            }
            System.out.println(" ");
        }

    }
}
