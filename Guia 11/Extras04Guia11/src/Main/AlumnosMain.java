/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.Simulador;
import java.util.List;

/**
 *
 * @author User
 */
public class AlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        List<String> listadoDNIs = simulador.generarListadoAlumnos(10, 10000000, 20000000);

        // Imprimir listado de DNIs generados
        for (String dni : listadoDNIs) {
            System.out.println(dni);
        }
    }
}
