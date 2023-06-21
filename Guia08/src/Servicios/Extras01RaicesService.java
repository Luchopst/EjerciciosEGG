/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Extras01Raices;
import java.util.Scanner;

/**
 *
 * @author User
 */
//Método getDiscriminante(): devuelve el valor del
//discriminante (double). El discriminante tiene la 
//siguiente fórmula: (b^2)-4*a*c
public class Extras01RaicesService {

    double discriminante = 0;

    public double getDiscriminante(Extras01Raices R) {
        return Math.pow(R.getB(), 2) - 4 * R.getA() * R.getC();

    }
//Método tieneRaices(): devuelve un booleano indicando 
//si tiene dos soluciones, para que esto ocurra, 
//el discriminante debe ser mayor o igual que 0.

    public boolean tieneRaices(Extras01Raices R) {
        return (getDiscriminante(R) >= 0);
    }

//Método tieneRaiz() devuelve un booleano indicando si 
//tiene una única solución, para que esto ocurra,
//el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Extras01Raices R) {
        return (getDiscriminante(R) == 0);

    }
    //Método obtenerRaices(): llama a tieneRaices()
    //y si devolvió́ true, imprime las 2 posibles soluciones.

    public void obteneRaices(Extras01Raices R) {
        if (tieneRaices(R) == true) {
            System.out.println((-R.getB() + Math.sqrt(getDiscriminante(R))) / (2 * R.getA()));
            System.out.println((-R.getB() - Math.sqrt(getDiscriminante(R))) / (2 * R.getA()));
        } else {
            System.out.println("No hay Solucion valida");
        }
    }
//Método obtenerRaiz(): llama a tieneRaiz() y si 
//devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única 
//solución posible.

    public void obtenerRaiz(Extras01Raices R) {
        if (tieneRaiz(R) == true) {
            System.out.println((-R.getB() + Math.sqrt(getDiscriminante(R))) / (2 * R.getA()));
        } else {
            System.out.println("No hay Solucion valida");
        }
    }

    public void calcular(Extras01Raices R) {
        if (tieneRaiz(R) == true) {
            obtenerRaiz(R);
        } else if (tieneRaices(R) == true) {
            obteneRaices(R);
        } else {
            System.out.println("No existe Solucion");
        }

    }

    public void Ingreso(Extras01Raices R) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese El valor A");
        R.setA(input.nextDouble());
        System.out.println("Ingrese el Valor B");
        R.setB(input.nextDouble());
        System.out.println("Ingrese el valor C");
        R.setC(input.nextDouble());
    }
}
