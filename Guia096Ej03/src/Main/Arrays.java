/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.ArrayService;
import java.util.Random;

/**
 *
 * @author User
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayService as = new ArrayService();
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        System.out.println("[" + "Se Inicializa el VectorA DesOrganizado" + "]");
        System.out.println("---------------------");
        as.inicializarA(vectorA);
        as.mostrar(vectorA);
        System.out.println("");
        System.out.println("Se Ordena de Mayor a Menor El VectorA");
        System.out.println("---------------------");
        as.ordenar(vectorA);
        System.out.println("");
        as.inicializarB(vectorA, vectorB);
        
        as.mostrar(vectorA);
        System.out.println("");
        System.out.println("Se Copian Los Primeros 10 Numeros de A en B y");
        System.out.println("Se llenan los Ultimos 10 Indices con 0,5");
        System.out.println("---------------------");
        as.mostrar(vectorB);
        System.out.println("");
        System.out.println("Se Muestran sus respectivos lugares en Memoria");
        System.out.println("---------------------");
        System.out.println("El Vector A es: " + "[" + vectorA + "]");

        System.out.println(" ");
        System.out.println("El Vector B es: " + "[" + vectorB + "]");

    }

}
