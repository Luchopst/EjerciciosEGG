/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07Entidad.Ejercicio06;

import java.util.Scanner;

/**
 *Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, 
 * crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función
 * de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de
 * 30 años o del 5% si tiene menos de 30 años.
 * @author User
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 
//    public void ingresoDatos(){
//        Scanner input = new Scanner(System.in);
//    
//        System.out.println("Ingrese su Salario Actual");
//        double salario =input.nextDouble();
//        System.out.println("Ingrese su antiguedad");
//        int edad = input.nextInt();
//    }
    public void calcularAumento(){
        
        double aumento;
        if (edad >30){
            aumento = salario * 0.1;  
        }else{
            aumento = salario*0.05;
        }
        salario+=aumento;
        
        System.out.println("el Salario Neto del Empleado: "+" "+nombre+" "+" "+edad+" "+" "+" "+salario);
         
    }
   
    
}
