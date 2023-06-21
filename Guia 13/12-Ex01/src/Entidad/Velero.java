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
public class Velero extends Barco{
  
private int numeroDeMastiles;

    @Override
    public double calcularModulo() {  
        return super.calcularModulo()+ numeroDeMastiles;
    }


    public Velero() {
    }

    public Velero(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public Velero(int numeroDeMastiles, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public Velero(int numeroDeMastiles, int matricula, double eslora, int anioFabricacion, String nombre, int dniCliente, int posicionDeAmarre, Barco barcoQueOcupara) {
        super(matricula, eslora, anioFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
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
        sb.append("Veleros{");
        sb.append("numeroDeMastiles = ").append(numeroDeMastiles);
        sb.append('}');
        return sb.toString();
    }
public Velero crearVelero(){
    super.crearBarco();
    System.out.println("Ingrese la Cantidad de Mastiles");
    numeroDeMastiles = input.nextInt();
    return new Velero();
}

}
