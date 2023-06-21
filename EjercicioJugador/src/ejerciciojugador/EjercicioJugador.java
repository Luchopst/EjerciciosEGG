/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojugador;

import entidad.equipo;
import entidad.jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EjercicioJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugador j1 = new jugador("pepe", "chiquito", 5 , 11);
        jugador j2 = new jugador("juan", "Aguirre", 4, 2 );
        jugador j3 = new jugador("Cacho", "jjjjj", 6 , 12);
        jugador j4 = new jugador("veto", "gggg", 8, 10);
        List<jugador> listaEquipo = new ArrayList<jugador> ();
        listaEquipo.add(j1);
        listaEquipo.add(j2);
        listaEquipo.add(j3);
        listaEquipo.add(j4);
        for (jugador object : listaEquipo) {
            System.out.println("lista"+object);
        }
        
    }
    
}
