/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01;

import Guia07Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PooEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Luciano", 34, 34235813);
        Persona p2 = new Persona("Andrea", 30, 37021037);
        Scanner input = new Scanner(System.in);
        Persona p3 = new Persona(input.next(), input.nextInt(), input.nextInt());
        System.out.println("Ingrese Nombre");
        String Nombre = input.next();
        System.out.println("Ingrese Edad");
        int Edad = input.nextInt();
        System.out.println("Ingrese DNI");
        int DNI = input.nextInt();
        Persona p4 = new Persona(Nombre, Edad, DNI);
        System.out.println(" " + p1);
        System.out.println(" " + p2);
        System.out.println(" " + p3);
        System.out.println(" " + p4);
        p1.nombre = "Edgardo";
        System.out.println(" " + p1);
    }

}
