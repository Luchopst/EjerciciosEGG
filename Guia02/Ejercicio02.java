/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia02;

import java.util.Scanner;

/**
 *Escribir un programa que pida tu nombre, 
 * lo 
 * guarde en una variable y lo muestre por pantalla.
 * @author User
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese Su Nombre");
        String Nombre = leer.nextLine();
        System.out.println("Hola Soy " + Nombre + " Un gusto");
    }
}
