/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Para representar la sala con los espectadores vamos a utilizar una matriz.
 * Los asientos son etiquetados por una letra y un número la fila A1 empieza al
 * final del mapa como se muestra en la tabla. También deberemos saber si el
 * asiento está ocupado por un espectador o no, si esta ocupado se muestra una
 * X, sino un espacio vacío. 8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X 7 A X
 * |7 B X | 7 C X | 7 D X | 7 E | 7 F X 6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6
 * F 5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X 4 A X | 4 B X | 4 C X | 4 D X
 * | 4 E X | 4 F X 3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X 2 A X | 2 B | 2 C
 * X | 2 D X | 2 E X | 2 F 1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X Se debe
 * realizar una pequeña simulación, en la que se generen muchos espectadores y
 * se los ubique en los asientos aleatoriamente (no se puede ubicar un
 * espectador donde ya este ocupado el asiento). Los espectadores serán ubicados
 * de uno en uno y para ubicarlos tener en cuenta que sólo se podrá sentar a un
 * espectador si tiene el dinero suficiente para pagar la entrada, si hay
 * espacio libre en la sala y si tiene la edad requerida para ver la película.
 * En caso de que el asiento este ocupado se le debe buscar uno libre. Al final
 * del programa deberemos mostrar la tabla, podemos mostrarla con la letra y
 * numero de cada asiento o solo las X y espacios vacíos.
 *
 * @author User
 */
public class CineService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Espectador espectador = new Espectador();
    Random rand = new Random();
    Pelicula pelicula = new Pelicula();
    Cine cine = new Cine();
    ArrayList<Espectador> ListaDeEspectadores = new ArrayList<>();
    Sala sala = new Sala();
    PeliculaService ps = new PeliculaService();

    char letra = 'A';

    public void Matriz() {
        String[][] matriz = new String[8][6];
        for (int j = 7; j >= 0; j--) { // muestra los numeros del 8 al 1
            letra = 'A';

            for (int i = 5; i >= 0; i--) { // muestra las letras de la A a la F
                matriz[j][i] = " ";
                System.out.print((j + 1) + "" + (letra) + "[" + "   " + "]");
                letra++;
            }

            System.out.println("  ");
        }
        sala.setAsientos(matriz);
    }

    public Espectador GenerarEspectadoresAuto() {
        int e;
        double dinero;
        System.out.println("Ingrese La Cantidad de Espectadores a Crear");
        int cant = input.nextInt();
        for (int i = 0; i < cant; i++) {
            e = rand.nextInt(60);
            dinero = rand.nextInt(2500);
            Espectador epectador = new Espectador(" X " + i + 1 + " ", e, dinero);
            ListaDeEspectadores.add(epectador);
        }
        return espectador;
    }

    public Espectador GenerarEspectadoresMaual() {
        System.out.println("Ingrese el nombre");
        espectador.setNombre(input.next());
        System.out.println("Ingrese la Edad");
        espectador.setEdad(input.nextInt());
        System.out.println("Ingrese el Dinero Disponible");
        espectador.setDineroDisponible(input.nextDouble());
        ListaDeEspectadores.add(espectador);
        return espectador;
    }

    public void MostrarListaDeEspectadores() {
        for (Espectador ListaDeEspectadore : ListaDeEspectadores) {
            System.out.println(ListaDeEspectadore.toString());
        }
    }

    public void llenarMatriz() {
        int cont = 1;
        boolean bandera = true;
        for (Espectador Espect : ListaDeEspectadores) {
            String nom = Espect.getNombre();
            int fila = rand.nextInt(7);
            int columna = rand.nextInt(5);
            if (Espect.getEdad() >= pelicula.getEdadMinima()) {
                if (Espect.getDineroDisponible() >= cine.getPrecioEntrada()) {
                    sala.getAsientos()[fila][columna] += nom;
                    System.out.println("Espectador Apto"+ cont);
                } else {
                    System.out.println("Dinero Isuficiente");
                    bandera = false;
                }

            } else {
                System.out.println("Edad no Apta");
                bandera = false;
            }

        }

    }

    public void Mostrar() {
        for (int j = 7; j >= 1; j--) {
            letra = 'A';
            for (int i = 5; i >= 0; i--) {

                System.out.print((j + 1) + "" + (letra) + "[   " + sala.getAsientos()[j][i] + "   ]");
                letra++;
            }

            System.out.println("  ");
        }
    }

    public void Menu() {
        int opcion = 0;
        boolean bandera = true;
        do {
            System.out.println("        -------------");
            System.out.println("        Menu Prinsipal");
            System.out.println("        -------------");
            System.out.println("    Ingrese la Opcion deseada");
            System.out.println("1- Ingresar como Administrador");
            System.out.println("2-    Ingresar como Cliente");
            System.out.println("3-           Salir");

            switch (opcion = input.nextInt()) {
                case 1:
                    MenuAdm();
                    break;
                case 2:
                    MenuCliente();
                    break;
                case 3:
                    System.out.println("Gracias Vuelvas Prontos!!!");
                    bandera = false;
                    break;
            }
        } while (bandera);
    }

    public void MenuAdm() {
        int opcion = 0;
        boolean bandera = true;
        do {
            System.out.println("       ---------------");
            System.out.println("      Menu Administrador");
            System.out.println("       ---------------");
            System.out.println("   Ingrese la Opcion deseada");
            System.out.println("1-crear Peiculas Manualmente");
            System.out.println("2-crear Peliculas Automaticamente");
            System.out.println("3-crear Espectadores Manualmente");
            System.out.println("4-crear Espectadores Automaticamente");
            System.out.println("5-salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    ps.GenerarPeliculasManual();
                    ps.MostrarListaDePeliculas();

                    break;

                case 2:
                    ps.GenerarPeliculasAuto();
                    ps.MostrarListaDePeliculas();

                    break;

                case 3:
                    GenerarEspectadoresMaual();
                    MostrarListaDeEspectadores();
                    break;
                case 4:
                    GenerarEspectadoresAuto();
                    MostrarListaDeEspectadores();
                    break;

                case 5:
                    System.out.println("Gracias Vuelvas Prontos!!!");
                    bandera = false;
                    break;
            }
        } while (bandera == true && opcion == 5);
    } // aca termina enl MenuAdm

    public void MenuCliente() {
        int opcion = 0;
        boolean bandera = true;
        do {
            System.out.println("  ---------------");
            System.out.println("   Menu Clientes");
            System.out.println("  ---------------");
            System.out.println("Ingrese la Opcion deseada");
            System.out.println("1-Lista de Peliculas");
            System.out.println("2-Comprar Entrada");
            System.out.println("3-Lugares Disponibles");
            System.out.println("4-    salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    if (ps.ListaPeliculas.isEmpty()) {
                        System.out.println("No hay Peliculas Disponibles");
                        System.out.println("Intente Mas Tarde");
                    } else {
                        ps.MostrarListaDePeliculas();
                    }

                    break;
                case 2:
                    comprarEntradas();
                    break;
                case 3:
                    
                    Mostrar();
                    break;
                case 4:
                    System.out.println("Gracias Vuelvas Prontos!!!");
                    bandera = false;
                    break;
            }
        } while (bandera && opcion == 4);
    }

    public void comprarEntradas() {
        System.out.println("Ingrese La Cantidad de entradas a Comprar");
        int cant = 0;
        for (int i = 1; i < cant; i++) {
            if (ps.ListaPeliculas.isEmpty()) {
                System.out.println("No hay Peliculas Disponibles");
                System.out.println("Intente Mas Tarde");
            }
            GenerarEspectadoresMaual();
        }
    }
}
