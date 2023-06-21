/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidad.Perro;
import entidad.Persona;

/**Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 *
 * @author User
 */
public class PersonaPerro {


    public static void main(String[] args) {
        Perro perro1=new Perro("pepe", "dogo",12,15.3);
        Perro perro2=new Perro("pepa", "doberman",5,20.6);
        
        Persona p1 =new Persona("Carlos", "Lem",25,34568587);
        Persona p2 =new Persona("Cacho", "jjj",45,40568587);
        
        p1.setPerro(perro2);
        p2.setPerro(perro1);
        
        System.out.println  (p1);
        System.out.println("-----------");
        System.out.println(p2);
        
    }
    
}
