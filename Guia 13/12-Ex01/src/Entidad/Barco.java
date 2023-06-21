/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Barco {
    
    protected Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected int matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Barco{");
        sb.append("matricula = ").append(matricula);
        sb.append(", eslora = ").append(eslora);
        sb.append(", anioFabricacion = ").append(anioFabricacion);
        sb.append('}');
        return sb.toString();
    }

    public double calcularModulo() {
        return eslora * 10;
    }
    
    public Barco crearBarco(){
        System.out.println("Ingrese la Matricula del Barco");
        matricula = input.nextInt();
        System.out.println("Ingrese la Eslora");
        eslora = input.nextDouble();
        System.out.println("Ingrese el año de Fabricacion");
        anioFabricacion = input.nextInt();
        return new Barco();
    }
    
}
