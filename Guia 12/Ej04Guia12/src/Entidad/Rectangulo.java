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
public class Rectangulo implements CalculosFormas {

    protected Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected double base;
    protected double altura;

    @Override
    public double perimetro() {
        System.out.println("Ingrese La Base del rectangulo");
        base = input.nextDouble();
        System.out.println("Ingrese la Altura del Rectangulo");
        altura = input.nextDouble();
        double aux = base * altura;
        System.out.println("El Perimetro del rectangulo es: "+aux);
        return aux;
    }

    @Override
    public double area() {
        double aux = (base * altura) * 2;
        System.out.println("El Area del Rectangulo es : "+aux);
        return aux;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("base = ").append(base);
        sb.append(", altura = ").append(altura);
        sb.append('}');
        return sb.toString();
    }

}
