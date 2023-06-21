/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 * @author User
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         System.out.println("Ingrese El Monto");
        double monto = input.nextDouble();
        System.out.println("\nSeleccione la Moneda");
        System.out.println(" ");
        System.out.println("1-Dolar");
        System.out.println("2-yan");
        System.out.println("3-libra");
        int menu = input.nextInt();
       
        switch (menu) {
            case 1:
                ConvertiALibra(monto);
                break;
                case 2:
                ConvertiADolar(monto);
                break;
                case 3:
                ConvertiYen(monto);
                break;  
                default: System.out.println("Opcion no Valida");
        }
    }

    public static void ConvertiALibra(double monto) {
        double libra = (monto * 0.86);
        System.out.println("El resultado del Cambio: " + libra);
    }

    public static void ConvertiADolar(double monto) {
        double dolar = (monto * 1.28);
        System.out.println("El resultado del Cambio: " + dolar);
    }

    public static void ConvertiYen(double monto) {
        double yen = (monto * 129.85);
        System.out.println("El resultado del Cambio: " + yen);
    }
}
