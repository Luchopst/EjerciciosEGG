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
public final class Yate extends BarcoMotor {

    BarcoMotor bm = new BarcoMotor();
    private int numeroDeCamarotes;

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroDeCamarotes;
    }

    public Yate() {
    }

    public Yate(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public Yate(int numeroDeCamarotes, int cv) {
        super(cv);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public Yate(int numeroDeCamarotes, int cv, int matricula, double eslora, int anioFabricacion) {
        super(cv, matricula, eslora, anioFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
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
        sb.append("Yates{");
        sb.append("numeroDeCamarotes = ").append(numeroDeCamarotes);
        sb.append('}');
        return sb.toString();
    }
    
    public Yate crearYate() {
        super.crearBarcoMotor();
        System.out.println("Ingrese la Cantidad de Camarotes");
        numeroDeCamarotes = input.nextInt();
        return new Yate();
    }
}
