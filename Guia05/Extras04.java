/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 *
 * @author User
 */
public class Extras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vector = new double[10];
        int aprov = 0;
        int desaprov = 0;
        double prom = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingresar la 1° nota de trabajos prácticos evaluativos");
            double evaluativo_1 = input.nextDouble();
            System.out.println("Ingresar la 2° nota de trabajos prácticos evaluativos");
            double evaluativo_2 = input.nextDouble();
            System.out.println("Ingresar la 1° nota de Parciales");
            double parciales_1 = input.nextDouble();;
            System.out.println("Ingresar la 1° nota de Parciales");
            double parciales_2 = input.nextDouble();;
            prom = (evaluativo_1 * 0.10) + (evaluativo_2 * 0.15) + (parciales_1 * 0.25) + (parciales_2 * 0.50);
            vector[i] = prom;
            System.out.println("Notas: " + vector[i]);
            if (prom > 7) {

                aprov++;
               
            } else {
                desaprov++;
          }       
        } 
            System.out.println(" Aprovados" + aprov);
            System.out.println(" Desaprovados" + desaprov);
       
    }
}
