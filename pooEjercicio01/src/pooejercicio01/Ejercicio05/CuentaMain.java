/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio01.Ejercicio05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // ************Instanciación*******       
        Cuenta cj = new Cuenta(100000, "Rodrigo");
        System.out.println("Titular: " + cj.getTitular());
        System.out.println("Saldo: " + cj.getSaldo());

        cj.retirarDinero();

        System.out.println("Su saldo actual es: " + cj.getSaldo());

    }
}
