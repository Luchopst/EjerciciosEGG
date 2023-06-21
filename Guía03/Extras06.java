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
public class Extras06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        double promedioMenor = 0;
        double promedioGral = 0;
        double sumaMenor = 0;
        double sumaGral = 0;
        int sumaCantMenores =0;
        System.out.println("INGRESE LA CANTIDAD DE PERSONAS:");
        int cantPersonas = leer.nextInt();
        for (int i = 0; i <cantPersonas; i++) {
            System.out.println("INGRESE LA ALTURA PARA LA PERSONA " + i+":");
            double altura = leer.nextDouble();
            if(altura < 1.60) {
                sumaMenor = sumaMenor + altura;
                sumaCantMenores++;
            }
            sumaGral = sumaGral + altura;
        }
        promedioMenor= sumaMenor/cantPersonas+1;
        promedioGral= sumaGral/cantPersonas+1;
        System.out.println("***Promedio de estaturas que se encuentran por debajo de 1.60 mts.: " + promedioMenor);
        System.out.println("***Promedio general de estaturas: " + promedioGral);

    }

}
    
    

