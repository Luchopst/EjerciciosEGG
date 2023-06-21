package main;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;
import service.discosService;

public class discosMain {

    /**
     * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
     * famosos y tendrá como atributos el nombre y discoConMasVentas.
     *
     * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y
     * agregar 5 objetos de tipo CantanteFamoso a la lista.
     *
     * Luego, se debe mostrar los nombres de cada cantante y su disco con más
     * ventas por pantalla.
     *
     * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción
     * al usuario de agregar un cantante más, mostrar todos los cantantes,
     * eliminar un cantante que el usuario elija o de salir del programa.
     *
     * Al final se deberá mostrar la lista con todos los cambios.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<CantanteFamoso> cf = new ArrayList();          // lista
        discosService ds = new discosService();                          //objeto

        ds.Crear();
        System.out.println("La Lista Esta Conformada Por: ");
        ds.Mostrar();
        System.out.println("------------------------------------");
        ds.nuevoIngreso();
        ds.Mostrar();
        System.out.println("------------------------------------");
        ds.Eliminar();
        ds.Mostrar();
        System.out.println("------------------------------------");

    }
}
