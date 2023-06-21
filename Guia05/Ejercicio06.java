/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author User
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Matriz1 = new int[3][3];
        System.out.println("Ingrese 9 numero a comprobar");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz1[i][j] = input.nextInt();
            }

        }
        //muestra la primer matris con los numeros ingresados.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + "[" + Matriz1[i][j] + "]");
                System.out.print("");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int diagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonal += Matriz1[i][j];
                }

            }

        }
        int fila0 = 0;
        int fila1 = 0;
        int fila2 = 0;
        int col0 = 0;
        int col1 = 0;
        int col2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        fila0 += Matriz1[i][j];
                        break;
                    case 1:
                        fila1 += Matriz1[i][j];
                        break;
                    case 2:
                        fila2 += Matriz1[i][j];
                        break;

                }
                switch (j) {
                    case 0:
                        col0 += Matriz1[i][j];
                        break;
                    case 1:
                        col1 += Matriz1[i][j];
                        break;
                    case 2:
                        col2 += Matriz1[i][j];
                        break;

                }
            }
        }
        System.out.println("diagonal " + diagonal);
        System.out.println("fila0 " + fila0);
        System.out.println("fila1 " + fila1);
        System.out.println("fila2 " + fila2);
        System.out.println(" ");
        System.out.println("col0"  + col0);
        System.out.println("col1 " + col1);
        System.out.println("col2 " + col2);
        if (diagonal==fila0 && diagonal==fila1 && diagonal== fila2 && diagonal==col0 && diagonal==col1 && diagonal==col2) {
            System.out.println("["+" Es Magica"+"]");
        }else{
             System.out.println("["+" No es Magica"+" ]");
        }
    }
}
