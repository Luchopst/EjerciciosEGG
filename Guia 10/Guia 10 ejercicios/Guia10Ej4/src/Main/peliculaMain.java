/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.peliculaService;
import java.util.Scanner;

public class peliculaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        peliculaService p = new peliculaService();
//        p.crearpelicula();       // Metodo Para Cargar A MANO
        p.cargarVariasPeliculas(); // Metodo Para Cargado automatico
        p.Mostrar();
        p.MostrarMayorHora();
        System.out.println("Pulse una ENTER para continuar");
        input.next();
        System.out.println("-----------");
        System.out.println("Ordenados Por Duracion");
        p.ordenPorDuracion();
        p.Mostrar();
        System.out.println("Pulse una ENTER para continuar");
        input.next();
        System.out.println("-----------");
        System.out.println("Ordenados Por Titulos");
        p.ordenPorTitulo();
        p.Mostrar();
        System.out.println("Pulse una ENTER para continuar");
        input.next();
        System.out.println("-----------");
        System.out.println("Ordenados Por Director");
        p.ordenPorDirector();
        p.Mostrar();

    }
}
