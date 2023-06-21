package main;

import entidad.Jugador;
import entidad.RevolverDeAgua;
import entidad.juego;
import java.util.ArrayList;

public class JuegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevolverDeAgua rda =new RevolverDeAgua();
        ArrayList<Jugador> gamers = new ArrayList();
        Jugador j = new Jugador();
        juego jue = new juego();
        System.out.println("Comienza el juego");
        gamers.addAll(j.ingreso());
        System.out.println("-------------------");
        jue.llenarJuego();
        System.out.println("-------------------");
        jue.ronda(gamers);
       
        
    }
    
}
