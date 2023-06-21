/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        Rectangulo rec1 = new Rectangulo();
        

        rec.setLado1(65);
        rec.setLado2(82);
        rec.CalcularArea();
        rec.calcularPerimetro();
        System.out.println("El Superficie es: " + rec.getSuperficie());
        System.out.println("El Perimetro es: " + rec.getPerimetro());
        System.out.println(" ");
        System.out.println("Ingrese el Lado 1 ");
        rec1.setLado1(input.nextDouble());
        System.out.println("Ingrese el Lado + 2 ");
        rec1.setLado2(input.nextDouble());
        rec1.CalcularArea();
        rec1.calcularPerimetro();
        System.out.println("El Superficie es: " + rec1.getSuperficie());
        System.out.println("El Perimetro es: " + rec1.getPerimetro());
    }

}
