/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author User
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Pepe", "Dogui", 12, "Dogo");

        Animal gato = new Gato("Michi", "Gaty", 15, "Siames");

        Animal caballo = new Caballo("Peny", "Pasto", 10, "Saino");
        perro.Alimento();
        gato.Alimento();
        caballo.Alimento();
    }
}
