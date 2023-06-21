/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.ParDeNumeros;

/**
 *
 * @author User
 */
public class ParDeNumerosService {

//    Método mostrarValores que muestra cuáles son 
//    los dos números guardados.
    public void mostrarValores(ParDeNumeros num) {
        System.out.println("Los Numeros Guardados son: " + " " + num.getA() + " " + num.getB());

    }
//    Método devolverMayor para retornar cuál de los 
//    dos atributos tiene el mayor valor

    public double devolverMayor(ParDeNumeros num) {
        return Math.max(num.getA(), num.getB());
    }
//    Método calcularPotencia para calcular la 
//    potencia del mayor valor de la clase elevado 
//    al menor número. Previamente se deben 
//    redondear ambos valores.

    public double calcularPotencia(ParDeNumeros num) {
        double mayor = devolverMayor(num);
        double menor = Math.min(num.getA(), num.getB());
        mayor = Math.round(mayor);
        menor= Math.round(menor);
        System.out.println(" " + mayor + " ");
        return Math.pow(mayor,menor);
    }
//Método devolverMayor para retornar cuál de los 
//dos atributos tiene el mayor valor
   public double calculaRaiz(ParDeNumeros num) {
        double mayor = devolverMayor(num);
        double menor = (mayor == num.getA()) ? num.getB(): num.getA();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
