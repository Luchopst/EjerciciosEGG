/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import java.util.ArrayList;

/**El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 *
 * @author User
 */
public class Alumno {
 private ArrayList <String> nombreCompleto = new ArrayList<>();
 private String nombres[]={"ponce","perez","Bulacio","Montiel","Mercado","Arriola","Baez","Garcia"};
 private String apellidos[]={"Luciano","Gabriel","Juan","Dante","Emma","Dylan","Mia","Gisela"};
 private int dni;
 private int cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(int dni, int cantidadDeVotos) {
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public ArrayList<String> getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(ArrayList<String> nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }


 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("nombreCompleto = ").append(nombreCompleto);
        sb.append(", dni = ").append(dni);
        sb.append(", cantidadDeVotos = ").append(cantidadDeVotos);
        sb.append('}');
        return sb.toString();
    }
 
}
