/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01;

import Guia07Entidad.Operacion;

/**
 *
 * @author User
 */
public class Ejercicio3Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        operacion.suma();
        System.out.println("La Suma Es: ");
        System.out.println(operacion.suma());
        System.out.println("La Resta es: ");
        System.out.println(operacion.resta());
        System.out.println("La motiplicacion es: ");
        System.out.println(operacion.multiplicacion());
        System.out.println("La Division es: ");
        System.out.println(operacion.division());
}       
        
        

    }
    
    

