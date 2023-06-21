/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01;

import Guia07Entidad.ejercicio04class;

/**
 *
 * @author User
 */
public class Ejercicio04main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ejercicio04class Ej =new ejercicio04class();
        
        Ej.solicitarDatos();
        
       // se Muestran Los resultados de los calculos
        System.out.println("La Superficie es: " + Ej.Superficie());
        System.out.println("El Perimetro es: " + Ej.perimetro());
        Ej.rectangulo();
    }
    
}
