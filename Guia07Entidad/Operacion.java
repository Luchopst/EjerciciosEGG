/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
   

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero 1 y 2");
        this.numero1 = leer.nextInt();
        this.numero2 = leer.nextInt();
    }        
    public int suma(){
        return this.numero1+this.numero2;
    }
    public int resta(){
        return this.numero1 - this.numero2;
    }
    
    public int multiplicacion() {
        if (this.numero1==0 || this.numero2==0) {
            System.out.println("esto genera un error");
            return 0;
        }
        return this.numero1*this.numero2;
    }
    
    public int division()  {
        if (this.numero1==0 || this.numero2==0) {
            System.out.println("esto genera un error");
            return 0;
        }
        return this.numero1/this.numero2;
    }      
    
    
}
