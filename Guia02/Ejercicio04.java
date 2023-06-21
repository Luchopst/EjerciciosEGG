/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se 
 * debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author User
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los Grados");
        int C = leer.nextInt();
        int f = 32 + (9*C/5);
        System.out.println("El equivalente es: " +  "[" + f + "]");
        
    }
}
