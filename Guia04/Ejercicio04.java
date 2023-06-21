/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 *
 * @author User
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Numero");
        int num = input.nextInt();
        System.out.println("El Numero es Primo: " + EsPrimo(num));
    }

    public static boolean EsPrimo(int num) {
        boolean ret = true;

        if (num <= 1) {
            ret = false;
        } else if (num == 2 || num == 3) {
            ret = true;
        } else if (num % 2 == 0) {
            ret = false;
        } else{
            for (int i = 3; i < num; i += 2) {
                if (num % i == 0) {
                    ret = false;
                    System.out.println(i);
                }
            }
        }
        return ret;
    }
}
