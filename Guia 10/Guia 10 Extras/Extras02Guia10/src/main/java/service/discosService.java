package service;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos
 * y tendrá como atributos el nombre y discoConMasVentas.
 *
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar
 * 5 objetos de tipo CantanteFamoso a la lista.
 *
 * Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas
 * por pantalla.
 *
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al
 * usuario de agregar un cantante más, mostrar todos los cantantes, eliminar un
 * cantante que el usuario elija o de salir del programa.
 *
 * Al final se deberá mostrar la lista con todos los cambios.
 *
 * @author User
 */
public class discosService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    ArrayList<CantanteFamoso> c = new ArrayList();

    public void Crear() {
        /**
         * se comenta el ingreso manual de cantantes para utilizar el
         * automatico..
         *
         * System.out.println("Ingrese el nombre"); String nombre =
         * input.next(); System.out.println("ingrese el disco"); int disco =
         * input.nextInt(); CantanteFamoso cf = new CantanteFamoso(nombre,
         * disco); c.add(cf);
         */

        for (int i = 0; i < 5; i++) {
            CantanteFamoso cf = new CantanteFamoso("Luis Miguel " + (i + 1), 15 + (i + 3));
            c.add(cf);
        }
    }

    public void nuevoIngreso() {
        boolean s = true;
        String resp = "";
        do {
            System.out.println("Desea ingresar Otro");
            resp = input.next();
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre");
                String nombre = input.next();
                System.out.println("ingrese el disco");
                int disco = input.nextInt();
                CantanteFamoso cf = new CantanteFamoso(nombre, disco);
                c.add(cf);
            } else {
                s = false;
            }
        } while (s);

    }

    public void Mostrar() {
        for (CantanteFamoso cantanteFamoso : c) {
            System.out.println(cantanteFamoso);

        }
    }

    public void Eliminar() {
        Iterator<CantanteFamoso> it = c.iterator();
        String s = "";
        String var = "";
        do {
            System.out.println("Desea ELIMINAR algun Cantante de la Lista? responda s/n");
            s = input.next();
            if (s.equalsIgnoreCase("s")) {

                System.out.println("Ingrese el Nombre del cantante a Eliminar");
                var = input.next();
                while (it.hasNext()) {
                    if (it.next().getNombre().equalsIgnoreCase(var)) {
                        it.remove();
                    }
                }
            } else {
                System.out.println("Respuesta Incorrecta");

            }
        } while (s.equalsIgnoreCase("s"));

    }
}
