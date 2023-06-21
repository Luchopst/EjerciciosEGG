/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PeliculaService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Pelicula pelicula = new Pelicula();
    ArrayList<Pelicula> ListaPeliculas = new ArrayList<>();
    Random rand = new Random();

    public Pelicula GenerarPeliculasAuto() {
        int edadMin;
        double duracion;
        System.out.println("Ingrese La Cantidad de Peliculas a Crear");
        int cant = input.nextInt();
        for (int i = 0; i < cant; i++) {
            edadMin = rand.nextInt(60);
            duracion = rand.nextInt(2500);
            Pelicula pelicula = new Pelicula("titulo" + i + 1, duracion, edadMin, "Director" + i + 2);
            ListaPeliculas.add(pelicula);
        }
        return pelicula;
    }//termina el metodo GenerarPeliculasAuto()

   public Pelicula GenerarPeliculasManual() {
    String resp;
    do {
        System.out.println("Desea ingresar una Pelicula? S/N");
        resp = input.next();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el Titulo");
            pelicula.setTitulo(input.next());
            System.out.println("Ingrese la Duracion");
            pelicula.setDuracion(input.nextDouble());
            System.out.println("Ingrese la Edad Permitida");
            pelicula.setEdadMinima(input.nextInt());
            ListaPeliculas.add(pelicula);
        } else if (resp.equalsIgnoreCase("n")) {
            System.out.println("Gracias por su visita");
            break; // Salir del bucle cuando se ingresa "n"
        } else {
            System.out.println("Respuesta inválida. Por favor, ingrese 'S' o 'N'.");
        }
    } while (!(resp.equalsIgnoreCase("n"))); // Bucle infinito

    return pelicula;
}//termina el metodo GenerarPeliculasMaual() 


    public void MostrarListaDePeliculas() {
        for (Pelicula ListaDePeliculas : ListaPeliculas) {
            System.out.println(ListaDePeliculas.toString());
        }
    }//termina el metodo MostrarListaDePeliculas()
}
