/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.ParDeNumeros;
import Service.ParDeNumerosService;

/**
 *
 * @author User
 */
public class ParDeNumerosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros num = new ParDeNumeros();

        ParDeNumerosService numService = new ParDeNumerosService();

        numService.mostrarValores(num);

        System.out.println("EL NÚMERO MAYOR ES: " + numService.devolverMayor(num));

        System.out.println("LA POTENCIA ES: " + numService.calcularPotencia(num));

        System.out.println("LA RAIZ DEL MENOR ES: " + numService.calculaRaiz(num));

    }

}
