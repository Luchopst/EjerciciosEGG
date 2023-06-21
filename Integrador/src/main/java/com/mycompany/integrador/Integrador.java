/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.integrador;

import Service.Escuela;

/**
 *
 * @author User
 */
public class Integrador {

    public static void main(String[] args) {
     
        Escuela esc = new Escuela();
        double promedio = esc.promedioNotas();
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] nombres = esc.nombresMayoresAlPromedio();
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
