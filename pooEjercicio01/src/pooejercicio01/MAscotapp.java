package pooejercicio01;

import Guia07Entidad.Mascota;
import java.util.Scanner;

public class MAscotapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");

        Mascota m1 = new Mascota("Fernando Chiquito", input.next(), "perro");

        m1.setnombre("pepe chiquito");
        System.out.println(m1.getnombre());
        System.out.println(m1);

    }

}
