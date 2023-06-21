/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

/**
 *
 * @author User
 */
public class juegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego play = new Juego();

        for (int i = 0; i < 3; i++) {
            play.ingresoDeDatos();
            play.iniciarjuego();
        }

        play.Puntaje();

    }

}
