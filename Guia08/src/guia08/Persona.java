/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, int edad, int DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }
    
}
