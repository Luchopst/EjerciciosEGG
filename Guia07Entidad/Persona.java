/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;



/**
 *
 * @author User
 */
public class Persona {
    public String nombre;
    public int edad;
    public int DNI;

    public Persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + '}';
    }
    
}
