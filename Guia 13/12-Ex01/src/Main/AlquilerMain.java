/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class AlquilerMain {

    /**
     * Utilizando la herencia de forma apropiada, deberemos programar en Java,
     * las clases y los métodos necesarios que permitan al usuario elegir el
     * barco que quiera alquilar y mostrarle el precio final de su alquiler.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler();
        alquiler.crearAlquiler();
        
    }
}
