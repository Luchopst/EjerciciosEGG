package entidad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver
 *
 * • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe
 * los jugadores y el revolver para guardarlos en los atributos del juego.
 *
 * @author User
 */
public class juego {

    private ArrayList<Jugador> jugadores1;
    private RevolverDeAgua revolver = new RevolverDeAgua();

    public juego() {
    }

    public juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores1 = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores1() {
        return jugadores1;
    }

    public void setJugadores1(ArrayList<Jugador> jugadores1) {
        this.jugadores1 = jugadores1;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "juego{" + "jugadores1=" + jugadores1 + ", revolver=" + revolver + '}';
    }

    public void llenarJuego() {
//     llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//     y el revolver para guardarlos en los atributos del juego.
        revolver.llenarRevolver();
        System.out.println(revolver.toString());
    }
//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

    public void ronda(ArrayList <Jugador> j) {
        
        System.out.println("nueva Ronda");
//     ArrayList <Jugador> jugadores = new ArrayList<>();
        for (Iterator<Jugador> it = j.iterator(); it.hasNext();) {
            
            Jugador jugador = it.next();
            jugador.Disparo(revolver, jugador);
            if (jugador.isMojado()) {
                jugador.setMojado(true);
            }
        }
        System.out.println("-------------------");
        System.out.println(j.toString());
    }
}
