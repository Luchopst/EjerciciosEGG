/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01;

import Guia07Entidad.Puntos;

/**
 *
 * @author User
 */
public class CalcularDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos P = new Puntos();
        P.solicitarDatos();
        
        System.out.println(" la Distancia  es  :" + P.calculoDistancia());
    }
    
}
