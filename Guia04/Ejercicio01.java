/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 * @author User
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero a Calcular");
        int numA = input.nextInt();
        System.out.println("Ingrese el Segundo Numero a Calcular");
        int numB = input.nextInt();
        System.out.println("Ingrese la Opcion deseada");
        System.out.println("[" + "MENU" + "]");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");

        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("La Suma Es: " + suma(numA, numB));
                break;
            case 2:
                System.out.println("La Resta Es: " + Resta(numA, numB));
                break;
            case 3:
                System.out.println("La Multiplicacion Es: "+ Multiplicacion(numA, numB));
                break;
            case 4:
                System.out.println("La Divicion Es: "+ Divicion(numA, numB));

                break;

        }

    }

    public static int suma(int A, int B) {
        int resultado = 0;
        resultado = A + B;
        return resultado;
    }

    public static int Resta(int A, int B) {
        int resultado = 0;
        resultado = A - B;
        return resultado;
    }

    public static int Multiplicacion(int A, int B) {
        int resultado = 0;
        resultado = A * B;
        return resultado;
    }

    public static int Divicion(int A, int B) {
        int resultado = 0;
        if (B == 0) {
            System.out.println("No se puede efectuar el calculo");   
        } else {
            resultado = A / B;
        }
        return resultado;
    }
}
