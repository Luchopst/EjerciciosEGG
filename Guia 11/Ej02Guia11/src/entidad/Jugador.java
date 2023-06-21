/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6.
 *
 * @author User
 */
public class Jugador {

    private String nombre;
    private int id;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador( int id,String nombre) { 
        
        this.nombre = nombre;
        this.id = id;
        this.mojado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", mojado=" + mojado + "}\n";
    }

    public ArrayList <Jugador> ingreso() {
        ArrayList <Jugador> jugadores = new ArrayList<>();
        juego jue = new juego();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el numero de Jugadores entre 1 y 6");
        int valor = input.nextInt();
        if ((valor < 1) || (valor > 6)) {
            valor = 6;
        }
        for (int i = 1; i <= valor; i++) {
          
           jugadores.add(new Jugador(i, "jugador" + i));
           jue.getJugadores1();
        }
        
        System.out.println(jugadores.toString());
        return jugadores;
    }
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
 public boolean Disparo(RevolverDeAgua r,Jugador j ){
     boolean aguaTirada=r.mojar();
     r.siguienteChorro();
     if (aguaTirada){
         System.out.println("mojadoo");
         j.setMojado(true);
     }else{
         System.out.println("Te Salvaste!!!!!");
     }
     return aguaTirada;
 }
}
