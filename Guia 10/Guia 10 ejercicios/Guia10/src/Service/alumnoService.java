/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class alumnoService {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

    

    public ArrayList<Alumno> crarAlumnos() {
        ArrayList<Alumno> listaux = new ArrayList();
        char respuesta = ' ';
        Integer[] notas = new Integer[3];
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();
            System.out.println("Ingrese la 1° nota del alumno " + nombre);
            notas[0] = sc.nextInt();
            System.out.println("Ingrese la 2° nota del alumno " + nombre);
            notas[1] = sc.nextInt();
            System.out.println("Ingrese la 3° nota del alumno " + nombre);
            notas[2] = sc.nextInt();
            listaux.add(new Alumno(nombre, notas));
            System.out.println("Quiere cargar otro alumno? S/N");
            respuesta = sc.next().toLowerCase().charAt(0);
        } while (respuesta == 's');
        return listaux;
    }

    public int notaFinal(List<Alumno> curso) {
        System.out.println("Ingrese el nombre del alumno que quiere calcular el promedio de notas");
        String buscar = sc.next();
        int notafinal = 0;
        for (Alumno alumno : curso) {
            if (alumno.getNombre().equalsIgnoreCase(buscar)) {
                notafinal = (alumno.getNotas()[0] + alumno.getNotas()[1] + alumno.getNotas()[2]) / alumno.getNotas().length;
            }
        }
        System.out.println("EL promedio es: "+"\n");
        return notafinal;
    }
}
