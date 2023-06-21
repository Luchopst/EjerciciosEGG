/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 *
 * @author User
 */
public class equipo {
    private ArrayList <jugador> jugadores;

    public equipo() {
    }

    public equipo(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipo{" + "jugadores=" + jugadores + '}';
    }

 
}
