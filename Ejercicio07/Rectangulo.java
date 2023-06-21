/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07;

/**
 *
 * @author User
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    private double superficie;
    private double perimetro;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2, double superficie, double perimetro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

  //metodos...
    public void CalcularArea(){
        superficie=lado1*lado2;
    }
    public void calcularPerimetro(){
        perimetro=(lado1+lado2)*2;
    }
    
}
