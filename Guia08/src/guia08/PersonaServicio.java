/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PersonaServicio {
    
    public Persona CrearPersonas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String nombre=input.next();
        System.out.println("Ingrese Edad");
        int edad = input.nextInt();
        System.out.println("Ingrese  DNI");
        int dni=input.nextInt();
        return new Persona(nombre,edad,dni);
       
    }
    public void Mostrar(Persona P1){
        System.out.println(P1.getNombre());
        System.out.println(P1.getDNI());
        System.out.println(P1.getEdad());
    }
}
