/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * • • • • •
 *
 * @author User
 */
public class CartaService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<carta> Descarte = new ArrayList<>();//en este arreglo se guardaran las cartas salientes de MAZO

    public ArrayList<carta> crearMazo() {
        ArrayList<carta> Mazo = new ArrayList<>();
        String palo = "";

        carta c = new carta();
        for (int i = 1; i < 13; i++) {
            if (i == 8 || i == 9) {
                //no realiza ninguna accion
            } else {
                for (int j = 1; j < 5; j++) {
                    switch (j) {
                        case 1:
                            palo = "Oro";
                            break;
                        case 2:
                            palo = "Copas";
                            break;
                        case 3:
                            palo = "Espada";
                            break;
                        case 4:
                            palo = "Basto";
                            break;
                    }
                    Mazo.add(new carta(i, palo));
                }
            }
        }
        return Mazo;
    }
//barajar(): cambia de posición todas las cartas aleatoriamente.

    public void Barajar(ArrayList<carta> Mazo) {
        Collections.shuffle(Mazo);//este realiza un random desntro de la coleccion
    }
//siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
// no haya más o se haya llegado al final, se indica al usuario que no hay más
// cartas.

    public void siguienteCarta(ArrayList<carta> Mazo) {
        if (Mazo.size() < 1) {
            System.out.println("No hay Cartas en el Mazo");
        } else {

            System.out.println(Mazo.get(0).toString());
            Descarte.add(Mazo.get(0));
            Mazo.remove(0);

        }
    }
//cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    public void cartasDisponibles(ArrayList<carta> Mazo) {
        System.out.println("Las Cartas restantes son: " + Mazo.size());
    }
// darCartas(): dado un número de cartas que nos pidan, le devolveremos
// ese número de cartas. En caso de que haya menos cartas que las pedidas, no
// devolveremos nada, pero debemos indicárselo al usuario.

    public void darCartas(ArrayList<carta> Mazo) {
        System.out.println("Ingrese La Cantidad de Cartas deseada");
        int cant = input.nextInt();
        for (int i = 0; i < cant; i++) {
            if (Mazo.size() < cant) {
                System.out.println("No Hay Cartas Suficientes Para Repartir");
            } else {
                siguienteCarta(Mazo);
            }

        }
    }
// cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
// indicárselo al usuario

    public void cartasMonton(ArrayList<carta> Mazo) {
        System.out.println("Las Cartas que Ya salieron son: " + Descarte.size());
    }
// mostrarBaraja(): muestra todas las cartas hasta el
// final. Es decir, si se saca una carta y luego se llama al método, este no
// mostrara esa primera carta.

    public void mostrarBaraja(ArrayList<carta> Mazo) {
        System.out.println("Las Cartas en el Mazo Son: " + Mazo.toString());
    }

    public void menu(ArrayList<carta> Mazo) {
        String resp = "";
        int opcion = 0;

        do {
            System.out.println("Seleccione Una Opcion");
            System.out.println("---------------------");
            System.out.println("1-Barajar");
            System.out.println("2-Siguiente Carta");
            System.out.println("3-Cartas Disponibles");
            System.out.println("4-Dar Cartas");
            System.out.println("5-cartas Monton");
            System.out.println("6-Mostrar Baraja");
            System.out.println("7-salir");

            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    Barajar(Mazo);
                    break;
                case 2:
                    siguienteCarta(Mazo);
                    break;
                case 3:
                    cartasDisponibles(Mazo);
                    break;
                case 4:
                    darCartas(Mazo);
                    break;
                case 5:
                    cartasMonton(Mazo);
                    break;
                case 6:
                    mostrarBaraja(Mazo);
                    break;
                case 7:
                    System.out.println("KATTY PERRY");
                    ;
                    break;
            }

        } while (opcion != 7);

    }
}
