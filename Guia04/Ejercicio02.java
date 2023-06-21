/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author User
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String val;
        do {
            ingreso();

            System.out.println("Desea Continuar? S/N");
            val = input.nextLine();
        } while (!val.equalsIgnoreCase("n"));
    }

    public static void ingreso() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        String nombre = input.nextLine();
        System.out.println("Ingrese la Edad");
        int edad = input.nextInt();
        if (edad >= 18) {
            System.out.println(nombre + " con edad: " + edad + " Es Mayor de Edad");
        } else {
            System.out.println(nombre + " con edad: " + edad + " Es Menor de Edad");
        }

    }
}
