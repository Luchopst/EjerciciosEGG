/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author User
 */
public class ParDeNumeros {
    private double A;
    private double B;

    public ParDeNumeros() {
        this.A = Math.random()*10;
        this.B = Math.random()*10;
    }

    public ParDeNumeros(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
    
}
