/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 *Escribir un programa que pida dos números 
 * enteros por teclado y calcule la suma de los dos.
 * El programa deberá 
 * después mostrar el resultado de la suma
 * @author User
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos Numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La Suma de los dos Numeros es: " + (num1+num2));
        
    }
}
