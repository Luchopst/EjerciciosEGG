/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 *
 * @author User
 */
public class Ejercicio13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String aux="";
        System.out.println("Ingrese la Cantidad de Compañeros");
        int n = input.nextInt();
        String[] Equipo = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del Compañero");
            Equipo[i]=input.next();
            aux+= "  " + Equipo[i];
            
        }
        System.out.println(aux);
    }
   
}
