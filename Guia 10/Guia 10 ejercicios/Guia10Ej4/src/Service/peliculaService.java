/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.pelicula;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class peliculaService {

    private Random rand = new Random();
    private ArrayList<pelicula> listaPeliculas = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    pelicula p1 = new pelicula();
    

    public void crearpelicula() {
        String respuesta = "";
        boolean s = true;
        do {
            System.out.println("ingrese el titulo de la Pelicula Nombre ");
            p1.setTitulo(input.next());
            System.out.println("Ingrese el Nombre del Director de la Pelicula ");
            p1.setDirector(input.next());
            System.out.println("Ingrese la Duracion de la Pelicula en hs ");
            p1.setDuracion(input.nextDouble());
            listaPeliculas.add(new pelicula(p1.getTitulo(), p1.getDirector(), p1.getDuracion()));
            System.out.println("--------------");
            System.out.println("Desea Ingresar Otra Pelicula? responda " + "[" + "S/N" + "]");
            respuesta = input.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                System.out.println("Gracias por Su visita");
            }
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println(listaPeliculas.size());
    }

    public void Mostrar() {//muestra todas las peliculas ingresadas
        for (pelicula listaAux : listaPeliculas) {
            System.out.println(listaAux);

        }
    }

    public void MostrarMayorHora() {
        for (pelicula listaAux : listaPeliculas) {
            pelicula pell = listaAux;
            if (pell.getDuracion() > 0.50) {
                System.out.println("Pelicula con duracion mayor a 1hs: " + listaAux);
            }
        }

    }

    public void cargarVariasPeliculas() {
        Double durac = 0.00;

        for (int i = 1; i <= 20; ++i) {

            listaPeliculas.add(new pelicula("Peli " +rand.nextInt(1000), "Carlos Chiquito" + rand.nextInt(100), rand.nextDouble()));
        }
    }
          
    public void ordenPorTitulo(){
        listaPeliculas.sort(pelicula.OrdenarPorTitulo);
    }
    public void ordenPorDuracion(){
        listaPeliculas.sort(pelicula.OrdenarPorDuracion);
    }
    public void ordenPorDirector(){
        listaPeliculas.sort(pelicula.OrdenarPorDirector);
    }

}
