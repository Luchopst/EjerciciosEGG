/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad.Ejercicio06;

/**
 *
 * @author User
 */
public class EmpleadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado EMP  = new Empleado("Juan ",35,100000); 
        EMP.calcularAumento();
        Empleado EMP2 = new Empleado("Hector ",40,4500000); 
        EMP2.calcularAumento();
        Empleado EMP3 = new Empleado("Adrian te amo hector!!! ",27,20000); 
        EMP3.calcularAumento();
        
    }
}
