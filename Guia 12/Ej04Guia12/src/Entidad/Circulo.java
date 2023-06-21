/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Circulo implements CalculosFormas {
    protected Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected double radio;
    protected double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("radio = ").append(radio);
        sb.append(", diametro = ").append(diametro);
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public double area() {
        System.out.println("Ingrese el Radio del Circulo");
        radio = input.nextDouble();
        double aux = PI * Math.pow(radio, 2);
        System.out.println("El Area del Circulo es: "+aux);
        return aux;
    }

    @Override
    public double perimetro() {
        diametro = 2 * radio;
        double aux = PI * diametro;
        System.out.println("El Perimetro del Circulo es: "+aux);
        return aux;
    }
}
