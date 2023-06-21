/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guía03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1: FALTA TERMINAR
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
    1 día, 2 horas.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("*INGRESE LOS MINUTOS A CONVERTIR*");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int cantDias = horas / 24;
        int cantHoras = horas % 24;

        System.out.print("*EQUIVALENTE EN DÍAS Y HORAS: " + cantDias + " DÍAS, " + cantHoras + " HORAS. ");
    }

}
