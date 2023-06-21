/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Estudiante;

/**
 *
 * @author User
 */
public class Escuela {
    private Estudiante[] estudiantes;
    public Escuela() {
    estudiantes = new Estudiante[8];
    estudiantes[0] = new Estudiante("Juan", 7.5);
    estudiantes[1] = new Estudiante("Maria", 8.2);
    estudiantes[2] = new Estudiante("Carlos", 6.9);
    estudiantes[3] = new Estudiante("Ana", 9.0);
    estudiantes[4] = new Estudiante("Pedro", 5.7);
    estudiantes[5] = new Estudiante("Laura", 7.8);
    estudiantes[6] = new Estudiante("Luis", 8.9);
    estudiantes[7] = new Estudiante("Marta", 6.5);
  }

  public double promedioNotas() {
    double suma = 0;
    for (Estudiante e : estudiantes) {
      suma += e.getNota();
    }
    return suma / estudiantes.length;
  }

  public String[] nombresMayoresAlPromedio() {
    double promedio = promedioNotas();
    int contador = 0;
    for (Estudiante e : estudiantes) {
      if (e.getNota() > promedio) {
        contador++;
      }
    }
    String[] nombres = new String[contador];
    int i = 0;
    for (Estudiante e : estudiantes) {
      if (e.getNota() > promedio) {
        nombres[i] = e.getNombre();
        i++;
      }
    }
    return nombres;
  }

  public void mostrarMayoresAlPromedio() {
    double promedio = promedioNotas();
    System.out.println("Estudiantes con nota mayor al promedio:");
    for (Estudiante e : estudiantes) {
      if (e.getNota() > promedio) {
        System.out.println(e.getNombre() + " - " + e.getNota());
      }
    }
  }
}





