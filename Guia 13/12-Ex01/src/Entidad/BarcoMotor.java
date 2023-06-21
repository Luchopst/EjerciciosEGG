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
public class BarcoMotor extends Barco {
protected int cv; 

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+cv; 
    }


    public BarcoMotor() {
    }

    public BarcoMotor(int cv) {
        this.cv = cv;
    }

    public BarcoMotor(int cv, int matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public BarcoMotor(int cv, int matricula, double eslora, int anioFabricacion, String nombre, int dniCliente, int posicionDeAmarre, Barco barcoQueOcupara) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
        sb.append("BarcoMotor{");
        sb.append("cv = ").append(cv);
        sb.append('}');
        return sb.toString();
    }
    public BarcoMotor crearBarcoMotor(){
        super.crearBarco();
        System.out.println("Ingrese el cv");
        cv = input.nextInt();
        calcularModulo();
        return new BarcoMotor();
    }

}
